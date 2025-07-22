/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal;

/**
 * Clase que representa al jugador del juego
 */
public class Jugador {
    public String nombre;
    public String ciudad;
    public int carisma;
    public int inteligencia;
    public int confianza;
    public int correctasParcial1;
    public int correctasParcial2;

    public Jugador(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.carisma = 0;
        this.inteligencia = 0;
        this.confianza = 0;
    }

    public void aumentarCarisma(int puntos) {
        this.carisma += puntos;
    }

    public void aumentarConfianza(int puntos) {
        this.confianza += puntos;
    }

    public void aumentarInteligencia(int puntos) {
        this.inteligencia += puntos;
    }

    public void mostrarEstado() {
        System.out.println("\n--- Estado actual del jugador ---");
        System.out.println("Inteligencia: " + inteligencia + " | Carisma: " + carisma + " | Confianza: " + confianza);
        System.out.println("Ciudad: " + ciudad + " | Nombre: " + nombre);
    }
}
