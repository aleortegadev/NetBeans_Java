/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejrangos;

/**
 *
 * @author Ale
 */
public class EjRangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota=9;
        if (nota<=10 && nota>=9) {
            System.out.println("Sobresaliente");
        }
        else{
            if (nota<9 && nota>=7){
                System.out.println("Notable");
            } else {
                if(nota<7 && nota>=6){
                    System.out.println("Bien");
                }else{
                    if(nota<6 && nota>=5){
                        System.out.println("Suficiente");
                    }else{
                        System.out.println("Suspenso");
                    }
                }
            }
            