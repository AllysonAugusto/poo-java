package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //-----Scanner----//
        Scanner scanner = new Scanner (System.in);// Cria um objeto Scanner para ler entrada do usuário
        
        System.out.println("Digite a espécie do animal: ");
        String especie = scanner.nextLine();// Lê a espécie digitada pelo usuário
        System.out.println("Digite a idade do animal: ");
        int idade = scanner.nextInt();// Lê a idade digitada pelo usuário

        
        //-----Object----//
        Animal gato = new Animal("Gato", "Miau!"); // Cria um objeto Animal representando um gato
        Animal cachorro = new Animal("Cachorro", "Au au!"); // Cria um objeto Animal representando um cachorro

        
        boolean continuar = true;//variável para controlar o loop do menu interativo
        
        while (continuar) { // Loop para continuar interagindo com o animal
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Fazer barulho");
            System.out.println("2 - Envelhecer");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) { // Estrutura de decisão baseada na opção escolhida
                case 1:
                    Animal.fazerBarulho(); // Chama o método para o animal fazer barulho
                    break;
                case 2:
                    Animal.envelhecer(); // Chama o método para envelhecer o animal
                    break;
                case 3:
                    continuar = false; // Altera a variável para sair do loop
                    break;
                default:
                    System.out.println("Opção inválida!"); // Mensagem para opções inválidas
            }
        }

        System.out.println("Programa encerrado.");
    }
}