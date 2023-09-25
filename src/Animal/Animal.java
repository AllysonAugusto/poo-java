package Animal;

import java.util.Scanner; // Importa a classe Scanner para receber entrada do usuário

class Animal {
    private static String especie;
    private static String som;
    private static int idade;

    public Animal(String especie, String som) { // Construtor para inicializar a espécie e o som do animal
        this.especie = especie; // Atribui o valor passado como parâmetro para o atributo "especie"
        Animal.som = som; // Atribui o valor passado como parâmetro para o atributo "som"
        Animal.idade = 0; // Inicializa a idade do animal como 0
    }

    public static void fazerBarulho() { // Método para fazer o animal emitir um som
        System.out.println(som); // Imprime o som do animal
    }

    public static void envelhecer() { // Método para envelhecer o animal
        if (idade < 4) { // Verifica se a idade é menor que 4
            idade++; // Incrementa a idade do animal
            switch (idade) { // Verifica o valor da idade para exibir uma mensagem de acordo com o estágio
                case 1:
                    System.out.println(especie + " agora é uma criança."); // Mensagem para idade 1
                    break;
                case 2:
                    System.out.println(especie + " agora é um adulto."); // Mensagem para idade 2
                    break;
                case 3:
                    System.out.println(especie + " agora é um idoso."); // Mensagem para idade 3
                    break;
                default:
                    System.out.println(especie + " está morto. RIP."); // Mensagem para idade 4 (ou mais)
            }
        } else {
            System.out.println(especie + " já está morto. RIP."); // Mensagem para quando o animal está morto
        }
    }
}