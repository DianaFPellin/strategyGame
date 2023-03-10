package org.example;

public class EstrategiaDeArmaBranca implements IAcaoDeExterminio {
    @Override
    public void executar() {
        System.out.println("Com sua Excalibur você corta a cabeça do Dragão");
    }
}
