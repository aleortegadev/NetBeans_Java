/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Ej2 {

    /**
     * Crea un programa en Java que cree un vector de 10 elementos de tipo
     * entero. Cargarlo, visualizarlo y pedir una posición por teclado y mostrar
     * el dato contenido en el vector en dicha posición.
     *
     * Mejorar el ejercicio anterior controlando que la posición sea correcta,
     * si no lo es, volver pedir la posición.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Dime un numero: ");
            num1 = teclado.nextInt();
            vector[i] = num1;

        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Los vectores son: ");
            System.out.println(vector[i]);
        }
        int posicion;

        do {
            System.out.println("Introuzca la posición que quiere: ");
            posicion = teclado.nextInt();

            if (posicion < 0 || posicion >= vector.length) {
                System.out.println("Incorrecto: " + posicion + " es invalida. Debe estar entre el 0 - 9 ");
            }

        } while (posicion < 0 || posicion >= vector.length);

        int datoEnPosicion = vector[posicion];

        System.out.println("El dato contenido en el indice "
                + posicion + " es " + datoEnPosicion);

    }
}
