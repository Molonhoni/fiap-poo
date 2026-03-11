package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipalPassageiro {

    public static void main(String[] args) {

        // Criando passageiros com construtor
        Passageiro passageiro1 = new Passageiro("Ana Silva", "123.456.789-00");
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "987.654.321-00");

        System.out.println("--- Sistema FiapRide ---");

        // Adicionando saldo
        passageiro1.adicionarSaldo(50);
        passageiro2.adicionarSaldo(12.50);

        // Pagando viagem
        passageiro1.pagarViagem(20);
        passageiro2.pagarViagem(15); // Deve dar erro de saldo insuficiente

        // Exibindo dados finais
        System.out.println("\n--- Dados Finais ---");
        System.out.println("Passageiro: " + passageiro1.getNome() +
                " | CPF: " + passageiro1.getCpf() +
                " | Saldo: R$" + passageiro1.getSaldo());

        System.out.println("Passageiro: " + passageiro2.getNome() +
                " | CPF: " + passageiro2.getCpf() +
                " | Saldo: R$" + passageiro2.getSaldo());
    }
}