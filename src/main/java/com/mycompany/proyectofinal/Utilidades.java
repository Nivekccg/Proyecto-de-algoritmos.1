/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal;

/**
 * Clase que contiene métodos utilitarios comunes para el juego
 */
public class Utilidades {
    
    public static void imprimirDecorado(String frase) {
        String[] lineas = frase.split("\n");
        int maxLargo = 0;
        for (String linea : lineas) {
            if (linea.length() > maxLargo) {
                maxLargo = linea.length();
            }
        }

        String borde = "=".repeat(maxLargo);
        System.out.println(borde);
        for (String linea : lineas) {
            System.out.println(linea);
        }
        System.out.println(borde);
    }
    
    public static void mostrarOpcionesIniciales() {
        String[] opciones = {
            "1. Empezar ya mismo a estudiar para dar tu examen de admision en una universidad publica.",
            "2. Esperar a que tus padres puedan darte estudios en una universidad privada y tomar un año sabático.",
            "3. Trabajar para pagarte una universidad privada."
        };

        System.out.println();
        for (String opcion : opciones) {
            System.out.println(opcion);
        }

        System.out.print("Ingresa una opcion (1-3): ");
    }
}
