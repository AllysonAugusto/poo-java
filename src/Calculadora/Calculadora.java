package Calculadora;
import java.util.Scanner;

public class Calculadora {
    private static double bateria;
    

    public static void CalculadoraBateria(){ //Iniciando a batearia cheia
        bateria = 100.0;
    }

    public static void mostrarBateria(){ //Mostrando a % da bateria
        System.out.println("Bateria: " + bateria + "%");
    }

    public static double recarregarBateria (){
        if (bateria >= 100.0){ 
            System.out.println("ERRO! A bateria já está cheia.");
        } else {
            bateria = 100.0; //Bateria recarregada.
            System.out.println("Bateria carregada.");
        }

        return bateria;
    }


    public static double somar(int quantidade) {
        if (bateria >= 20.0) {
            double soma = 0.0;
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                double numero = new Scanner(System.in).nextDouble(); //lê um número e o armazena na variável numero.
                soma += numero;
            }
            return soma;
        } else {
            System.out.println("Sem bateria para realizar operações.");
            return Double.NaN; // Retorna um valor de erro.
        }
    }

    public double subtrair (int quantidade){
        if (bateria >= 20.0){
            double subtrair = 0.0;
            for (int i = 0; i < quantidade; i++){
                System.out.println("Digite o número " + (i+1) + ":");
                double number = new Scanner (System.in).nextDouble();
                subtrair += number;
            }
        }
        return quantidade;
    }

    public double dividir (int a, int b){
        if (bateria >= 20.0) {
                if (b == 0) {
                    System.out.println("Não é possível dividir por 0.");
                    return Double.NaN; // Retorna um valor de erro.
                }

                return (double) a / b;
            } else {
                System.out.println("Sem bateria para realizar operações.");
                return Double.NaN; // Retorna um valor de erro.
            }
        }

    public double multiplicar(int quantidade){
        if (bateria >= 20.0){
            double multiplicar = 0.0;
            for (int i = 0; i < quantidade; i++){
            System.out.println("Digite um número " + (i + 1) + ":");
            double number = new Scanner (System.in).nextDouble ();
            multiplicar += number;
        }
        
        return quantidade;
    }
        return quantidade;












}
}
