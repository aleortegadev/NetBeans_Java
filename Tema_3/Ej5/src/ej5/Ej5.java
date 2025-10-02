/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce tu primer apellido: ");
        String apellido1 = teclado.nextLine();
        
        System.out.println("Introduce tu segundo apellido: ");
        String apellido2 = teclado.nextLine();
        
        char inicialNombre = nombre.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);
        
        System.out.println("Tus iniciales son: " +inicialNombre
        +inicialApellido1 + inicialApellido2);
        
        teclado.close();
        
        // TODO code application logic here
    }
    
}
