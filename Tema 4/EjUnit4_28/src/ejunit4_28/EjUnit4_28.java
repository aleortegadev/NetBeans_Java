/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_28;

/**
 *
 * @author meler
 */
public class EjUnit4_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contadorPares = 0;

        for (int i = 1; i <= 45; i++) {

            for (int j = 1; j <= 45; j++) {

                if (i % 10 == j % 10) {
                    System.out.println("El numero: " + i + " y " + j + " son numeros gemelos");
                    contadorPares++;
                }
            }

        }
        System.out.println("Total de pares gemelos: " + contadorPares);
    }
}
