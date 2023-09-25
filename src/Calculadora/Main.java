package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora de Divisão iniciada!");
    

    boolean continuar = true; //variável para controlar o loop do menu interativo
        
        while (continuar) { // Loop para continuar interagindo com o animal
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular bateria");
            System.out.println("2 - Mostrar bateria");
            System.out.println("3 - Recarregar bateria");
            System.out.println("4 - Somar");
            System.out.println("5 - Subtrair");
            System.out.println("6 - Dividir");
            System.out.println("7 - Multiplicar");
            System.out.println("8 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) { // Estrutura de decisão baseada na opção escolhida
                case 1:
                    Calculadora.CalculadoraBateria(); // Chama o método Calcular bateria
                    break;
                case 2:
                    Calculadora.mostrarBateria(); // Chama o método para envelhecer o animal
                    break;
                case 3:
                    Calculadora.recarregarBateria(); // Chama o método recarregar bateria
                case 4:
                    Calculadora.somar (opcao);
                case 8:
                    continuar = false; // Altera a variável para sair do loop
                    break;
                default:
                    System.out.println("Opção inválida!"); // Mensagem para opções inválidas
            }
        }

        System.out.println("Programa encerrado.");
    }
}


