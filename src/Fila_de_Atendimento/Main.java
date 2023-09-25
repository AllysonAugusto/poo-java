package Fila_de_Atendimento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos caixas deseja criar? ");
        int numCaixas = scanner.nextInt();

        Mercantil mercantil = new Mercantil(numCaixas);

        while (true){
            System.out.println("/nOpções: ");
            System.out.println("1. Cliente entra na fila");
            System.out.println("2. Chamar cliente para o caixa");
            System.out.println("3. Finalizar atendimento em um caixa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Digite o número do cliente: ");
                    String nomeCliente = scanner.next(); 
                    Client cliente = new Client (nomeCliente); //o novo cliente é criado com o nome que o usuário digitou.
                    mercantil.entrar(cliente); //está sendo colocado na fila de espera para ser atendido posteriormente.
                    break;
                case 2:
                    mercantil.chamarNoCaixa();
                    break;
                case 3:
                    System.out.print("Digite o número do caixa a ser finalizado: ");
                    int caixaIndex = scanner.nextInt(); // armazena o valor digitado na variável caixaIndex
                    mercantil.finalizarAtendimento(caixaIndex - 1);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
