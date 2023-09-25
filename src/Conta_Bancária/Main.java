package Conta_Bancária;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cria duas contas bancárias
        System.out.print("Digite o nome do titular da primeira conta: ");
        String titular1 = scanner.nextLine();
        Conta conta1 = new Conta();

        System.out.print("Digite o nome do titular da segunda conta: ");
        String titular2 = scanner.nextLine();
        Conta conta2 = new Conta();

        // Menu de operações
        int opcao;
        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar na primeira conta");
            System.out.println("2. Depositar na segunda conta");
            System.out.println("3. Sacar da primeira conta");
            System.out.println("4. Sacar da segunda conta");
            System.out.println("5. Transferir da primeira conta para a segunda conta");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado na primeira conta: ");
                    double valorDeposito1 = scanner.nextDouble();
                    conta1.depositar(valorDeposito1);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado na segunda conta: ");
                    double valorDeposito2 = scanner.nextDouble();
                    conta2.depositar(valorDeposito2);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado da primeira conta: ");
                    double valorSaque1 = scanner.nextDouble();
                    conta1.sacar(valorSaque1);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser sacado da segunda conta: ");
                    double valorSaque2 = scanner.nextDouble();
                    conta2.sacar(valorSaque2);
                    break;
                case 5:
                    System.out.print("Digite o valor a ser transferido da primeira conta para a segunda conta: ");
                    double valorTransferencia = scanner.nextDouble();
                    conta1.transfere(conta2, valorTransferencia);
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    // Encerra o loop e o programa
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
