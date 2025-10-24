/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_11;

import java.util.Scanner;

/**
 *
 * @author meler 
 */
public class EjUnit4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        int num1 = teclado.nextInt();
        teclado.nextLine();
        
        int suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            suma = suma + (num1 + i);
        }
        System.out.println("La suma de los 100 numeros " + num1 +" es: "+ suma);
        teclado.close();
        // TODO code application logic here
    }
    
}
