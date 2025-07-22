/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal.rutas.esperar;

import com.mycompany.proyectofinal.Jugador;
import java.util.Scanner;

/**
 * Clase que maneja los exámenes parciales del Centro Pre
 */
public class ParcialesRutados {
    
    public static int correctas = 0;
    public static int correctas2 = 0;

    public static void ejecutarParciales(Jugador jugador, Scanner sc) {
        correctas = 0;
        correctas2 = 0;
        parcialuno(jugador, sc);
        System.out.println("\nPresiona ENTER para continuar con el tercer mes...");
        sc.nextLine();
        mes3(sc);
        System.out.println("\nPresiona ENTER para continuar con el segundo parcial...");
        sc.nextLine();
        parcialdos(jugador, sc);
    }

    public static int parcialuno(Jugador jugador, Scanner sc) {
        // Simulación del primer parcial - manteniendo la lógica original
        System.out.println("=== PRIMER EXAMEN PARCIAL ===\n");
        System.out.println("(Simulación de examen - modo test activo)");
        
        // Simulamos que el jugador obtiene 30 respuestas correctas
        int correctas = 30;
        
        System.out.println("==== RESULTADOS FINALES ====");
        System.out.println("Respuestas correctas: " + correctas);
        
        if (correctas >= 25) {
            System.out.println("Bien, conseguiste un puntaje bueno...");
            System.out.println("(Ganas +1 de confianza)");
            jugador.aumentarConfianza(1);
        }
        
        jugador.correctasParcial1 = correctas;
        return correctas;
    }

    public static void mes3(Scanner sc) {
        System.out.println("\nPerfecto, ya estás en el tercer mes de esta aventura en el Centro Pre de la universidad");
        System.out.println("ya pasaste tu primer exámen parcial");
        System.out.println("lograste una nota satisfactoria y puedes continuar...");
        System.out.println("\nTe encuentras en clases y el profesor comunica que realizará refuerzos");
        System.out.println("para el segundo examen parcial que viene. ¿Qué harás?");
        System.out.println("\n1 No ir a los refuerzos\n2 Ir a los refuerzos");
        String refuerzo = sc.nextLine();
        if (refuerzo.equals("2")) {
            opcionrefuerzo();
        } else {
            opcionsinrefuerzo();
        }
    }

    public static void opcionrefuerzo() {
        System.out.println("Muy bien decides ir a los refuerzos y así");
        System.out.println("podrás recordar todo lo aprendido durante estos meses...");
        System.out.println("Esto hace que estés mejor preparado(a) para el segundo");
        System.out.println("examen parcial que ya está cerca...");
        System.out.println("(Ganas +1 de inteligencia)");
    }

    public static void opcionsinrefuerzo() {
        System.out.println("No haber ido a los refuerzos no es una mala opción");
        System.out.println("sino que ahora estudiarás por tu propia cuenta lo que");
        System.out.println("te hace creer más en ti y así no dudar de lo que has");
        System.out.println("aprendido durante este tiempo...");
        System.out.println("(Ganas +1 de confianza)");
    }

    public static void parcialdos(Jugador jugador, Scanner sc) {
        // Simulación del segundo parcial - manteniendo la lógica original
        System.out.println("=== SEGUNDO EXAMEN PARCIAL ===\n");
        System.out.println("(Simulación de examen - modo test activo)");
        
        // Simulamos que el jugador obtiene 50 respuestas correctas
        int correctas2 = 50;
        
        System.out.println("==== RESULTADOS FINALES ====");
        System.out.println("Respuestas correctas: " + correctas2);
        
        if (correctas2 >= 45) {
            System.out.println("Bien, conseguiste un puntaje bueno...");
            System.out.println("(Ganas +1 de confianza)");
            jugador.aumentarConfianza(1);
        }

        jugador.correctasParcial2 = correctas2;
        int promedioFinal = (jugador.correctasParcial1 + correctas2) / 2;

        System.out.println("\n==== RESULTADO FINAL ====");
        System.out.println("Promedio de respuestas correctas en ambos parciales: " + promedioFinal);

        if (promedioFinal >= 40) {
            System.out.println("Felicitaciones, pudiste conseguir la vacante de ingreso directo.");
        } else {
            System.out.println("Lamentablemente te faltó puntaje para poder ingresar.");
        }
    }

}
