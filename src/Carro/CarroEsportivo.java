package Carro;

public class CarroEsportivo {
    private int passageiros;
    private int limitePassageiros = 2;
    private int combustivel;
    private int limiteCombustivel = 100; // exemplo, pode ser ajustado
    private int quilometragem;

    // Construtor para inicializar o carro
    public CarroEsportivo() {
        passageiros = 0;
        combustivel = 0;
        quilometragem = 0;
    }

    // Embarca uma pessoa no carro, desde que o limite de passageiros não seja excedido.
    public boolean embarcar() {
        if (passageiros < limitePassageiros) {
            passageiros++;
            System.out.println("Uma pessoa embarcou.");
            return true;
        } else {
            System.out.println("Limite de passageiros atingido, não é possível embarcar.");
            return false;
        }
    }

    // Desembarca uma pessoa do carro, desde que haja passageiros.
    public void desembarcar() {
        if (passageiros > 0) {
            passageiros--;
            System.out.println("Uma pessoa desembarcou.");
        } else {
            System.out.println("Não há pessoas para desembarcar.");
        }
    }

    // Abastece o tanque com a quantidade de litros de combustível fornecida.
    public void abastecer(int litros) {
        if (combustivel + litros <= limiteCombustivel) {
            combustivel += litros;
            System.out.println("O tanque foi abastecido com " + litros + " litros.");
        } else {
            System.out.println("Não é possível abastecer tantos litros, excederia o limite do tanque.");
        }
    }

    // Simula a ação de dirigir, consome combustível e aumenta a quilometragem.
    public void dirigir() {
        if (passageiros > 0 && combustivel > 0) {
            System.out.println("Dirigindo...");
            quilometragem += 10; // Exemplo, você pode ajustar a quantidade de km percorridos
            combustivel -= 10;   // Exemplo, você pode ajustar o consumo de combustível por km
        } else {
            System.out.println("Não é possível dirigir, não há passageiros ou combustível suficiente.");
        }
    }
}
