package br.com.fiapride.main;


import br.com.fiapride.model.Mouse;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Mouse Mouse = new Mouse();
        Mouse.cor = "Branca";
        Mouse.marca = "Logitech";
        Mouse.nivelBateria = 78;



        // Exibindo os dados no Console
        System.out.println("--- Mouse ---");
        System.out.println("Cor: " + Mouse.cor + " | Marca: " + Mouse.marca + " | Nível da bateria: " + Mouse.nivelBateria + "%" );

    }
}