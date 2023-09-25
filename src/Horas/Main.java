package Horas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
    
    System.out.println("Digite a hora: ");
    int hour = scanner.nextInt();

    System.out.println("Digite o minuto: ");
    int minute = scanner.nextInt();

    System.out.println("Digite o segundo: ");
    int second = scanner.nextInt();

// Crie o objeto "Relogio" com os valores lidos a partir da entrada
    Time relogio = new Time(hour, minute, second);

        // Chame o método para imprimir a hora
        relogio.imprimindoHora();
    }
}
