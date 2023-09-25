package Lapiseira;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a suavidade do grafite (1 para HB, 2 para 2B, 4 para 4B, 6 para 6B): ");
        int suavidade = scanner.nextInt();

        System.out.println("Digite a quantidade de folhas a serem escritas: ");
        int folha = scanner.nextInt();

        Lapis lapis = new Lapis ();

        lapis.escreverFolha (suavidade, folha);










    }
}
