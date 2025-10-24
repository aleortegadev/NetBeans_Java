/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejvar13;

/**
 *
 * @author Ale
 */
public class EjVar13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vPrecio = 150, vIVA = 0.0, vPrecioConIVA = 0.0;

        vIVA = vPrecio * 0.21;
        vPrecioConIVA = vPrecio + vIVA;
        System.out.println("El precio con IVA es: " + vPrecioConIVA);

        // TODO code application logic here
    }

}
