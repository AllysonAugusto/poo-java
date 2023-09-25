package Pula_Pula;
import java.util.ArrayList;
import java.util.List;

public class Parquinho {
    private List<Crianca> filaDeEspera; // Lista de crianças na fila de espera
    private List<Crianca> pulaPula;     // Lista de crianças dentro do pula-pula

    public Parquinho() {
        filaDeEspera = new ArrayList<>();
        pulaPula = new ArrayList<>();
    }

    // Método para adicionar uma criança à fila de espera
    public void adicionarCriancaNaFila(Crianca crianca) {
        filaDeEspera.add(crianca);
        System.out.println(crianca.getNome() + " foi adicionado à fila de espera.");
    }

    // Método para mover a próxima criança da fila de espera para o pula-pula
    public void moverProximaCriancaParaPulaPula() {
        if (!filaDeEspera.isEmpty()) {
            Crianca proximaCrianca = filaDeEspera.remove(0); // Remove a primeira criança da fila de espera
            pulaPula.add(proximaCrianca);                    // Adiciona a criança ao pula-pula
            System.out.println(proximaCrianca.getNome() + " entrou no pula-pula.");
        } else {
            System.out.println("A fila de espera está vazia. Não há crianças para mover para o pula-pula.");
        }
    }

    // Método para mover a primeira criança do pula-pula de volta para a fila de espera
    public void moverPrimeiraCriancaDoPulaPulaParaFila() {
        if (!pulaPula.isEmpty()) {
            Crianca primeiraCrianca = pulaPula.remove(0);    // Remove a primeira criança do pula-pula
            filaDeEspera.add(primeiraCrianca);               // Adiciona a criança de volta à fila de espera
            System.out.println(primeiraCrianca.getNome() + " saiu do pula-pula e entrou na fila de espera.");
        } else {
            System.out.println("O pula-pula está vazio. Não há crianças para mover para a fila de espera.");
        }
    }
}


