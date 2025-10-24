/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_29;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero entero: ");
        int num1 = teclado.nextInt();

        int suma = 0;

        while (num1 > 0) {
            int cifra = num1 % 10;
            suma += cifra;
            num1 = num1 / 10;

        }
        System.out.println("Suma de sus cifras: " + suma);
    }

}
