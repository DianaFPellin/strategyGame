package org.example;

public class ExterminadorDeDragoes {
    //Agregação, um atributo referente à estratégia criada;
    private IAcaoDeExterminio acao;

    public ExterminadorDeDragoes(IAcaoDeExterminio acao) {
        this.acao = acao;
    }

    public void mudaEstrategia(IAcaoDeExterminio acao) {
        this.acao = acao;
    }

    public void iniciarBatalha() {
        acao.executar(); //Executa a ação vinculada à estratégia que está sendo usada no momento;
    }
}
