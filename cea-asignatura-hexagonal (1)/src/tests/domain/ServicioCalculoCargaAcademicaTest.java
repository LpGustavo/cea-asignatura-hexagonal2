package tests.domain;

import domain.model.Asignatura;
import domain.model.NumeroCreditos;
import domain.model.Profesor;
import domain.services.ServicioCalculoCargaAcademica;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ServicioCalculoCargaAcademicaTest {

    @Test
    public void calcularCargaAcademicaTotal() {
        Profesor prof = new Profesor("P1", "Dr. García");
        Asignatura a1 = new Asignatura("MAT101", "Matemáticas", new NumeroCreditos(3), prof);
        Asignatura a2 = new Asignatura("FIS101", "Física", new NumeroCreditos(4), prof);

        ServicioCalculoCargaAcademica servicio = new ServicioCalculoCargaAcademica();
        int total = servicio.calcularCarga(Arrays.asList(a1, a2));

        assertEquals(7, total);
    }

    @Test
    public void detectarExcesoDeCarga() {
        Profesor prof = new Profesor("P1", "Dr. García");
        Asignatura a1 = new Asignatura("MAT101", "Matemáticas", new NumeroCreditos(4), prof);
        Asignatura a2 = new Asignatura("FIS101", "Física", new NumeroCreditos(4), prof);

        ServicioCalculoCargaAcademica servicio = new ServicioCalculoCargaAcademica();
        assertTrue(servicio.excedeLimite(Arrays.asList(a1, a2), 6));
    }
}
