package Fila_de_Atendimento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Classe que representa o mercantil
public class Mercantil {
    private List<Client> caixas; // Lista de caixas (representada como ArrayList)
    private List<Client> filaDeEspera; // Fila de espera (representada como LinkedList)

    // Construtor para inicializar o mercantil com um número específico de caixas
    public Mercantil(int numCaixas) {
        caixas = new ArrayList<>(numCaixas); // Inicializa a lista de caixas
        filaDeEspera = new LinkedList<>(); // Inicializa a fila de espera
    }

    // Método para um cliente entrar na fila de espera
    public void entrar(Client cliente) {
        filaDeEspera.add(cliente); // Adiciona o cliente à fila de espera
    }

    // Método para chamar um cliente para um caixa disponível
    public void chamarNoCaixa() {
        if (!filaDeEspera.isEmpty()) {
            Client cliente = filaDeEspera.remove(0); // Remove o primeiro cliente da fila de espera
            for (int i = 0; i < caixas.size(); i++) {
                if (caixas.get(i) == null) { // Se não há nenhum cliente atendendo esse caixa.
                    caixas.set(i, cliente); // O cliente vai para o caixa vazio.
                    System.out.println("Cliente " + cliente.getNome() + " chamado para o caixa " + (i + 1));
                    return;
                }
            }
            System.out.println("Todos os caixas estão ocupados. Cliente " + cliente.getNome() + " aguardando na fila");
        } else {
            System.out.println("A fila de espera está vazia.");
        }
    }

    // Método para finalizar o atendimento em um caixa específico
    public void finalizarAtendimento(int caixaIndex) {
        if (caixaIndex >= 0 && caixaIndex < caixas.size() && caixas.get(caixaIndex) != null) {
            Client cliente = caixas.get(caixaIndex); // Obtém o cliente que estava sendo atendido no caixa especificado
            caixas.set(caixaIndex, null); // O caixa está pronto para atender o próximo cliente
            System.out.println("Atendimento finalizado no caixa " + (caixaIndex + 1) + " para o cliente " + cliente.getNome());
            chamarNoCaixa(); // Chama o próximo cliente da fila, se houver
        } else {
            System.out.println("Caixa inválido ou vazio.");
        }
    }
}
