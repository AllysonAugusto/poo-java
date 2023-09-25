package Personagem;
public class Personagem {

//Atributos
//-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    String nome;
    int forca;
    String habilidade;
//-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-


    // Método para exibir detalhes do personagem
    void exibirDetalhes() {
        System.out.printf("O personagem %s tem %d de força e habilidade %s%n", nome, forca, habilidade);
    }

    // Método para atacar um alvo (com ou sem habilidade)
    void atacar(String alvo) {
        System.out.format("%s atacou %s e causou algum dano%n", nome, alvo);
    }

    void atacar(String alvo, String habilidade) {
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou algum dano%n", nome, alvo);
        } else {
            System.out.format("%s usou '%s' contra %s e causou algum dano%n", nome, habilidade, alvo);
        }
    }
}