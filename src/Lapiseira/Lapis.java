package Lapiseira;

public class Lapis {
    private float calibre;             // Declaração do atributo 'calibre' da lapiseira (tamanho do grafite).
    private String dureza;             // Declaração do atributo 'dureza' do grafite.
    private int tamanhoGrafite;        // Declaração do atributo 'tamanhoGrafite' do grafite.


    public void Lapiseira(float calibre) {  // Construtor da classe Lapiseira, recebe o 'calibre' como parâmetro.
        this.calibre = calibre;        // Inicializa o atributo 'calibre' com o valor passado como parâmetro.
        this.dureza = "";              // Inicializa o atributo 'dureza' como uma string vazia.
        this.tamanhoGrafite = 0;       // Inicializa o atributo 'tamanhoGrafite' como 0 (sem grafite).


    }
 
    public void inserirGrafite(float calibre, String dureza, int tamanho){
        if (this.tamanhoGrafite == 0 && this.calibre == calibre){// Verifica se não há grafite e se o calibre é compatível.
            this.dureza = dureza;         // Atribui a dureza do grafite.
            this.tamanhoGrafite = tamanho; // Atribui o tamanho do grafite.
            System.out.println("Grafite inserido com sucesso!");
        } else {
            System.out.println("Não é possível inserir o grafite.");
        }

    }

    public void removerGrafite (){
        if (this.tamanhoGrafite > 0) { //verificando se tem grafite
            this.dureza = ""; //removendo dureza
            this.tamanhoGrafite = 0; //sem grafite
            System.out.println("Grafite removido com sucesso!");
    
        } else {
            System.out.println("Não há grafite para remover.");   // Exibe mensagem de erro.
        }
    }

    public void escreverFolha(int folha, int suavidade){
        double consumoPorFolha = 0.0;

        switch(suavidade){
            case 1: //Grafite HB: 1mm por folha
                consumoPorFolha = 1.0;
                break;
            case 2: //Grafite 2B: 2mm por folha
                consumoPorFolha = 2.0;
                break;
            case 3: //Grafite 4B: 4mm por folha
               consumoPorFolha = 4.0;
                break;
            case 4: //Grafite 6B: 6mm por folha.
                consumoPorFolha = 6.0;
                break;
            default:
            System.out.println("Tipo de grafite não suportado.");
            return;
    }

    double consumoTotal = consumoPorFolha * folha;
    if (tamanhoGrafite <= 10.0 || tamanhoGrafite < consumoTotal) {
        System.out.println("Não é possível escrever.Grafite insuficiente.");
    } else {
        tamanhoGrafite -= consumoTotal;
        System.out.println("Escrevendo" + folha + "folhas com grafite" + suavidade + "B.");
        System.out.println("Tamanho restante do grafite: " + tamanhoGrafite + "mm");
    }






    }
} 
