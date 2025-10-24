/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejiunit4_2;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjIUnit4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduyce un numero: ");
        double num1 = teclado.nextDouble();
        teclado.nextLine();

        if (num1 >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
        teclado.close();
        // TODO code application logic here
    }
    
}
