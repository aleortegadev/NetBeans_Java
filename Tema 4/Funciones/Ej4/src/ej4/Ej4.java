/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

/**
 *
 * @author meler
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int añoPrueba1 = 2024;

        int añoPrueba2 = 1901;

        int añoPrueba3 = 2004;

        System.out.println(añoPrueba1 + " es " + esBisiesto(añoPrueba1));
        
        System.out.println(añoPrueba2 + " es " + esBisiesto(añoPrueba2));
        
        System.out.println(añoPrueba3 + " es  " + esBisiesto(añoPrueba2));
        
    }

    public static boolean esBisiesto(int año) {

        return ((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0);
    }
}
