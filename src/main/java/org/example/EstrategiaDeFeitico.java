package org.example;

//Estratégia completa
public class EstrategiaDeFeitico implements IAcaoDeExterminio{
    @Override
    public void executar() {
        System.out.println("Você lança o feitiço de desintegração e o dragão vaporiza em uma pilha de cinzas");
    }
}
