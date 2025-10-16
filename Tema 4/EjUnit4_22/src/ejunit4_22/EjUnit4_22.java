/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_22;

import java.util.Random;

/**
 *
 * @author meler
 */
public class EjUnit4_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random valor = new Random();

        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;

        char caracter;
        boolean continuar = true;

        do {
            caracter = (char) (valor.nextInt(95) + 32);

            System.out.println("Caracter generado: " + caracter);

            if (Character.isUpperCase(caracter)) {
                contadorMayusculas++;
                System.out.println("Mayúscula");
            } else if (Character.isLowerCase(caracter)) {
                contadorMinusculas++;
                System.out.println("Minúscula");
            } else if (Character.isDigit(caracter)) {
                contadorNumeros++;
                System.out.println("Número");
            } else {

                System.out.println("Caracter especial");
                continuar = false;
            }
        } while (continuar);
        System.out.println("Mayúsculas generadas: " + contadorMayusculas);
        System.out.println("Minúsculas generadas: " + contadorMinusculas);
        System.out.println("Números generados: " + contadorNumeros);
    }

}
