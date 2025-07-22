/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal.rutas.estudiar;

import com.mycompany.proyectofinal.Jugador;
import com.mycompany.proyectofinal.Utilidades;
import java.util.Scanner;

/**
 * Clase que maneja la ruta de estudiar para ingresar a universidad pública
 */
public class RutaEstudiar {
    
    public static void opcionEstudiar(Jugador jugador, Scanner sc) {
        String frase = """
            FELICIDADES! Te esforzaste y lograste ingresar a la UNDC.
            Ingresaste a la carrera de Ingenieria de Sistemas.
            Tus padres te felicitan por tu dedicacion y esfuerzo.
            """;
        Utilidades.imprimirDecorado(frase);

        System.out.println(">>> DIA #0 <<<");

        frase = """
            Hay una ceremonia de apertura donde te dan la bienvenida universitaria.
            Entras a un lugar grande y lleno de estudiantes parece un cine vez las luces brillar en el techo,
            te deslumbran un poco todos estan tomando sus asientos parece que se van a llenar no es un momento critico,
            pero tal vez elegir donde sentarte pueda ser una decision importante.
            """;
        Utilidades.imprimirDecorado(frase);

        System.out.println("Donde te sientas?\n1. Al frente\n2. Al medio\n3. Al fondo");
        System.out.print("Elige una opcion (1-3): ");
        String entrada2 = sc.nextLine();

        int decision;
        try {
            decision = Integer.parseInt(entrada2);
        } catch (NumberFormatException e) {
            System.out.println("Debes ingresar un numero valido (1-3).");
            return;
        }

        switch (decision) {
            case 1 -> {
                jugador.aumentarConfianza(1);
                opcionAlfrente(jugador);
                opcionAlfrente2(jugador, sc);
                opcionalfrentepregunta(jugador, sc);
                opcionAlfrente3();
            }
            case 2 ->
                opcionAlmedio();
            case 3 ->
                opcionAlfondo();
            default ->
                System.out.println("Opcion invalida. Por favor, elige entre 1, 2 o 3.");
        }
    }

    public static void opcionAlfrente(Jugador jugador) {
        String frase = """
            Te has sentado en la parte delantera, puedes ver todo con claridad.
            Honestamente nunca has sido de ir al frente, pero sientes que esta nueva etapa de tu vida te impulsa a tener mas valor.
            (Ganas confianza +1)
            """;
        Utilidades.imprimirDecorado(frase);
        jugador.aumentarConfianza(1);
    }

    public static void opcionAlfrente2(Jugador jugador, Scanner sc) {
        String frase = """
            Mientras escuchas la presentación, comienzas a plantearte en que club podrías inscribirte,
            o si pudieses llegar a postular para el intercambio de estudiantes, en eso el presentador pregunta…
            """;
        Utilidades.imprimirDecorado(frase);
    }

    public static void opcionalfrentepregunta(Jugador jugador, Scanner sc) {
        System.out.println("Que haras?\n1. Levantar la mano\n2. No hacer nada ");
        System.out.print("Elige una opcion (1-2): ");
        String entrada2;
        entrada2 = sc.nextLine();

        int decision;
        try {
            decision = Integer.parseInt(entrada2);
        } catch (NumberFormatException e) {
            System.out.println("Debes ingresar un numero valido (1-2).");
            return;
        }
        switch (decision) {
            case 1 -> {
                String frase = """
            Decides levantar la mano, la pregunta es la siguiente:
            ¿Con cuál de las siguientes universidades NO tiene convenio de intercambio 
            estudiantil la Universidad Nacional de Cañete?
            """;
                Utilidades.imprimirDecorado(frase);
                System.out.println("1. Universidad Nacional Federico Villarreal");
                System.out.println("2. Universidad Nacional de San Marcos");
                System.out.println("3. Universidad Nacional Agraria La Molina");
                System.out.print("Elige una opcion (1-3): ");

                String respuesta = sc.nextLine();

                if (respuesta.equals("1")) {
                    frase = """
                Respuesta correcta!, todos de miran con respeto el presentador te felicita y de da un llavero de regalo  (+1 de confianza)       
                        """;
                    Utilidades.imprimirDecorado(frase);
                    jugador.aumentarConfianza(1);
                } else {
                    frase = """
                La respuesta es incorrecta, el presentador le da el micrófono a otro participante, sin embargo, sientes un poco de nerviosismo (-1 de confianza)
                """;
                    Utilidades.imprimirDecorado(frase);
                    jugador.aumentarConfianza(-1);
                }

            }
            case 2 -> {
                String frase = """
            Decidiste no hacer nada y otro estudiante responde correctamente la pregunta, podrías haberlo hecho tú, piensas para ti mismo.
                    """;
                Utilidades.imprimirDecorado(frase);
            }
            default ->
                System.out.println("Opción inválida. Por favor, elige entre 1 o 2.");

        }
    }

    public static void opcionAlfrente3() {
        String frase = """
            Llega el momento de un receso en las presentaciones, como te sentaste en las primeras filas, 
            recibes tu refrigerio individual, sientes que la comida recarga tus energías.
            """;
        Utilidades.imprimirDecorado(frase);
        frase = """
            Mientras comes, observas a tu alrededor y ves a muchos estudiantes conversando animadamente.
            Algunos parecen estar haciendo nuevos amigos, otros están revisando sus teléfonosm, tu te centras
            en tu comida y disfrutas del momento.
            """;
        Utilidades.imprimirDecorado(frase);
        frase = """
            Después de un rato, el presentador vuelve al escenario y anuncia que Las presentaciones terminaron,
            te levantas de tu asiento y vas a la salida, el sol te saluda y bajas las escaleras, te diriges hacia
            la salida; ya es momento de volver a casa, mañana es tu primer día, planeas descansar bien esta noche. 
            Estas listo para comenzar tu vida universitaria.
            """;
        Utilidades.imprimirDecorado(frase);
    }

    public static void opcionAlmedio() {
        String frase = """
        Te sentaste en medio del todo, ¿lo común no?, te preguntas eso mientras tomas asiento,
        no ves caras conocidas, pero te sientes cómodo..
        """;
        Utilidades.imprimirDecorado(frase);
    }

    public static void opcionAlfondo() {
        System.out.println("Te sentaste en la parte trasera, puedes hablar con tus amigos sin problemas.");
        System.out.println("Sin embargo, no ves bien lo que sucede en el escenario.");
    }
}
