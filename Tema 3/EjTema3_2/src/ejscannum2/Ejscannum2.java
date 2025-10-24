/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejscannum2;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Ejscannum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multipliación es " + (num1 * num2));
        System.out.println("La division es: " + ((double) num1 / num2));
        System.out.println("El resto es " + (num1 % num2));

        teclado.close();
                
        // TODO code application logic here
    }
    
}
