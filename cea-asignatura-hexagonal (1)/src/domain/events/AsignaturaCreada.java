package domain.events;

import java.time.LocalDateTime;

public class AsignaturaCreada {
    private final String codigoAsignatura;
    private final LocalDateTime fecha;

    public AsignaturaCreada(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
        this.fecha = LocalDateTime.now();
    }

    public String getCodigoAsignatura() { return codigoAsignatura; }
    public LocalDateTime getFecha() { return fecha; }
}
