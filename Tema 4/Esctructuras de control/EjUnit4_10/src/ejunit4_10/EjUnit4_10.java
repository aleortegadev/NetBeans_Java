/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_10;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class EjUnit4_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la base: ");
        int base = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        teclado.nextLine();
        
        int resultado = 1;
        for (int i = 1; i <= exponente; i++){
            resultado = resultado * base;
        }
        
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        
        teclado.close();
        // TODO code application logic here
    }
    
}
