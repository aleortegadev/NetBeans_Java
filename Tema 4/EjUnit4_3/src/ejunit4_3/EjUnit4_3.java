/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_3;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        double num1 = teclado.nextDouble();
        teclado.nextLine();

        if (num1 > 25) {
            System.out.println("El numero es mayor quye 25");
        } else {
            System.out.println("El numero es menor que 25");
        }
        teclado.close();
        // TODO code application logic here
    }
    
}
