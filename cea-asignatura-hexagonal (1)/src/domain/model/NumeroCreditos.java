package domain.model;

import domain.exceptions.ExcepcionNumeroCreditosInvalido;

public class NumeroCreditos {
    private final int valor;

    public NumeroCreditos(int valor) {
        if (valor < 1 || valor > 6) {
            throw new ExcepcionNumeroCreditosInvalido("El número de créditos debe estar entre 1 y 6.");
        }
        this.valor = valor;
    }

    public int getValor() { return valor; }
}
