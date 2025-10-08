/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_4;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primero numero: ");
        double num1 = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Introduce un segundo numero: ");
        double num2 = teclado.nextDouble();
        teclado.nextLine();

        if (num2 == 0) {
            System.out.println("No se puede dividir entre 0");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " es divisible entre " + num2);
        } else {
            System.out.println(num1 + " no es divisible entre " + num2);
          
    }
        
        teclado.close();
        
        // TODO code application logic here
    }
    
}
