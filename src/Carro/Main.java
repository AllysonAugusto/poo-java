package Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma instância da classe CarroEsportivo
        CarroEsportivo carro = new CarroEsportivo();

        System.out.println("Carro esportivo criado!");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Embarcar pessoa");
            System.out.println("2. Desembarcar pessoa");
            System.out.println("3. Abastecer");
            System.out.println("4. Dirigir");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (carro.embarcar()) {
                        System.out.println("Passageiro embarcado.");
                    } else {
                        System.out.println("Limite de passageiros atingido, não é possível embarcar mais pessoas.");
                    }
                    break;
                case 2:
                    carro.desembarcar();
                    break;
                case 3:
                    System.out.print("Quantos litros deseja abastecer? ");
                    int litros = scanner.nextInt();
                    carro.abastecer(litros);
                    break;
                case 4:
                    carro.dirigir();
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
