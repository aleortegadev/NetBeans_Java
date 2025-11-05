/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej6 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que cree un vector de 10 elementos de tipo
     * entero. Cargarlo, visualizarlo y mostar el número más alto y el más bajo
     * del vector.
     */
    public static void main(String[] args) {
        
        int tamaño = 10;
        int[] miVector = new int[tamaño];
        
        cargarVector(miVector);
        visualizarVector(miVector);
        
        mostrarAlto(miVector);
        
        mostrarBajo(miVector);
        
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

    public static void mostrarAlto(int[] vector) {

        int maximo = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }

    }

    public static void mostrarBajo(int[] vector) {

        int minimo = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];

            }
        }
    }
}
