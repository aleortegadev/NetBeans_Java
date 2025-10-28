/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

/**
 *
 * @author meler
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cajaTexto("hola amigos");

    }

    public static void cajaTexto(String texto) {

        int longitudCentral = texto.length() + 3;

        String asteriscos = "";

        for (int i = 0; i < longitudCentral; i++) {
            asteriscos += "*";
        }

        System.out.println(asteriscos);

        System.out.println("* " + texto + " *");

        System.out.println(asteriscos);
    }
}
