/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej9_10;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej9_10 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que cree dos vectores de 10 elementos de tipo
     * entero. Cargarlos, visualizarlos y cargar un tercer vector con la suma de
     * los dos vectores, posición a posición. Visualizar el vector resultado.
     *
     * Crea un programa en Java que mejore el ejercicio anterior en caso de que
     * tengan distintas longitudes
     */
    public static void main(String[] args) {

        final int tamañoA = 12;
        final int tamañoB = 7;

        int[] vectorA = new int[tamañoA];

        int[] vectorB = new int[tamañoB];

        int[] vectorSuma;

        System.out.println("Dime el primer vector");
        cargarVector(vectorA);

        System.out.println("Dime el segundo vector");
        cargarVector(vectorB);

        System.out.println("Mostrar el primer vector:");
        visualizarVector(vectorA);

        System.out.println("Mostrar el segundo vector:");
        visualizarVector(vectorB);

        vectorSuma = sumarVector(vectorA, vectorB);
        System.out.println("Visualizar suma:");
        visualizarVector(vectorSuma);

    }

    public static void cargarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce valor para la posición [" + i + "]: ");
            vector[i] = teclado.nextInt();
        }

    }

    public static void visualizarVector(int[] vector) {

        for (int num : vector) {
            System.out.println(num);
        }

    }

    public static int[] sumarVector(int[] vector1, int[] vector2) {

        int longitudComun = Math.min(vector1.length, vector2.length);

        int[] vectorResultado = new int[longitudComun];

        for (int i = 0; i < longitudComun; i++) {

            vectorResultado[i] = vector1[i] + vector2[i];

        }

        return vectorResultado;

    }
}
