package Fila_de_Atendimento;

// Importa as classes necessárias para trabalhar com listas
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Classe que representa um cliente
public class Client {
    private String nome;  // Declaração do campo privado para armazenar o nome do cliente

    // Construtor que recebe o nome do cliente e o atribui ao campo 'nome'
    public Client(String nome) {
        this.nome = nome;
    }

    // Método público para obter o nome do cliente
    public String getNome() {
        return nome;
    }
}
