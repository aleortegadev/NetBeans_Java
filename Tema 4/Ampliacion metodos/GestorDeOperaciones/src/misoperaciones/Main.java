/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misoperaciones;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            Operaciones.mostrarMenu();

            System.out.println("Seleccione una opción: ");
            opcion = Operaciones.leerEntero(teclado);

            switch (opcion) {
                case 1:
                    Operaciones.opcionComprobarPrimo(teclado);
                    break;

                case 2:
                    Operaciones.opcionComprobarDivisor(teclado);
                    break;

                case 3:
                    Operaciones.opcionSaludar(teclado);
                    break;

                case 4:
                    Operaciones.opcionEcuacionSegundoGrado(teclado);
                    break;

                case 5:
                    System.out.println("Salir del programa");
                    break;

            }
        } while (opcion != 5);
    }

}
