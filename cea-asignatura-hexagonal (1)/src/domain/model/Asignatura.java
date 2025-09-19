package domain.model;

import domain.model.NumeroCreditos;
import domain.model.Profesor;
import domain.exceptions.ExcepcionNumeroCreditosInvalido;

public class Asignatura {
    private final String codigo;
    private String nombre;
    private NumeroCreditos numeroCreditos;
    private Profesor profesor;

    public Asignatura(String codigo, String nombre, NumeroCreditos numeroCreditos, Profesor profesor) {
        if (codigo == null || codigo.isEmpty()) throw new IllegalArgumentException("Código requerido");
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.profesor = profesor;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public NumeroCreditos getNumeroCreditos() { return numeroCreditos; }

    public void cambiarNumeroCreditos(NumeroCreditos nuevosCreditos) {
        if (nuevosCreditos == null) throw new ExcepcionNumeroCreditosInvalido("Créditos inválidos");
        this.numeroCreditos = nuevosCreditos;
    }
}
