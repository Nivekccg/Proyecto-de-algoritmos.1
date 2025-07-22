/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal.rutas.trabajar;

import com.mycompany.proyectofinal.Jugador;
import java.util.Scanner;

/**
 * Clase que maneja la ruta de trabajar para pagarse una universidad privada
 */
public class RutaTrabajar {
    
    public static void opcionTrabajar(Jugador jugador, Scanner sc) {
        System.out.println("\nEmpezaste a ganar dinero y pudiste darte el lujo de estudiar");
        System.out.println("en una universidad privada. Sin embargo, el trabajo es duro y cansado.");
        System.out.println("Hay una ceremonia de apertura donde te dan la bienvenida universitaria.");
        System.out.println("Pero por tu horario de trabajo, no puedes asistir.");
        System.out.println("SEMANA 1");
        System.out.println("Emepezo tu primera semana de clases");
        System.out.println("Te sientes cansado y con sueño, pero decides ir a la universidad.");
        System.out.println("Los profesores se presentan y dan a conocer el silabus para este I ciclo");
        System.out.println("Te das cuenta de que el trabajo y los estudios son una combinación difícil, pero estás decidido a seguir adelante.");
        System.out.println("A pesar de las dificultades, te esfuerzas por mantener un equilibrio entre el trabajo y los estudios.");
        System.out.println("Al terminar tus clases el dia viernes tus compañeros te invitan a dar un paseo");
        System.out.println("1. Aceptar la invitación y salir con ellos");
        System.out.println("2. Rechazar la invitación y quedarte en casa a descansar");
        int Salir_camino3 = sc.nextInt();
        switch (Salir_camino3) {
            case 1 ->
                opcionAceptarInvitacion(jugador, sc);
            case 2 ->
                opcionRechazarInvitacion(jugador, sc);
            default ->
                System.out.println("Decidiste no salir y quedarte en casa a descansar.");
        }
    }

    public static void opcionAceptarInvitacion(Jugador jugador, Scanner sc) {
        System.out.println("Decidiste aceptar la invitación y salir con tus compañeros.");
        System.out.println("Fueron a un parque cercano y disfrutaron de una tarde agradable.");
        System.out.println("Conociste a nuevos amigos y te sentiste parte de la comunidad universitaria.");
        System.out.println("Al final del día, te sientes más motivado para continuar con tus estudios y tu trabajo.");
        semana2(jugador, sc);
    }

    public static void opcionRechazarInvitacion(Jugador jugador, Scanner sc) {
        System.out.println("Decidiste rechazar la invitación y quedarte en casa a descansar.");
        System.out.println("Pasaste el fin de semana estudiando y preparándote para la próxima semana.");
        System.out.println("Aunque te perdiste de una buena oportunidad para socializar, te sientes satisfecho con tu decisión de priorizar tus estudios y tu trabajo.");
        System.out.println("Semana 2");
        System.out.println("Comenzaste tu segunda semana de clases pero por el trabajo no inicias al 100%.");
        System.out.println("aun estas cansado por el trabajo y no puedes concentrarte en tus estudios.");
        System.out.println("pasan los dias y a pesar de que solo es la segunda semana, ya sientes el cansancio acumulado.");
        System.out.println("reflexionas sobre tu decision y llegas a la conclusion de que da igual si la universidad es privada o publica,");
        System.out.println("Es tu esfuerzo y dedicación lo que realmente importa.");
        semana2(jugador, sc);
    }

    public static void semana2(Jugador jugador, Scanner sc) {
        System.out.println("Comenzaste tu segunda semana de clases pero por el trabajo no inicias al 100%.");
        System.out.println("aun estas cansado por el trabajo y no puedes concentrarte en tus estudios.");
        System.out.println("pasan los dias y a pesar de que solo es la segunda semana, ya sientes el cansancio acumulado.");
        System.out.println("pero aun asi debes seguir adelante., se asercan los parciales y debes prepararte.");
        System.out.println("1. Estudiar intensamente para los parciales");
        System.out.println("2. Tomar un descanso y relajarte un poco");
        int decision3 = sc.nextInt();
        sc.nextLine();
        switch (decision3) {
            case 1 ->
                estudiarIntensamente(jugador, sc);
            case 2 ->
                tomarDescanso(jugador, sc);
            default ->
                System.out.println("Opción inválida. No tomas ninguna acción.");
        }
    }

    public static void estudiarIntensamente(Jugador jugador, Scanner sc) {
        System.out.println("Decidiste estudiar intensamente para los parciales.");
        System.out.println("Pasaste horas revisando tus apuntes y haciendo ejercicios.");
        jugador.aumentarConfianza(1);
        System.out.println("Confianza aumentada a: " + jugador.confianza);
        semana3(jugador, sc);
    }

    public static void tomarDescanso(Jugador jugador, Scanner sc) {
        System.out.println("Decidiste tomar un descanso y relajarte un poco.");
        System.out.println("Pasaste tiempo con amigos, viendo una película o jugando videojuegos.");
        System.out.println("Aunque no estudiaste tanto como deberías, te sientes renovado y listo para enfrentar los parciales.");
        jugador.aumentarConfianza(1);
        System.out.println("Confianza aumentada a: " + jugador.confianza);
        System.out.println("Recuerda que el equilibrio entre estudio y descanso es importante para tu bienestar.");
        semana3(jugador, sc);
    }

    public static void semana3(Jugador jugador, Scanner sc) {
        System.out.println("SEMANA 3: PARCIALES");
        System.out.println("Los parciales están a la vuelta de la esquina y debes prepararte.");
        System.out.println("Tus compañeros te sugieren formar un grupo de estudio.");
        System.out.println("1. Aceptar la sugerencia y unirte al grupo de estudio");
        System.out.println("2. Estudiar solo en casa");
        int decision4 = sc.nextInt();
        sc.nextLine();

        switch (decision4) {
            case 1 ->
                unirte(jugador, sc);
            case 2 ->
                estudiarSolo(jugador, sc);
            default ->
                System.out.println("Opción inválida. No tomas ninguna acción.");
        }
    }

    public static void unirte(Jugador jugador, Scanner sc) {
        System.out.println("Decidiste unirte al grupo de estudio.");
        System.out.println("Trabajaron juntos, compartieron conocimientos y se ayudaron mutuamente.");
        System.out.println("Al final, te sientes más preparado para los parciales.");
        jugador.aumentarCarisma(1);
        jugador.aumentarInteligencia(1);
        System.out.println("Carisma aumentado a: " + jugador.carisma + ", Inteligencia aumentada a: " + jugador.inteligencia);
        System.out.println("Confianza actual: " + jugador.confianza);
        semana4(jugador, sc);
    }

    public static void estudiarSolo(Jugador jugador, Scanner sc) {
        System.out.println("Decidiste estudiar solo en casa.");
        jugador.aumentarConfianza(1);
        jugador.aumentarInteligencia(1);
        System.out.println("Confianza aumentada a: " + jugador.confianza + ", Inteligencia aumentada a: " + jugador.inteligencia);
        semana4(jugador, sc);
    }

    public static void semana4(Jugador jugador, Scanner sc) {
        System.out.println("SEMANA 4: EXÁMENES");
        System.out.println("Los exámenes están aquí y debes dar lo mejor de ti.");
        System.out.println("te sientes nervioso pero decidido a enfrentar el desafío.");
        System.out.println("1. Estudiar hasta el último minuto antes del examen");
        System.out.println("2. Confiar en tu preparación y relajarte antes del examen");
        int decision5 = sc.nextInt();
        sc.nextLine();

        switch (decision5) {
            case 1 ->
                estudiarUltimoMinuto(jugador);
            case 2 ->
                confiarPreparacion(jugador);
            default ->
                System.out.println("Opción inválida. No tomas ninguna acción.");
        }
    }

    public static void estudiarUltimoMinuto(Jugador jugador) {
        System.out.println("Decidiste estudiar hasta el último minuto antes del examen.");
        System.out.println("Pasaste la noche revisando tus apuntes y haciendo ejercicios.");
        System.out.println("Aunque te sientes cansado, confías en que tu esfuerzo dará sus frutos.");
        jugador.aumentarConfianza(1);
        System.out.println("Confianza aumentada a: " + jugador.confianza);
        System.out.println("¡Buena suerte en los exámenes!");
        FindelJuego(jugador);
    }

    public static void confiarPreparacion(Jugador jugador) {
        System.out.println("Decidiste confiar en tu preparación y relajarte antes del examen.");
        System.out.println("Pasaste la noche descansando y durmiendo bien.");
        System.out.println("Te sientes fresco y listo para enfrentar el desafío.");
        jugador.aumentarConfianza(1);
        System.out.println("Confianza aumentada a: " + jugador.confianza);
        System.out.println("¡Buena suerte en los exámenes!");
        FindelJuego(jugador);
    }

    public static void FindelJuego(Jugador jugador) {
        System.out.println("FELICIADES, OBTUVISTE BUENOS RESULTADOS EN LOS EXÁMENES.");
        System.out.println("TU ESFUERZO Y DEDICACION VALIO LA PENA.");
        System.out.println("Y RECUERDA....DA IGUAL SI LA UNIVERSIDAD ES PRIVADA O PUBLICA");
        System.out.println("LO IMPORTANTE ES TU ESFUERZO Y DEDICACIÓN.");
        System.out.println("Gracias por jugar. Fin de la vercion beta  :3");
    }
}
