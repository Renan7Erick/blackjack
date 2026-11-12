package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.List;

public class Mao {
    private List<Carta> cartas;

    public Mao() {
        this.cartas = new ArrayList<>();
    }

    public void adicionar(Carta carta) {
        if (carta != null) {
            this.cartas.add(carta);
        }
    }

    public int getPontos() {
        int soma = 0;
        int quantidadeAses = 0;

        for (Carta carta : cartas) {
            int valor = carta.getValor();
            soma += valor;
            if (valor == 1) {
                quantidadeAses++;
            }
        }

        // Se houver Ás e somar mais 10 não estourar 21, o Ás vale 11
        while (quantidadeAses > 0 && soma + 10 <= 21) {
            soma += 10;
            quantidadeAses--;
        }

        return soma;
    }

    public boolean estourou() {
        return getPontos() > 21;
    }

    public List<Carta> getCartas() {
        return this.cartas;
    }
}