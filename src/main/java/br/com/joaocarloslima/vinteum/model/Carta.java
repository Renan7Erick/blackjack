package br.com.joaocarloslima.vinteum.model;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getValor() {
        return 0;
    }

    public String getImagem() {
        return null;
    }

    public int getNumero() {
        return 0;
    }

    public Naipe getNaipe() {
        return null;
    }
}