/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif;

/**
 *
 * @author Ale
 */
public class EjIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 12;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            System.out.println("Ya puedes votar");
        } else {
            if (edad <= 12) {
                System.out.println("Vas al colegio");
            } else {
                System.out.println("Vas al instiuto");
            }
        }

        // TODO code application logic here
    }

}
