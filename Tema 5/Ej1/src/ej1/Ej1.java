/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    //Crea un programa en Java que cree un vector de 10 elementos de tipo
    //entero, cárgalo por teclado y visualiza por pantalla todos sus elementos.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; ++i) {
            System.out.println("Escribe un numero:");
            num1 = teclado.nextInt();
            vector[i] = num1;
        }

        System.out.println("El vector es igual:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
