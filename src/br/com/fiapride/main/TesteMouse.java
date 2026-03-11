package br.com.fiapride.main;

import br.com.fiapride.model.Mouse;

public class TesteMouse {

    public static void main(String[] args) {

        // Criando o objeto
        Mouse mouse = new Mouse("Branco", "Logitech", 50);

        System.out.println("--- Status Inicial ---");
        System.out.println("Cor: " + mouse.getCor());
        System.out.println("Marca: " + mouse.getMarca());
        System.out.println("Bateria: " + mouse.getNivelBateria() + "%");

        System.out.println("\n--- Teste Válido ---");
        mouse.usar(20);   // bateria vai para 30%
        mouse.carregar(30); // bateria vai para 60%

        System.out.println("\n--- Teste Inválido ---");
        mouse.usar(200);   // bateria insuficiente
        mouse.carregar(-5); // carga inválida

    }
}