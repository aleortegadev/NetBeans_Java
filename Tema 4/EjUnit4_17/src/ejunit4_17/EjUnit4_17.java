/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_17;

/**
 *
 * @author meler
 */
public class EjUnit4_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            suma = suma + i;
            contador++;
        }
        System.out.println("\nCantidad de números: " + contador);
        System.out.println("Suma total: " + suma);
    }

}
