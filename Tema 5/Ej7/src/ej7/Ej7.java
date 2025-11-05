/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej7 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que cree un vector de 10 elementos de tipo
     * entero. Cargarlo y visualizarlo. Guardar en un segundo vector todos los
     * datos del primero que son superiores a un número dado, que pediremos por
     * teclado. Visualizar el vector resultante.
     */
    public static void main(String[] args) {

        int tamaño = 10;

        int[] vectorOriginal = new int[tamaño];

        cargarVector(vectorOriginal);

        visualizarVector(vectorOriginal);

        int umbral = teclado.nextInt();

        int[] vectorFiltrado = filtrarVector(vectorOriginal, umbral);

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

    public static int[] filtrarVector(int[] original, int umbral) {

        int contadorElementos = 0;
        for (int elemento : original) {
            if (elemento > umbral) {
                contadorElementos++;
            }
        }

        int[] nuevoVector = new int[contadorElementos];

        int indiceNuevo = 0;
        for (int elemento : original) {
            if (elemento > umbral) {
                nuevoVector[indiceNuevo] = elemento;

                indiceNuevo++;
            }
        }

        return nuevoVector;
    }
}
