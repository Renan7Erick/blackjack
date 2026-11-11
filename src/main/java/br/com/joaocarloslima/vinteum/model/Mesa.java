package br.com.joaocarloslima.vinteum.model;

public class Mesa extends Participante {
    private EstiloDeJogo estilo;

    @Override
    public boolean querCarta() {
        return false;
    }

    public void setEstilo(EstiloDeJogo estilo) {
    }

    public EstiloDeJogo getEstilo() {
        return null;
    }
}