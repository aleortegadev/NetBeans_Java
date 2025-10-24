/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejprintf3;

/**
 *
 * @author Ale
 */
public class EJPrintf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Alejandro";
        String apellidos = "Melero Ortega";
        int edad = 18;
        String fechaNacimiento = "21/02/2007";
        double altura = 1.85;
        String ciudad = "Albacete";
        int telefono = 632521146;

        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Apellidos: %s%n", apellidos);
        System.out.printf("Edad: %daños%n", edad);
        System.out.printf("Fecha de nacimiento: %s%n", fechaNacimiento);
        System.out.printf("Altura %.2f metros%n", altura);
        System.out.printf("Ciudad: %s%n", ciudad);
        System.out.printf("Telefono: %d%n", telefono);
        // TODO code application logic here
    }

}
