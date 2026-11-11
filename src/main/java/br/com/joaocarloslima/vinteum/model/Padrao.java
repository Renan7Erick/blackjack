package br.com.joaocarloslima.vinteum.model;

public class Padrao implements EstiloDeJogo {
    @Override
    public String getNome() {
        return null;
    }

    @Override
    public boolean querCarta(Mao mao) {
        return false;
    }
}