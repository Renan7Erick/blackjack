package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas;

    public Monte() {
        this.cartas = new ArrayList<>();
        // Percorre cada um dos 4 naipes
        for (Naipe naipe : Naipe.values()) {
            for (int i = 1; i <= 13; i++) {
                this.cartas.add(new Carta(i, naipe));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    public Carta virar() {
        if (!this.cartas.isEmpty()) {
            return this.cartas.remove(0);
        }
        return null;
    }

    public int getQuantidade() {
        return this.cartas.size();
    }
}