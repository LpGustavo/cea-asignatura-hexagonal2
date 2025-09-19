package domain.model;

public class Profesor {
    private final String id;
    private final String nombre;

    public Profesor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}
