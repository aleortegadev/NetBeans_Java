/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejscandatos4;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class EJScanDatos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Introduce tus apellidos: ");
        String apellidos = teclado.nextLine();
        
        System.out.print("Introduce tu número de DNI: ");
        String dni = teclado.nextLine();
        
        System.out.print("Introduce tu sexo : ");
        String sexo = teclado.nextLine();
        
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Introduce tu fecha de nacimiento : ");
        String fechaNacimiento = teclado.nextLine();
        
        System.out.print("Introduce tu altura en metros: ");
        double altura = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.print("Introduce tu dirección: ");
        String direccion = teclado.nextLine();
        
        System.out.print("Introduce tu localidad: ");
        String localidad = teclado.nextLine();
        
        System.out.print("Introduce tu código postal: ");
        int codigoPostal = teclado.nextInt();
        
        System.out.println("\n--- DATOS INTRODUCIDOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Dirección: " + direccion);
        System.out.println("Localidad: " + localidad);
        System.out.println("Código postal: " + codigoPostal);
        
        teclado.close();
        // TODO code application logic here
    }
    
}
