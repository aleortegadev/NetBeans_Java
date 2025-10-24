/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_12;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_12 {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un numero entero");
        int num1 = teclado.nextInt();
        teclado.nextLine();
        
         for (int i = 1; i < num1; i += 2) {
            System.out.println(i);
        }
        
        teclado.close();
    }
}