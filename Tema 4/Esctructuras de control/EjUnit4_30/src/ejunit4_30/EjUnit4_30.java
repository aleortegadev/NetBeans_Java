/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_30;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        int mayor = numero;
        int menor = numero;
        int contador = 0;

        if (numero == 0) {
            System.out.println("No se introdujo ningún número válido.");
        } else {
            contador++;

            while (true) {
                System.out.print("Introduce un número: ");
                numero = teclado.nextInt();

                if (numero == 0) {
                    break;
                }

                contador++;

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            System.out.println("Número MAYOR: " + mayor);
            System.out.println("Número MENOR: " + menor);
        }

        teclado.close();
    }

}
