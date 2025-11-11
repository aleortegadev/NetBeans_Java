/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej13 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que nos permita mostrar las iniciales de todos
     * los nombres anteriores.
     */
    public static void main(String[] args) {

        final int tamaño = 10;

        String[] vectorCad = new String[tamaño];

        cargarVector(vectorCad);

        System.out.println("Mostrar iniciales: ");
        mostrarIniciales(vectorCad);

    }

    public static void cargarVector(String[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce valor para la posición [" + i + "]: ");
            vector[i] = teclado.nextLine();
        }

    }

    public static void mostrarIniciales(String[] vector) {

        for (String cadena : vector) {

            char inicial = cadena.trim().toUpperCase().charAt(0);
            System.out.print(inicial);

        }

    }

}
