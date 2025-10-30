/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            funcionesOperaciones.mostrarMenu();

            System.out.println("Seleccione una opción: ");
            opcion = funcionesOperaciones.mostrarMenu(teclado);

            switch (opcion) {
                case 1:
                    funcionesOperaciones.opcionComprobarPrimo(teclado);
                    break;

                case 2:
                    funcionesOperaciones.opcionComprobarDivisor(teclado);
                    break;

                case 3:
                    funcionesOperaciones.opcionSaludar(teclado);
                    break;

                case 4:
                    funcionesOperaciones.opcionEcuacionSegundoGrado(teclado);
                    break;

                case 5:
                    System.out.println("Salir del programa");
                    break;

            }
        } while (opcion != 5);
    }

}
