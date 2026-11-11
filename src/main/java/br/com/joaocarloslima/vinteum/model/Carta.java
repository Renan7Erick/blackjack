package br.com.joaocarloslima.vinteum.model;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getValor() {
        if (numero >= 11 && numero <= 13) {
            return 10;
        }
        return numero;
    }

    public String getImagem() {
        String nomeCarta;
        switch (numero) {
            case 1: nomeCarta = "Ace"; break;
            case 11: nomeCarta = "Jack"; break;
            case 12: nomeCarta = "Queen"; break;
            case 13: nomeCarta = "King"; break;
            default: nomeCarta = String.valueOf(numero); break;
        }
        return nomeCarta + naipe.name() + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}