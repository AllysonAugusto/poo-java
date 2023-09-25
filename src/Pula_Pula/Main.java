package Pula_Pula;

public class Main {
    public static void main(String[] args) {
        Parquinho parquinho = new Parquinho();

        // Adicionando crianças à fila de espera
        parquinho.adicionarCriancaNaFila(new Crianca("Alice"));
        parquinho.adicionarCriancaNaFila(new Crianca("Bob"));
        parquinho.adicionarCriancaNaFila(new Crianca("Carol"));

        // Movendo uma criança para o pula-pula
        parquinho.moverProximaCriancaParaPulaPula();

        // Movendo a primeira criança do pula-pula de volta para a fila de espera
        parquinho.moverPrimeiraCriancaDoPulaPulaParaFila();
    }
}
    

