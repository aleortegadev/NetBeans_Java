/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_5;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primero numero: ");
        int num1 = teclado.nextInt();
        teclado.nextLine();

        if (num1 % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        teclado.close();
        // TODO code application logic here
    }
    
}
