/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba7;

import java.util.Scanner;

public class Prueba7 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * Crea un programa en Java que cree un vector de 10 elementos de tipo
     * entero. Cargarlo y visualizarlo. Guardar en un segundo vector todos los
     * datos del primero que son superiores a un número dado, que pediremos por
     * teclado. Visualizar el vector resultante.
     */
    public static void main(String[] args) {
    }

    public static void cargarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Dime un numero: ");
            vector[i] = teclado.nextInt();
        }
    }

    public static void visualizarVector(int[] vector) {

        for (int num1 : vector) {
            System.out.println(num1);
        }
    }
    
    

}
