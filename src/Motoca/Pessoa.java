package Motoca;

public class Pessoa {
    private String name; 
    private int idade;

    public Pessoa (String name, int idade){// Inicialização do atributo "nome" com o valor passado como parâmetro.
        this.name = name;// Inicialização do atributo "nome" com o valor passado como parâmetro.
        this.idade = idade; // Inicialização do atributo "idade" com o valor passado como parâmetro.

    }

    public String getNome(){// Método para obter o valor do atributo "nome".
        return name;

}

    public int getIdade(){// Método para obter o valor do atributo "idade".
        return idade;
}

}


