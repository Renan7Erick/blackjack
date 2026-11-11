package br.com.joaocarloslima.vinteum.model;

import java.util.List;

public abstract class Participante {
    private Mao mao = new Mao();
    private boolean parou = false;

    public abstract boolean querCarta();

    public void receberCarta(Carta carta) {
    }

    public void parar() {
    }

    public boolean parou() {
        return false;
    }

    public int getPontos() {
        return 0;
    }

    public boolean estourou() {
        return false;
    }

    public List<Carta> getCartas() {
        return null;
    }

    protected Mao getMao() {
        return null;
    }
}