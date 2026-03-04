package br.com.fiapride.main;

import br.com.fiapride.model.Mouse;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        mouse.cor = "Branco";
        mouse.marca = "Logitech";
        mouse.nivelBateria = 50;

        System.out.println("--- Status Inicial ---");
        System.out.println("Bateria: " + mouse.nivelBateria + "%");

        System.out.println("\n--- Teste Válido ---");
        mouse.usar(20);
        mouse.carregar(30);

        System.out.println("\n--- Teste Inválido ---");
        mouse.usar(200);   // bateria insuficiente
        mouse.carregar(-5); // carga inválida
    }
}