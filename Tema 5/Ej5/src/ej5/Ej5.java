/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Ej5 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que cree un vector de 10 elementos de tipo
     * entero. Cargarlo, visualizarlo y visualizar todos los elementos del
     * vector que son superiores a su media, indicando la posición que ocupan.
     */
    public static void main(String[] args) {
        int tamaño = 10;
        int[] miVector = new int[tamaño];

        cargarVector(miVector);

        visualizarVector(miVector);

        int sumaTotal = calcularSuma(miVector);

        double media = calcularMedia(sumaTotal, miVector.length);

        visualizarMayorMedia(miVector, media);

        teclado.close();
    }

    public static void cargarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Dime un numero: ");
            vector[i] = teclado.nextInt();
        }
    }

    public static void visualizarVector(int[] vector) {

        for (int num1 : vector) {
            System.out.println(num1);
        }
    }

    public static int calcularSuma(int[] vector) {

        int suma = 0;
        for (int elemento : vector) {

            suma += elemento;

        }
        return suma;

    }

    public static double calcularMedia(int suma, int longitud) {
        return (double) suma / longitud;

    }

    public static void visualizarMayorMedia(int[] vector, double media) {

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > media) {

                System.out.println("EL elemento mayore que la media es: " + vector[i] + " y está en la posicion " + i);
            }

        }
    }
}
