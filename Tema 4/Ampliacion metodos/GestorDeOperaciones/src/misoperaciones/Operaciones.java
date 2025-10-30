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
public class Operaciones {

    public static void mostrarMenu() {
        System.out.println("1. Comprobar si un número es primo.");
        System.out.println("2. Comprobar si el pequeño es divisor del grande.");
        System.out.println("3. Saludar según la hora.");
        System.out.println("4. Resolver ecuación de segundo grado.");
        System.out.println("5. Salir.");
        System.out.println("---------------------------");
    }

    public static int leerEntero(Scanner teclado) {
        int num = teclado.nextInt();
        teclado.nextLine();
        return num;
    }

    public static String leerTexto(Scanner teclado) {
        return teclado.nextLine();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void opcionComprobarPrimo(Scanner teclado) {
        System.out.println("Introduzca el primer numero: ");
        int num1 = leerEntero(teclado);

        System.out.println("Introduzca el segundo numero: ");
        int num2 = leerEntero(teclado);

        boolean n1EsPrimo = esPrimo(num1);
        boolean n2EsPrimo = esPrimo(num2);

        if (n1EsPrimo) {
            System.out.println(num1 + " es primo");
        } else {
            System.out.println(num1 + " no es primo");
        }

        if (n2EsPrimo) {
            System.out.println(num2 + " es primo");
        } else {
            System.out.println(num2 + " no es primo");
        }
    }

    public static void opcionComprobarDivisor(Scanner teclado) {
        System.out.print("Introduzca el primer número: ");
        int numA = leerEntero(teclado);
        System.out.print("Introduzca el segundo número: ");
        int numB = leerEntero(teclado);

        int mayor = Math.max(numA, numB);
        int menor = Math.min(numA, numB);

        if (menor == 0) {
            System.out.println("ERROR: El divisor no puede ser cero.");
            return;
        }

        if (mayor % menor == 0) {
            System.out.println("Resultado: El número más pequeño (" + menor + ") si es divisor del más grande (" + mayor);
        } else {
            System.out.println("Resultado: El número más pequeño (" + menor + ") no es divisor del más grande (" + mayor + " El resto es " + (mayor % menor));
        }
    }

    public static void opcionSaludar(Scanner teclado) {
        System.out.print("Introduzca su nombre: ");
        String nombre = leerTexto(teclado);

        System.out.print("Introduzca la hora (0-24): ");
        int hora = leerEntero(teclado);

        String saludo;
        String analisis;

        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos días " + nombre;
            analisis = "La hora está en el intervalo [6, 12], correspondiente al turno de mañana.";
        } else if (hora >= 13 && hora <= 21) {
            saludo = "Buenas tardes " + nombre;
            analisis = "La hora está en el intervalo [13, 21], correspondiente al turno de tarde.";
        } else {
            saludo = "Buenas noches " + nombre;
            analisis = "La hora está fuera de los intervalos de día y tarde, cayendo en el turno de noche/madrugada.";
        }

        System.out.println(analisis);
        System.out.println("Mensaje: **" + saludo + "**");
    }

    public static void opcionEcuacionSegundoGrado(Scanner teclado) {

        System.out.print("Introduzca el coeficiente A: ");
        double a = leerEntero(teclado);
        System.out.print("Introduzca el coeficiente B: ");
        double b = leerEntero(teclado);
        System.out.print("Introduzca el coeficiente C: ");
        double c = leerEntero(teclado);

        if (a == 0) {
            System.out.println("ERROR: El coeficiente A no puede ser cero. Esto no es una ecuación de segundo grado, es de primer grado.");
            return;
        }

        double discriminante = b * b - 4 * a * c;
        System.out.println("Discriminante (b² - 4ac) = " + discriminante);

        if (discriminante < 0) {
            System.out.println("Soluciones: **No existen soluciones reales** (discriminante negativo).");
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Solución: **Existe una única solución real (doble)**: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Soluciones: **Existen dos soluciones reales y distintas**:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
