/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejunit4_9;

/**
 *
 * @author Ale
 */
public class EjUnit4_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Numeros entre 1 y 100 que son multiplos de 5 pero no de 3");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }
        // TODO code application logic here
    }

}
