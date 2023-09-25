package Motoca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        //Criar uma pessoa com os valores inseridos
        Pessoa pessoa = new Pessoa(name, idade);

        //Criar uma moto
        Moto moto = new Moto ();

        //Subir na moto
        if (moto.subir(pessoa)){
            System.out.println(pessoa.getNome() + "subiu na moto.");
        } else {
            System.out.println("Não foi possível subir na moto. Já existe alguém nela.");
        }

        // Comprar tempo na moto
        System.out.print("Digite a quantidade de minutos que deseja comprar: ");
        int minutos = scanner.nextInt();
        moto.comprarTempo(minutos);

        //Dirigir moto
        moto.dirigirTempo();

        //Buzinar na moto
        moto.buzinar();

        //Descer da moto
        if (moto.descer()){
            System.out.println(pessoa.getNome() + " desceu da moto.");
        } else {
            System.out.println("Não foi possível descer da moto. Não há ninguém nela.");
        }





    }

    
}
