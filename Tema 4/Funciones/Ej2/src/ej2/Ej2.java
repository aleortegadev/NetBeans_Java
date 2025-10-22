/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static boolean pares(int num1) {
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero por teclado: ");
        int num1 = teclado.nextInt();
        teclado.nextLine();

        boolean resultado = pares(num1);

        if (resultado) {
            System.out.println("El numero " + num1 + " es par");
        } else {
            System.out.println("El numero " + num1 + " es impar");
        }

    }

}
