/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_21;

import java.util.Random;

/**
 *
 * @author meler
 */
public class EjUnit4_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random valor = new Random();

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        int numero;

        do {
            numero = valor.nextInt(5) + 1;
            System.out.println("El numero aleatorio es: " + numero);

            switch (numero) {
                case 1:
                    contador1++;
                    break;

                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
            }

        } while (contador1 == 0 || contador3 < contador1 * 2);

        System.out.println("Cantidad de 1: " + contador1);
        System.out.println("Cantidad de 2: " + contador2);
        System.out.println("Cantidad de 3: " + contador3);
        System.out.println("Cantidad de 4: " + contador4);
        System.out.println("Cantidad de 5: " + contador5);

    }

}
