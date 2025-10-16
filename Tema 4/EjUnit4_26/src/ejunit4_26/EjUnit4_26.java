/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_26;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero para calcular su factorial: ");
        int numero = teclado.nextInt();

        long factorial = 1;

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo");
        } else if (numero == 0 || numero == 1) {
            System.out.println("El factorial de " + numero + " es: 1");
        } else {
            System.out.print("Cálculo: " + numero + "! = ");

            for (int i = numero; i >= 1; i--) {
                factorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" × ");
                }
            }

            System.out.println(" = " + factorial);
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        teclado.close();
    }
}
