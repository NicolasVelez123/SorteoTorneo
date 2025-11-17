package paquete_sorteo;

/*
 * En esta clase modelamos un partido entre dos equipos.
 * Guardamos ambos equipos y devolvemos el partido en un formato legible.
 */
public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;

    /*
     * Creamos el constructor que recibe los dos equipos que conforman el partido.
     */
    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    /*
     * Representamos el partido en el formato "Equipo A vs Equipo B".
     */
    @Override
    public String toString() {
        return equipo1 + " vs " + equipo2;
    }
}
