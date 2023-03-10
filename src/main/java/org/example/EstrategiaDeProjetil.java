package org.example;

public class EstrategiaDeProjetil implements IAcaoDeExterminio{
    @Override
    public void executar() {
        System.out.println("Você atira no dragão com a besta mágica e ele cai morto no chão");
    }
}