/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_13;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class EjUnit4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce a: ");
        double a = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Introduce b: ");
        double b = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Introduce c: ");
        double c = teclado.nextDouble();
        teclado.nextLine();

        double discriminante = b * b - 4 * a * c;

        System.out.println("El discriminante es: " + discriminante);

        if (discriminante > 0) {
            double raizDiscriminante = 1;
            double temp = discriminante;

            for (int i = 0; i < 20; i++) {
                raizDiscriminante = (raizDiscriminante + temp / raizDiscriminante) / 2;
            }

            double x1 = (-b + raizDiscriminante) / (2 * a);
            double x2 = (-b - raizDiscriminante) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una solución:");
            System.out.println("x = " + x);
        } else {
            System.out.println("La ecuación no tiene solución real (discriminante negativo)");
        }

        teclado.close();
        // TODO code application logic here
    }

}
