package Lapiseira_Array;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o calibre da lapiseira: ");
    float calibre = scanner.nextFloat();
    Lapiseira lapiseira = new Lapiseira(calibre);

    while (true) {
        System.out.println("\nOpções:");
        System.out.println("1. Inserir Grafite");
        System.out.println("2. Puxar Grafite");
        System.out.println("3. Remover Grafite");
        System.out.println("4. Escrever na Folha");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o calibre do grafite: ");
                float grafiteCalibre = scanner.nextFloat();
                System.out.print("Digite a dureza do grafite (HB, 2B, 4B, 6B): ");
                String dureza = scanner.next();
                System.out.print("Digite o tamanho do grafite em mm: ");
                int tamanho = scanner.nextInt();
                lapiseira.inserirGrafite(grafiteCalibre, dureza, tamanho);
                break;
            case 2:
                lapiseira.puxarGrafite();
                break;
            case 3:
                lapiseira.removerGrafite();
                break;
            case 4:
                System.out.print("Digite o número de folhas a escrever: ");
                int numFolhas = scanner.nextInt();
                lapiseira.escreverNaFolha(numFolhas);
                break;
            case 5:
                System.out.println("Encerrando o programa.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
}