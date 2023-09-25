package Jogo;

import java.util.Scanner;
import java.util.Locale;
public class joguim {

// Definição da classe Jogo
class Jogo {
    // Declaração de variáveis de instância da classe Jogo
    private int numJogadores;       // Número de jogadores
    private int[] armadilha;        // Array para armazenar as posições das armadilhas
    private int[] posicao;          // Array para armazenar as posições dos jogadores
    private boolean[] podeJogar;    // Array para indicar se os jogadores podem jogar nesta rodada
    private int numArmadilha = 0;   // Contador de armadilhas adicionadas
    private int numCasas;           // Número total de casas na trilha
    private int prox;               // Variável para controlar a vez dos jogadores
    private boolean fimDoJogo = false;  // Indica se o jogo terminou ou não

    // Construtor da classe Jogo para inicializar o jogo com o número de jogadores e casas
    public Jogo(int numJogadores, int numCasas) {
        this.numJogadores = numJogadores;
        this.numCasas = numCasas;
        this.armadilha = new int[3];   // Inicializa um array para as posições das armadilhas
        this.posicao = new int[numJogadores];  // Inicializa um array para as posições dos jogadores
        this.podeJogar = new boolean[numJogadores];  // Inicializa um array para indicar se os jogadores podem jogar
        this.prox = 0;   // Inicializa a variável para controlar a vez dos jogadores
    }

    // Método para adicionar uma armadilha à trilha
    public void addArmadilha(int t) {
        if (numArmadilha < 3) {
            armadilha[numArmadilha] = t;  // Adiciona a posição da armadilha ao array
            numArmadilha++;  // Incrementa o contador de armadilhas adicionadas
        }
    }

    // Método para mover o jogador com base nos dados d1 e d2
    public void addMove(int d1, int d2) {
        if (fimDoJogo) {
            System.out.println("O jogo já acabou.");  // Mensagem se o jogo já terminou
            return;
        }

        int jogadorAtual = prox % numJogadores;  // Calcula o índice do jogador atual
        int movimento = d1 + d2;  // Calcula a quantidade de casas a mover

        // Verifica se o jogador pode jogar (não está em uma rodada de armadilha)
        if (!podeJogar[jogadorAtual]) {
            System.out.println("Jogador " + jogadorAtual + " não pode jogar nesta rodada.");  // Mensagem se o jogador não pode jogar
            prox++;  // Passa para o próximo jogador
            return;
        }

        // Move o jogador na trilha
        posicao[jogadorAtual] += movimento;

        // Verifica se o jogador caiu em uma armadilha
        for (int i = 0; i < numArmadilha; i++) {
            if (posicao[jogadorAtual] == armadilha[i]) {
                System.out.println("Jogador " + jogadorAtual + " caiu em uma armadilha. Ele não jogará na próxima rodada.");
                podeJogar[jogadorAtual] = false;  // O jogador não pode jogar na próxima rodada
                prox++;  // Passa para o próximo jogador
                return;
            }
        }

        // Verifica se o jogador venceu o jogo
        if (posicao[jogadorAtual] >= numCasas) {
            System.out.println("Jogador " + jogadorAtual + " venceu o jogo!");  // Mensagem se o jogador venceu
            fimDoJogo = true;  // O jogo acabou
        }

        prox++;  // Passa para o próximo jogador
    }

    // Método para representar o estado atual do jogo em uma string
    public String toString() {
        StringBuilder result = new StringBuilder();

        // Adiciona informações sobre a posição dos jogadores
        for (int i = 0; i < numJogadores; i++) {
            result.append("Jogador ").append(i).append(" está na casa ").append(posicao[i]).append("\n");
        }

        // Adiciona informações sobre as armadilhas
        result.append("Armadilhas nas casas: ");
        for (int i = 0; i < numArmadilha; i++) {
            result.append(armadilha[i]);
            if (i < numArmadilha - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}
}

