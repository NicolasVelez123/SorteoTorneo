package paquete_sorteo;

/*
 * Aquí definimos una excepción personalizada que permite validar
 * si la cantidad de equipos seleccionados para la etapa es incorrecta.
 * Esto evita errores futuros en el proceso de sorteo.
 */
public class CantidadEquiposInvalidaException extends Exception {

    // Esta línea elimina el warning sobre serialización
    private static final long serialVersionUID = 1L;

    public CantidadEquiposInvalidaException(String mensaje) {
        super(mensaje);
    }
}
