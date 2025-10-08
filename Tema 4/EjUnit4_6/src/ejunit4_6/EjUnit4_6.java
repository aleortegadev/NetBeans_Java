/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_6;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        double num1 = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Introduce el segundo número: ");
        double num2 = teclado.nextDouble();
        teclado.nextLine();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("La division es " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre 0");
        }
        teclado.close();
        // TODO code application logic here
    }
    
}
