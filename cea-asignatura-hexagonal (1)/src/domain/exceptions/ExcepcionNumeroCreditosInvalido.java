package domain.exceptions;

public class ExcepcionNumeroCreditosInvalido extends RuntimeException {
    public ExcepcionNumeroCreditosInvalido(String mensaje) {
        super(mensaje);
    }
}
