package Jogo;

import java.util.Scanner;

import Jogo.joguim.Jogo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de jogadores e o número de casas na trilha
        System.out.print("Número de jogadores: ");
        int numJogadores = scanner.nextInt();

        System.out.print("Número de casas na trilha: ");
        int numCasas = scanner.nextInt();

        // Cria um objeto de jogo
        Jogo jogo = new Jogo(numJogadores, numCasas);

        // Adiciona armadilhas à trilha (você pode personalizar as posições das armadilhas)
        jogo.addArmadilha(5);
        jogo.addArmadilha(15);
        jogo.addArmadilha(25);
    }
}
