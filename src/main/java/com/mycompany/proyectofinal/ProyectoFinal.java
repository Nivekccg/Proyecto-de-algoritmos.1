/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.rutas.estudiar.RutaEstudiar;
import com.mycompany.proyectofinal.rutas.esperar.RutaEsperar;
import com.mycompany.proyectofinal.rutas.trabajar.RutaTrabajar;
import java.util.Scanner;

public class ProyectoFinal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String nombre, ciudad;

            System.out.println(">>> Ingrese un nombre al jugador <<<");
            nombre = sc.nextLine();

            String frase = "El nombre " + nombre + " me parece increible.";
            Utilidades.imprimirDecorado(frase);

            System.out.println(">>> Donde vive " + nombre + " <<<");
            ciudad = sc.nextLine();

            frase = "No conozco " + ciudad + ", pero seguro que es un gran lugar.";
            Utilidades.imprimirDecorado(frase);

            System.out.println("Muy bien... \n    >>> COMENCEMOS! <<<");

            Jugador jugador = new Jugador(nombre, ciudad);

            frase = "ERES UN/UNA ESTUDIANTE LLAMADO " + nombre + " QUE ACABA DE TERMINAR SU 5TO ANO DE SECUNDARIA.\n"
                    + "VIVES EN " + ciudad + ", CONVERSANDO CON TUS PADRES DICEN QUE EN ESTE MOMENTO NO PUEDEN\n"
                    + "DARTE ESTUDIOS EN UNA UNIVERSIDAD PRIVADA, Y EL ESTUDIAR PARA INGRESAR A\n"
                    + "UNA UNIVERSIDAD PUBLICA ES UNA BUENA OPCION. ES MOMENTO DE TOMAR UNA DECISION SOBRE QUE HARAS.";
            Utilidades.imprimirDecorado(frase);

            while (true) {
                Utilidades.mostrarOpcionesIniciales();
                String entrada = sc.nextLine();
                int decision;

                try {
                    decision = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Debes ingresar un numero valido (1-3).");
                    continue;
                }

                switch (decision) {
                    case 1 -> {
                        jugador.aumentarInteligencia(1);
                        RutaEstudiar.opcionEstudiar(jugador, sc); // Llamada a la ruta Estudiar
                    }
                    case 2 -> {
                        jugador.aumentarInteligencia(-1);
                        RutaEsperar.opcionEsperar(jugador, sc); // Llamada a la ruta Esperar
                    }
                    case 3 -> {
                        jugador.aumentarCarisma(1);
                        RutaTrabajar.opcionTrabajar(jugador, sc); // Llamada a la ruta Trabajar
                    }
                    default -> {
                        System.out.println("Opcion invalida. Por favor, elige entre 1, 2 o 3.");
                        continue;
                    }
                }

                jugador.mostrarEstado();

                System.out.println("\nDeseas volver al menu principal? (si/no): ");
                String respuesta = sc.nextLine().trim().toLowerCase();
                if (respuesta.equals("no")) {
                    System.out.println("Gracias por jugar. Fin del programa.");
                    break;
                }
            }
        }
    }
}
