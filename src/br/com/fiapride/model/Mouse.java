package br.com.fiapride.model;

public class Mouse {

    // Atributos privados
    private String cor;
    private String marca;
    private int nivelBateria;

    // CONSTRUTOR
    // Todo mouse precisa ter cor, marca e bateria inicial
    public Mouse(String cor, String marca, int nivelBateria) {
        this.setCor(cor);
        this.setMarca(marca);
        this.setNivelBateria(nivelBateria); // regra de negócio aplicada
    }

    // get
    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getNivelBateria() {
        return this.nivelBateria;
    }

    // set
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // nível de bateria só entre 0 e 100
    private void setNivelBateria(int valor) {
        if (valor >= 0 && valor <= 100) {
            this.nivelBateria = valor;
        } else {
            System.out.println("Erro de Segurança: Nível de bateria inválido!");
        }
    }

    // Usar e carregar
    public void usar(int consumo) {

        if (consumo <= 0) {
            System.out.println("Consumo inválido.");
            return;
        }

        if (this.nivelBateria < consumo) {
            System.out.println("Bateria insuficiente.");
            return;
        }

        this.setNivelBateria(this.nivelBateria - consumo);

        System.out.println("Mouse usado. Bateria atual: " + this.nivelBateria + "%");
    }

    public void carregar(int carga) {

        if (carga <= 0) {
            System.out.println("Carga inválida.");
            return;
        }

        if (this.nivelBateria + carga > 100) {
            this.setNivelBateria(100);
        } else {
            this.setNivelBateria(this.nivelBateria + carga);
        }

        System.out.println("Mouse carregado. Bateria atual: " + this.nivelBateria + "%");
    }

}