package Lapiseira_Array;

import java.util.ArrayList;
import java.util.List;

public class Lapiseira {
    private float calibre;                 // Declarando o calibre da lapiseira
    private String dureza;                 // Declarando a dureza do grafite
    private int tamanho;                   // Declarando o tamanho do grafite em mm
    private float grafiteNoBico;           // Declarando o grafite no bico
    private List<Float> grafitesNoTambor;  // Declarando uma lista para armazenar grafites no tambor

    public Lapiseira(float calibre) {       // Construtor que recebe o calibre ao criar uma lapiseira
        this.calibre = calibre;             // Inicializando o calibre com o valor fornecido
        this.grafiteNoBico = 0;             // Inicializando o grafite no bico como 0 (não há grafite no bico)
        this.grafitesNoTambor = new ArrayList<>(); // Inicializando a lista de grafites no tambor como uma nova lista vazia
    }

    public void inserirGrafite(float calibre, String dureza, int tamanho) {
        if (calibre != this.calibre) {      // Verificando se o calibre do grafite é compatível com o da lapiseira
            System.out.println("Grafite não compatível com o calibre da lapiseira.");
            return;
        }

        this.grafitesNoTambor.add((float) tamanho); // Adicionando o tamanho do grafite à lista de grafites no tambor
        this.dureza = dureza;               // Armazenando a dureza do grafite
        this.tamanho = tamanho;             // Armazenando o tamanho do grafite
    }

    public void puxarGrafite() {
        if (grafiteNoBico > 0) {            // Verificando se já há um grafite no bico
            System.out.println("Remova o grafite do bico antes de puxar um novo.");
            return;
        }
        if (!grafitesNoTambor.isEmpty()) {  // Verificando se há grafites no tambor
            grafiteNoBico = grafitesNoTambor.remove(grafitesNoTambor.size() - 1); // Puxando o último grafite do tambor para o bico
        } else {
            System.out.println("Tambor de grafites está vazio.");
        }
    }

    public void removerGrafite() {
        grafiteNoBico = 0;                  // Removendo o grafite do bico (definindo sua quantidade como 0)
    }

    public void escreverNaFolha(int numFolhas) {
        if (grafiteNoBico <= 0) {           // Verificando se não há grafite no bico
            System.out.println("Não há grafite no bico para escrever.");
            return;
        }

        int consumoPorFolha = 0;

        // Determinando o consumo de grafite com base na dureza
        if (dureza.equals("HB")) {
            consumoPorFolha = 1;
        } else if (dureza.equals("2B")) {
            consumoPorFolha = 2;
        } else if (dureza.equals("4B")) {
            consumoPorFolha = 4;
        } else if (dureza.equals("6B")) {
            consumoPorFolha = 6;
        }

        int folhasPossiveis = (int) (grafiteNoBico / consumoPorFolha); // Calculando o número máximo de folhas que podem ser escritas

        int folhasEscritas = Math.min(numFolhas, folhasPossiveis); // Calculando quantas folhas podem ser escritas com base no número de folhas solicitado e no grafite disponível

        if (folhasEscritas > 0) {
            grafiteNoBico -= folhasEscritas * consumoPorFolha; // Reduzindo a quantidade de grafite no bico com base no consumo
            if (grafiteNoBico <= 10) {
                System.out.println("O grafite está acabando. Substitua-o em breve.");
            }
            System.out.println("Escreveu " + folhasEscritas + " folhas.");
        } else {
            System.out.println("Não há grafite suficiente para escrever " + numFolhas + " folhas.");
        }
    }
}
