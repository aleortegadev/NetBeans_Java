/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_24;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numero = teclado.nextInt();

        System.out.println("Tabla del " + numero);

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        teclado.close();
    }
}

