# Sistema de Sorteo de Torneo en Java

Este proyecto implementa un sistema de sorteo para las etapas eliminatorias de un torneo de fútbol profesional. El programa permite seleccionar la etapa (octavos, cuartos o semifinales) y genera automáticamente los partidos utilizando los 16 equipos oficiales de la LigaPro. Dependiendo de la etapa, se selecciona la cantidad correspondiente de equipos y se forman los emparejamientos de manera aleatoria.

## Características principales
- Uso de los 16 equipos oficiales de la LigaPro.
- Selección automática de equipos según la etapa.
- Emparejamiento aleatorio utilizando `Collections.shuffle()`.
- Generación de partidos mediante un método recursivo.
- Permite repetir el sorteo sin necesidad de reiniciar el programa.

## Estructura del proyecto
- **Equipo.java**: Representa un equipo del torneo.
- **Partido.java**: Modela un enfrentamiento entre dos equipos.
- **GestorSorteo.java**: Contiene la lógica del sorteo, selección de equipos y recursividad.
- **Main.java**: Gestiona la interacción con el usuario y ejecuta el programa.

## Ejecución
1. Abrir el proyecto en Eclipse o cualquier IDE compatible con Java.
2. Ejecutar la clase `Main`.
3. Seleccionar la etapa del torneo.
4. Visualizar los partidos generados.
5. Repetir el sorteo si se desea.

## Requisitos
- Java 8 o superior.
- IDE recomendado: Eclipse.

