package br.com.joaocarloslima.vinteum.model;

import java.util.List;

public abstract class Participante {
    private Mao mao = new Mao();
    private boolean parou = false;

    public abstract boolean querCarta();

    public void receberCarta(Carta carta) {
        this.mao.adicionar(carta);
    }

    public void parar() {
        this.parou = true;
    }

    public boolean parou() {
        return this.parou;
    }

    public int getPontos() {
        return this.mao.getPontos();
    }

    public boolean estourou() {
        return this.mao.estourou();
    }

    public List<Carta> getCartas() {
        return this.mao.getCartas();
    }

    protected Mao getMao() {
        return this.mao;
    }
}