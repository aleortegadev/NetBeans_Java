/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_25;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("El número " + numero + " Es primo");
        } else {
            System.out.println("El número " + numero + " No es primo");
        }

        teclado.close();
    }
}
