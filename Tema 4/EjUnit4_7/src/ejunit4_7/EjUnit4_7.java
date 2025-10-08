/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_7;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num1 = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Introduce un número: ");
        int num2 = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Introduce un número: ");
        int num3 = teclado.nextInt();
        teclado.nextLine();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
        teclado.close();
        // TODO code application logic here
    }
    
}
