/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej8 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que cree un vector de 10 elementos de tipo
     * entero. Cargarlo y visualizarlo. Guardar en un segundo vector todos los
     * datos del primero que son superiores a su media. Visualizar el vector
     * resultante.
     */
    public static void main(String[] args) {

        int tamaño = 10;

        int[] vectorOriginal = new int[tamaño];

        cargarVector(vectorOriginal);

        visualizarVector(vectorOriginal);

        int sumaTotal = calcularSuma(vectorOriginal);
        double media = calcularMedia(sumaTotal, tamaño);

        System.out.println("La media de los elementos es: " + media);

        int[] vectorFiltrado = filtrarMayorMedia(vectorOriginal, media);

        visualizarVector(vectorFiltrado);

        teclado.close();
    }

    public static void cargarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Dime un número para la posición [" + i + "]: ");
            vector[i] = teclado.nextInt();
        }
    }

    public static void visualizarVector(int[] vector) {
        System.out.print("[ ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("]");
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

    public static int[] filtrarMayorMedia(int[] original, double media) {

        int contadorElementos = 0;
        for (int elemento : original) {
            if (elemento > media) {
                contadorElementos++;
            }
        }

        int[] nuevoVector = new int[contadorElementos];

        int indiceNuevo = 0;
        for (int elemento : original) {
            if (elemento > media) {
                nuevoVector[indiceNuevo] = elemento;

                indiceNuevo++;
            }
        }

        return nuevoVector;
    }
}
