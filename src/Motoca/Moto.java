package Motoca;

public class Moto {
    private int potencia;         // Declaração do atributo "potencia" da Moto.
    private int minutos;          // Declaração do atributo "minutos" da Moto.
    private Pessoa motorista;     // Declaração do atributo "motorista" da Moto.

    public Moto() {
        this.potencia = 1;         // Inicialização da potência da Moto com 1.
        this.minutos = 0;          // Inicialização dos minutos com 0.
        this.motorista = null;     // Inicialização do motorista como nulo, ou seja, não há motorista no início.
    }

    public boolean subir(Pessoa pessoa) {
        if (motorista == null) {     // Verifica se não há ninguém na moto.
            motorista = pessoa;      // Atribui a pessoa como motorista.
            return true;             // Retorna verdadeiro para indicar que a pessoa subiu com sucesso.
        }
        return false;                // Retorna falso se já houver alguém na moto.
    }

    public boolean descer() {
        if (motorista != null) { // Verifica se há alguém na moto
            motorista = null; // Remove o motorista (a pessoa desce da moto).
            System.out.println("O motorista desceu com sucesso!");
            return true;
        
        }
        return false; //Retorna falso se não houver ninguém na moto.
    }

    public void comprarTempo (int minutos){
        this.minutos += minutos; // Adiciona os minutos comprados ao tempo total.
    }

    public void dirigirTempo (){
        if (motorista != null && minutos > 0 && motorista.getIdade() <= 10){ //Se houver uma pessoa com 10 anos ou menos e houver minutos, então ela pode passear de moto.
            int minutosDirigidos = Math.min(minutos, 30);  // Calcula os minutos dirigidos, no máximo 30 minutos permitidos para crianças.
            minutos -= minutosDirigidos; // Reduz os minutos disponíveis.    
            System.out.println(motorista.getNome() + "Dirigiu por" + minutosDirigidos + "minutos.");
        }
    }

    public void buzinar (){
        if (motorista != null){ //verifica se há alguém na moto
            StringBuilder buzina = new StringBuilder("P"); // classe que não pode ser alterada após a criação.StringBuilder permite que você modifique o conteúdo da string sem criar uma nova instância.
            for (int i = 0; i < potencia; i ++){
                buzina.append("e");  // Constrói a string da buzina com base na potência.
            }
            buzina.append("m");
            System.out.println(buzina.toString());  // Exibe o som da buzina.
        }
    }
}

