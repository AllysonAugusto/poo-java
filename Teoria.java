

/*
import java.util.Scanner;
public class Teoria {
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);
        String str;
        str = texto.nextLine();
        System.out.println("Bem-vindos: " + str);

        System.out.println("Digite um número:");
        int numero = texto.nextInt();
        System.out.println("O número digitado foi: " + numero);
        texto.close();
    }
}


/*-------------------------Declaração e Uso de Constantes--------------------------------
- Não pode mais ser alterado durante a execução
- Pode ser usado private, public e static 
- Boa prática: Declarar sempre uma constante usando apenas letras maiúsculas.
	ex: NOME_CLIENTE , TELEFONE_1

ex: public static final int TAXA = 10;



import java.util.Scanner;
public class Teoria{
	private static final double LARGURA = 10.0; //constante que toda vez que eu for usar a variável LARGURA, eu vou usar 10.0 (regra)
	
	public static void main (String[] args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Entre com o comprimento: ");
		double compr = entrada.nextDouble();
		
		double area = calculaArea (LARGURA, compr); //método (função que ecebe a LARGURA, compr que vai ser retornado em 'area') para calcular area
		System.out.println ("A área é:" +area);
	}
	
	private static double calculaArea (double largura, double comprimento)
	return largura *comprimento;
	}
}


-----------------------OPERADORES--------------------------------
- Simbolos especiais que permitem realizar operações 
1. =
2. += 
3. -= 
4. *=
5. /=
6. %= 

public static void main (String[] args){
    int num = 0;
    System.out.println("Valor original: " + num);
    num += 3;

}



---------------------Criando Classes e Objetos em Java--------------------------------

criar objetos. Ela define os atributos (variáveis) e métodos (funções) que os objetos desse tipo terão.

// Definição da Classe
class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Método para exibir informações do carro
    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

// Classe principal (contendo o método main)
public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.marca = "Ford";
        carro2.modelo = "Mustang";
        carro2.ano = 2023;

        // Chamando o método para exibir informações dos carros
        System.out.println("Carro 1:");
        carro1.exibirInfo();

        System.out.println("\nCarro 2:");
        carro2.exibirInfo();
    }
}

---------------------Visibilidade em um Objeto--------------------------------
- Indica o nível de acesso aos componentes

// Arquivo: Pessoa.java
public class Pessoa {
    public String nome;
    protected int idade;
    int altura; // Visibilidade padrão
    private String cpf;

    public Pessoa(String nome, int idade, int altura, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.cpf = cpf;
    }

    protected void saudacao() {
        System.out.println("Olá, eu sou " + nome);
    }

    void apresentacao() {
        System.out.println("Tenho " + idade + " anos e " + altura + " cm de altura.");
    }

    private void exibirCpf() {
        System.out.println("CPF: " + cpf);
    }
}


--------------MÉTODO--------------------------------

// Exemplo em Cliente
public void mostrarInformacoes() {
    System.out.println("CLIENTE");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Renda: " + renda);
}

// Exemplo em Curso
public void mostrarInformacoes() {
    System.out.println("CURSO");
    System.out.println("Nome: " + nome);
    System.out.println("Duração: " + duracao);
    System.out.println("Valor: " + valor);
}

--------------ENCAPSULAMENTO--------------------------------

 // Método getter para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Método setter para definir a idade da pessoa
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");

    // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa("Alice", 25);

        // Usando o método getter para obter o nome da pessoa
        System.out.println("Nome da pessoa: " + pessoa.getNome());

        // Usando o método setter para definir um novo nome
        pessoa.setNome("Bob");

        // Usando o método getter para obter a nova idade
        System.out.println("Nome atualizado: " + pessoa.getNome());

        // Usando o método setter para definir uma idade inválida
        pessoa.setIdade(-5);

        // Usando o método getter para obter a idade atualizada
        System.out.println("Idade atualizada: " + pessoa.getIdade());
    }
}



--------------CONSTRUTORES--------------------------------

// Exemplo em Cliente
public Cliente(String nome, int idade, double renda) {
    this.nome = nome;
    this.idade = idade;
    this.renda = renda;
}

// Exemplo em Curso
public Curso(String nome, int duracao, double valor) {
    this.nome = nome;
    this.duracao = duracao;
    this.valor = valor;
}

--------------HERANÇA--------------------------------

public class Entidade {
    // Métodos comuns a todas as entidades
    public void mostrarInformacoes() {
        // Implementação comum
    }
}

public class Cliente extends Entidade {
    // Atributos e métodos específicos de Cliente
}

public class Curso extends Entidade {
    // Atributos e métodos específicos de Curso
}

-----------------------ARRAYS--------------------------------
        // Declaração e criação de um array de inteiros com tamanho 5
        int[] meuArray = new int[5];

        // Atribuição de valores aos elementos do array
        meuArray[0] = 10;
        meuArray[1] = 20;
        meuArray[2] = 30;
        meuArray[3] = 40;
        meuArray[4] = 50;

        // Acessando e imprimindo elementos do array
        System.out.println("Elemento no índice 0: " + meuArray[0]);
        System.out.println("Elemento no índice 2: " + meuArray[2]);
        System.out.println("Elemento no índice 4: " + meuArray[4]);
    }
}

Ex2:

        // Criando um array de objetos Pessoa com tamanho 3
        Pessoa[] pessoas = new Pessoa[3];

        // Inicializando os objetos do array
        pessoas[0] = new Pessoa("Alice", 25);
        pessoas[1] = new Pessoa("Bob", 30);
        pessoas[2] = new Pessoa("Carol", 28);

        // Usando um loop for para percorrer o array e imprimir informações sobre cada pessoa
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome: " + pessoas[i].getNome());
            System.out.println("Idade: " + pessoas[i].getIdade());
            System.out.println();
        }
    }
}



Ex3: 

public class Pessoa {
    // Atributos da classe Pessoa
    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para obter a idade da pessoa
    public int getIdade() {
        return idade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um array de objetos da classe Pessoa
        Pessoa[] pessoas = new Pessoa[3];

        // Inicializando os objetos do array
        pessoas[0] = new Pessoa("Alice", 25);
        pessoas[1] = new Pessoa("Bob", 30);
        pessoas[2] = new Pessoa("Carol", 28);

        // Iterando sobre o array e imprimindo informações
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println();
        }
    }
}



///--------------ARRAY LIST ---------------- ///

import java.util.ArrayList;  // Importa a classe ArrayList do pacote java.util

public class ExemploArrayList {
    public static void main(String[] args) {
        // Declara e cria um ArrayList de Inteiros
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // Adiciona elementos ao ArrayList
        listaNumeros.add(10);   // Adiciona o número 10 ao final da lista
        listaNumeros.add(20);   // Adiciona o número 20 ao final da lista
        listaNumeros.add(30);   // Adiciona o número 30 ao final da lista

        // Acessando elementos do ArrayList
        int primeiroElemento = listaNumeros.get(0);  // Obtém o primeiro elemento (índice 0)
        int segundoElemento = listaNumeros.get(1);  // Obtém o segundo elemento (índice 1)

        // Atualizando elementos do ArrayList
        listaNumeros.set(1, 25);  // Define o segundo elemento como 25 (substitui o valor 20)

        // Removendo elementos do ArrayList
        listaNumeros.remove(0);   // Remove o primeiro elemento (índice 0)

        // Verificando o tamanho do ArrayList
        int tamanhoDaLista = listaNumeros.size();  // Retorna o tamanho da lista (número de elementos)

        // Verificando se o ArrayList está vazio
        boolean estaVazio = listaNumeros.isEmpty();  // Retorna true se a lista estiver vazia, caso contrário, retorna false

        // Iterando (percorrendo) os elementos do ArrayList
        for (int i = 0; i < listaNumeros.size(); i++) {
            int elemento = listaNumeros.get(i);
            System.out.println("Elemento " + i + ": " + elemento);
        }

        // Limpando (removendo todos os elementos) do ArrayList
        listaNumeros.clear();

        // Verificando se o ArrayList está vazio novamente após a limpeza
        estaVazio = listaNumeros.isEmpty();  // Deve retornar true, pois a lista está vazia
    }
}


*/