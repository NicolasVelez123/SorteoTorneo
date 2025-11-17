package paquete_sorteo;

/*
 * En esta clase representamos a cada equipo participante del torneo.
 * Definimos únicamente su nombre, ya que es suficiente para identificarlo.
 */
public class Equipo {

    private String nombre; // Aquí almacenamos el nombre del equipo

    /*
     * Creamos el constructor donde inicializamos el nombre del equipo.
     */
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Este método permite obtener el nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Sobrescribimos el método toString para que, al imprimir el objeto,
     * se muestre directamente el nombre del equipo en consola.
     */
    @Override
    public String toString() {
        return nombre;
    }
}
