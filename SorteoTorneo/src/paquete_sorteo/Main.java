package paquete_sorteo;

import java.util.*;

/*
 * En esta clase gestionamos toda la interacción con el usuario.
 * Controlamos la selección de etapa, el uso de excepciones
 * y permitimos repetir el sorteo tantas veces como se desee.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar = "si";

        // Aquí cargamos los 16 equipos oficiales una sola vez
        List<Equipo> equiposBase = GestorSorteo.obtenerEquiposLigaPro();

        while (continuar.equals("si")) {

            try {
                System.out.println("\n=== SORTEO DE TORNEO ===");
                System.out.println("Etapas disponibles: octavos, cuartos, semifinales");
                System.out.print("Ingrese la etapa: ");

                String etapa = sc.nextLine().toLowerCase();

                // Validamos la etapa usando una excepción personalizada
                int cantidad = GestorSorteo.cantidadPorEtapa(etapa);

                // Seleccionamos los equipos necesarios
                List<Equipo> equipos = GestorSorteo.seleccionarEquipos(equiposBase, cantidad);

                // Ejecutamos el sorteo final
                GestorSorteo.ejecutarSorteo(etapa, equipos);

            } catch (EtapaInvalidaException | CantidadEquiposInvalidaException e) {
                System.out.println("✗ " + e.getMessage());

            } catch (Exception e) {
                System.out.println("✗ Error inesperado: " + e.getMessage());
            }

            System.out.print("\n¿Desea realizar otro sorteo? (si/no): ");
            continuar = sc.nextLine().toLowerCase();
        }

        System.out.println("\nGracias por usar el sistema de sorteos.");
        sc.close();
    }
}

