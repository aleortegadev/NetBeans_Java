/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej4 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que cree un vector de 10 elementos de tipo
     * entero. Cargarlo, visualizarlo, obtener la suma de los elementos del
     * vector y su media.
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void cargarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduzca el numero entero: ");
            vector[i] = teclado.nextInt();
        }

    }

    public static void visualizarVector(int[] vector) {

        for (int num1 : vector) {
            System.out.println(num1);

        }
    }

    public static int obtenerSuma(int[] vector) {

        int suma = 0;

        for (int elemento : vector) {

            suma += elemento;

        }
        
        return suma;

    }
    
    public static double calcularMedia(int media)

}
