package tests.domain;

import domain.model.Asignatura;
import domain.model.NumeroCreditos;
import domain.model.Profesor;
import domain.exceptions.ExcepcionNumeroCreditosInvalido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AsignaturaTest {

    @Test
    public void crearAsignaturaValida() {
        Profesor prof = new Profesor("P1", "Dr. García");
        Asignatura asignatura = new Asignatura("MAT101", "Matemáticas", new NumeroCreditos(3), prof);

        assertEquals("MAT101", asignatura.getCodigo());
        assertEquals(3, asignatura.getNumeroCreditos().getValor());
    }

    @Test
    public void noPermiteCreditosInvalidos() {
        assertThrows(ExcepcionNumeroCreditosInvalido.class, () -> {
            new NumeroCreditos(0);
        });
    }

    @Test
    public void cambiarNumeroCreditosCorrectamente() {
        Profesor prof = new Profesor("P1", "Dr. García");
        Asignatura asignatura = new Asignatura("MAT101", "Matemáticas", new NumeroCreditos(3), prof);

        asignatura.cambiarNumeroCreditos(new NumeroCreditos(4));

        assertEquals(4, asignatura.getNumeroCreditos().getValor());
    }
}
