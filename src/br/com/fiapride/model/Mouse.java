package br.com.fiapride.model;


public class Mouse {
    // Atributos (Características)
    public String cor;
    public String marca;
    public int nivelBateria;

    // Método 1 - Usar mouse (diminui bateria)
    public void usar(int consumo) {

        if (consumo <= 0) {
            System.out.println("Consumo inválido.");
            return;
        }

        if (nivelBateria < consumo) {
            System.out.println("Bateria insuficiente.");
            return;
        }

        nivelBateria -= consumo;
        System.out.println("Mouse usado. Bateria atual: " + nivelBateria + "%");
    }

    // Método 2 - Carregar mouse (aumenta bateria)
    public void carregar(int carga) {

        if (carga <= 0) {
            System.out.println("Carga inválida.");
            return;
        }

        if (nivelBateria + carga > 100) {
            nivelBateria = 100;
        } else {
            nivelBateria += carga;
        }

        System.out.println("Mouse carregado. Bateria atual: " + nivelBateria + "%");
    }
}