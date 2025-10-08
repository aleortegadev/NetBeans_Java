/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_1;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class EjUnit4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce el primer numero por teclado: ");
        double num1 = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("Introduce el segundo numero por teclado");
        double num2 = teclado.nextDouble();
        teclado.nextLine();
        
        if (num1 > num2) {
            System.out.println("El mayor es: " +num1);
        // TODO code application logic here
    }
    
}
