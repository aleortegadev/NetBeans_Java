/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe el primero numero: ");
        int num1 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Escribe el segundo numero: ");
        int num2 = teclado.nextInt();
        teclado.nextLine();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        
        System.out.println("La suma es: " + suma);
        
        System.out.println("La resta es: " + resta);
        
        System.out.println("La multiplicacion es: " + multiplicacion);
        
        System.out.println("La division es: " + division);
    }
}
