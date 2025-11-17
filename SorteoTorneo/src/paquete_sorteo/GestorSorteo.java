package paquete_sorteo;

import java.util.*;

/*
 * En esta clase centralizamos toda la lógica del sistema de sorteos.
 * Definimos la lista oficial de equipos, validamos etapas, seleccionamos
 * equipos aleatoriamente y aplicamos recursividad para formar los partidos.
 */
public class GestorSorteo {

    /*
     * Aquí creamos la lista de los 16 equipos oficiales de la LigaPro.
     * Esta lista se usa como base en todas las etapas del torneo.
     */
    private static final String[] EQUIPOS_LIGAPRO = {
        "Barcelona SC", "Emelec", "Liga de Quito", "Aucas",
        "Independiente del Valle", "Deportivo Cuenca", "Mushuc Runa", "Macará",
        "Orense", "Técnico U.", "Cumbayá", "El Nacional",
        "Libertad FC", "Delfín", "Imbabura", "Universidad Católica"
    };

    /*
     * En este método validamos la etapa ingresada por el usuario.
     * Si la etapa no existe, lanzamos la excepción personalizada.
     */
    public static int cantidadPorEtapa(String etapa) throws EtapaInvalidaException {
        switch (etapa) {
            case "octavos": return 16;
            case "cuartos": return 8;
            case "semifinales": return 4;
            default:
                throw new EtapaInvalidaException(
                    "Error: La etapa ingresada es inválida. Use octavos, cuartos o semifinales."
                );
        }
    }

    /*
     * Retornamos una lista con los 16 equipos oficiales.
     */
    public static List<Equipo> obtenerEquiposLigaPro() {
        List<Equipo> lista = new ArrayList<>();
        for (String nombre : EQUIPOS_LIGAPRO) {
            lista.add(new Equipo(nombre));
        }
        return lista;
    }

    /*
     * Este método selecciona de manera aleatoria la cantidad de equipos
     * necesaria para la etapa actual. Lanza excepción si la cantidad no es válida.
     */
    public static List<Equipo> seleccionarEquipos(List<Equipo> base, int cantidad)
            throws CantidadEquiposInvalidaException {

        if (cantidad != 4 && cantidad != 8 && cantidad != 16) {
            throw new CantidadEquiposInvalidaException(
                "Error: La cantidad de equipos requerida debe ser 16, 8 o 4."
            );
        }

        List<Equipo> copia = new ArrayList<>(base); // Copiamos para no alterar la lista base
        Collections.shuffle(copia);                  // Mezclamos aleatoriamente

        return copia.subList(0, cantidad);           // Cortamos la lista
    }

    /*
     * Aquí implementamos el método recursivo que forma los partidos.
     * Toma dos equipos a la vez y avanza de dos en dos.
     */
    public static void sortearPartidos(List<Equipo> equipos, int indice, List<Partido> resultados) {
        if (indice >= equipos.size()) {
            return; // Caso base: ya no hay más equipos para emparejar
        }

        Equipo e1 = equipos.get(indice);
        Equipo e2 = equipos.get(indice + 1);

        resultados.add(new Partido(e1, e2));

        sortearPartidos(equipos, indice + 2, resultados); // Llamada recursiva
    }

    /*
     * Método principal que mezcla los equipos, aplica la recursividad
     * y muestra todos los partidos generados.
     */
    public static void ejecutarSorteo(String etapa, List<Equipo> equipos) {
        Collections.shuffle(equipos);

        List<Partido> partidos = new ArrayList<>();
        sortearPartidos(equipos, 0, partidos);

        System.out.println("\n=== Sorteo de " + etapa + " ===");
        int contador = 1;

        for (Partido p : partidos) {
            System.out.println("Partido " + contador + ": " + p);
            contador++;
        }
    }
}


