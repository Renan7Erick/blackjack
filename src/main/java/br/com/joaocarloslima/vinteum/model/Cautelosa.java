package br.com.joaocarloslima.vinteum.model;

public class Cautelosa implements EstiloDeJogo {
    @Override
    public String getNome() {
        return null;
    }

    @Override
    public boolean querCarta(Mao mao) {
        return false;
    }
}