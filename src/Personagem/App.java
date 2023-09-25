package Personagem;
public class App {
    public static void main(String[] args) throws Exception {

        Personagem heroi = new Personagem(); //Instanciando, onde posso mexer nos atributos
        heroi.nome = "Hercules";
        heroi.forca = 23;
        heroi.habilidade = "Espada Flamejante";

        heroi.exibirDetalhes(); // Chamando o novo método exibirDetalhes da instância heroi
        heroi.atacar("Hydra");  // Chamando método de atacar e passando o alvo
        heroi.atacar("Cerberus", "Impacto Trovejante");  // Chamando método de atacar com habilidade
    }
}