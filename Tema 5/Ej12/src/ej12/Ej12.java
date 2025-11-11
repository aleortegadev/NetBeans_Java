/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej12 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que nos permita crear, cargar y visualizar un
     * vector de 10 nombres de personas.
     */
    public static void main(String[] args) {
        
        final int tamaño = 10;
        
        String[] vectorCad = new String [tamaño];
        
        cargarVector(vectorCad);
        
        System.out.println("Aqui tienes la cadena: ");
        visualizarVector(vectorCad);
            
    }

    public static void cargarVector(String[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce valor para la posición [" + i + "]: ");
            vector[i] = teclado.nextLine();
        }

    }

    public static void visualizarVector(String[] vector) {

        for (String cadena : vector) {
            System.out.println(cadena);
        }

    }

}
