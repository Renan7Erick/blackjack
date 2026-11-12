package br.com.joaocarloslima.vinteum.model;

public class Jogo {
    private Monte monte;
    private Jogador jogador;
    private Mesa mesa;

    public Jogo() {
        this.monte = new Monte();
        this.jogador = new Jogador();
        this.mesa = new Mesa();

        // Embaralha o baralho no início do jogo
        this.monte.embaralhar();

        // Distribui 2 cartas para o jogador
        this.jogador.receberCarta(this.monte.virar());
        this.jogador.receberCarta(this.monte.virar());

        // Distribui 2 cartas para a mesa
        this.mesa.receberCarta(this.monte.virar());
        this.mesa.receberCarta(this.monte.virar());
    }

    public void pedirCarta() {
        if (this.jogador.querCarta()) {
            this.jogador.receberCarta(this.monte.virar());
        }
    }

    public void parar() {
        this.jogador.parar();

        while (this.mesa.querCarta()) {
            this.mesa.receberCarta(this.monte.virar());
        }
        this.mesa.parar();
    }

    public boolean acabou() {
        return this.jogador.estourou() || (this.jogador.parou() && this.mesa.parou());
    }

    public String resultado() {
        if (!acabou()) {
            return "Em andamento...";
        }

        if (this.jogador.estourou()) {
            return "Você estourou! A Mesa ganhou.";
        } else if (this.mesa.estourou()) {
            return "A Mesa estourou! Você ganhou!";
        } else if (this.jogador.getPontos() > this.mesa.getPontos()) {
            return "Você ganhou!";
        } else if (this.jogador.getPontos() < this.mesa.getPontos()) {
            return "A Mesa ganhou.";
        } else {
            return "Empate!";
        }
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