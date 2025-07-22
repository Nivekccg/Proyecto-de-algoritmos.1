/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal.rutas.esperar;

import com.mycompany.proyectofinal.Jugador;
import java.util.Scanner;

/**
 * Clase que maneja la ruta de esperar para estudiar en universidad privada
 */
public class RutaEsperar {
    
    public static void opcionEsperar(Jugador jugador, Scanner sc) {
        System.out.println("\nPerfecto, hablando con tus padres decides que la mejor opción");
        System.out.println("es empezar ahora en el Centro Pre de la Universidad...");
        System.out.println("Desde ahora vendrán varios desafíos así que es momento de prepararse");
        System.out.println("Mucha suerte...");
        mes1(jugador, sc);
        mes2(jugador, sc);
        ParcialesRutados.ejecutarParciales(jugador, sc);
    }

    public static void mes1(Jugador jugador, Scanner sc) {
        System.out.println("\nEmpiezas esta nueva etapa que es el Cepre de la universidad...");
        System.out.println("Llegas al aula y ves a muchos estudiantes, ");
        System.out.println("algunos de tu edad otros mayores.");
        System.out.println("Escoge dónde sentarte:");
        System.out.println("\n1. Adelante\n2. Al medio\n3. Atrás ");
        System.out.print("Elige una opcion (1 - 3): ");
        String respuesta = sc.nextLine();
        switch (respuesta) {
            case "1" -> {
                System.out.println("Muy bien, decides sentarte adelante...");
                System.out.println("Tienes una buena visión de la pizarra y así no te distraes.");
                System.out.println("(Ganas +1 de confianza)");
                jugador.aumentarConfianza(1);
            }
            case "2" -> {
                System.out.println("Te sientas en el medio, no es mala opción");
                System.out.println("logras ver sin problema alguno la pizarra...");
            }
            case "3" -> {
                System.out.println("Decidiste sentarte atrás, si bien no es una opción recomendada ya que");
                System.out.println("no logras ver bien la pizarra, puedes socializar con varios compañeros y consigues nuevos amigos.");
                System.out.println("(Ganas +1 de carisma)");
                jugador.aumentarCarisma(1);
            }
        }
        System.out.println("\nLlega el docente a cargo, saluda a todos de una manera muy amable y ahora");
        System.out.println("pide un voluntario para presentarse, ¿Qué decides hacer?:");
        System.out.println("\n1. Levantar la mano\n2. No hacer nada y esperar a que alguien más lo haga");
        String reaccion = sc.nextLine();
        switch (reaccion) {
            case "1" -> {
                System.out.println("El profesor te felicita, algunos te miran y les das una buena vibra…");
                System.out.println("(Ganas +1 de confianza)");
                jugador.aumentarConfianza(1);
            }
            case "2" -> {
                System.out.println("Por temor no levantaste la mano y esperaste a que el profesor te llame");
                System.out.println("lo que te hace ver como alguien tímido, pero sabemos que luego irás");
                System.out.println("ganando más confianza.");
                System.out.println("(No ganas confianza)");
            }
        }
        System.out.println("\nDe esta manera desarrollaste tu primer mes en el Centro Pre de la universidad, los docentes les comunicaron ");
        System.out.println("se acerca dos evaluaciones muy importantes con las que podrán acumular puntajes y así los primeros puestos podrán");
        System.out.println("obtener el tan ansiado ingreso directo a la universidad, así que ahora tienes una nueva meta y debes esforzarte bastante ");
        System.out.println("si deseas conseguirlo...");
    }

    public static void mes2(Jugador jugador, Scanner sc) {
        System.out.println("\nEmpieza tu segundo mes del Centro Pre de la UNDC...");
        System.out.println("Este mes es muy importante para ti ya que es tu primera evauación parcial, los conocimentos");
        System.out.println("adquiridos en este primer mes los pondrás en práctica... MUCHA SUERTE");
    }
}
