/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_14;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double fahrenheit = 0;

        while (fahrenheit != 999) {
            System.out.print("Introduce la temperatura en Fahrenheit ");
            fahrenheit = teclado.nextDouble();
            teclado.nextLine();

            if (fahrenheit != 999) {
                double celsius = 5.0 / 9.0 * (fahrenheit - 32);
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
                System.out.println();
            }
        }

        System.out.println("Programa finalizado");

        teclado.close();
        // TODO code application logic here
    }

}
