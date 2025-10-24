/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_19;

/**
 *
 * @author meler
 */
public class EjUnit4_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int contador = 0;

        for (int i = 40; i >= 5; i -= 5) {
            System.out.println();
            suma = suma + i;
            contador++;
        }

        double media = (double) suma / contador;
        
        System.out.println("\nCantidad de números: " + contador);
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
    }

}
