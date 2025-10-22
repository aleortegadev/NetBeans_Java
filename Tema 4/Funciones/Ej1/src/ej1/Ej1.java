/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author meler
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    
    public static int mayorMenor (int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el primero numero: ");
        int num1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Escribe el segundo numero: ");
        int num2 = teclado.nextInt();
        teclado.nextLine();
            
        int resultado = mayorMenor (num1,num2);
        
        System.out.println("El mayor de " + num1 + " y " + num2 + " es " + resultado);
        }
    }

