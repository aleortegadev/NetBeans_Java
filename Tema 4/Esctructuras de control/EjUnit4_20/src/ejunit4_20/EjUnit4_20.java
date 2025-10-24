/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_20;

import java.util.Random;

/**
 *
 * @author meler
 */
public class EjUnit4_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random valor = new Random();

        int numero;
        int contador = 0;
        int suma = 0;

        do {
            numero = valor.nextInt(10) + 1;
            System.out.println("Numero aleatorio: " + numero);

            contador++;
            suma += numero;

        } while (numero != 5);

        double media = (double) suma / contador;

        System.out.println("Cantidad de numeros generados: " + contador);
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
    }
}
