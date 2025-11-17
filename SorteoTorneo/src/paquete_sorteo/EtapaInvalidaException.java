package paquete_sorteo;

/*
 * En esta clase creamos una excepción personalizada que utilizamos
 * cuando el usuario ingresa una etapa que no existe dentro del sistema.
 */
public class EtapaInvalidaException extends Exception {

    private static final long serialVersionUID = 1L; // Evita warning de serialización

    public EtapaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
