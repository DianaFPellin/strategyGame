package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Um Dragão verde sem asas é avistado a frente!");
        ExterminadorDeDragoes exterminador = new ExterminadorDeDragoes(new EstrategiaDeArmaBranca());
        exterminador.iniciarBatalha();

        System.out.println("Um Dragão vermelho emerge do fundo de uma cratera.");
        exterminador.mudaEstrategia(new EstrategiaDeProjetil());
        exterminador.iniciarBatalha();

        System.out.println("O próprio Alduin pousa diante de você!");
        exterminador.mudaEstrategia(new EstrategiaDeFeitico());
        exterminador.iniciarBatalha();

        System.out.println("Ao fim de sua jornada você se reencontra com Paarthurnax, o irmão de Alduin e recebe um elmo lendário feito de Ébano");
    }
}