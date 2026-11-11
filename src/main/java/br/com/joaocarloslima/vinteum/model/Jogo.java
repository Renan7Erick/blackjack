package br.com.joaocarloslima.vinteum.model;

public class Jogo {
    private Monte monte;
    private Jogador jogador;
    private Mesa mesa;

    public Jogo() {
        this.monte = new Monte();
        this.jogador = new Jogador();
        this.mesa = new Mesa();
    }

    public void pedirCarta() {
    }

    public void parar() {
    }

    public boolean acabou() {
        return false;
    }

    public String resultado() {
        return "";
    }

    public Jogador getJogador() {
        return this.jogador;
    }

    public Mesa getMesa() {
        return this.mesa;
    }

    public Monte getMonte() {
        return this.monte;
    }
}