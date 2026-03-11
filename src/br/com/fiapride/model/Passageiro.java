package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;


    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }

    // Para criar um passageiro, agora é OBRIGATÓRIO informar nome e cpf.
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0); // Todo mundo começa com zero!
    }

    // Método para PEGAR o saldo (Leitura)
    public double getSaldo() {
        return this.saldo; // Apenas devolve o valor, não altera nada.
    }

    // Método para DEFINIR o saldo (Escrita com Regra de Negócio!)
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    // Faça o mesmo para o nome (sem regras complexas por enquanto)
    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    // Faça o mesmo para o cpf (sem regras complexas por enquanto)
    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}