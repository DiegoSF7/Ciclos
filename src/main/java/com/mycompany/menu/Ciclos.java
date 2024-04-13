/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

/**
 *
 * @author mplab4.pc24
 */
import java.util.Scanner;

public class Ciclos {

    Scanner leer = new Scanner(System.in);

    public void ciclo1() {
        System.out.println("Ingrese una cantidad para ser medida");
        int num = leer.nextInt();
        int km = num / 100000;
        int m = (num % 100000) / 100;
        int cm = (num % 100000) % 100;
        System.out.println("Kilometros: " + km);
        System.out.println("Metros: " + m);
        System.out.println("Centimetros: " + cm);
    }

    public void ciclo2() {
        int counter = 1;

        while (counter <= 10) {
            System.out.print(counter + " / ");
            counter++;
        }
        System.out.println("");
    }

    public void ciclo3() {
        int counter = 1;
        int suma = 0;

        while (counter <= 10) {
            suma += counter;
            counter++;
        }
        System.out.println("La suma de los numeros del 1 al 10 es: " + suma);
    }

    public void ciclo4() {
        int counter = 0;

        while (counter == 0) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            leer.nextLine();
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par.");
            } else {
                System.out.println("El numero " + num + " es impar.");
            }
            System.out.println("Desea seguir ingresando?");
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                System.out.println("Hasta luego!");
                counter++;
            }
        }
    }

    public void ciclo5() {
        int limit = 10;
        int counter = 0;
        for (int v = 1; v <= limit; v++) {
            System.out.print("Ingresa un numero: ");
            int num = leer.nextInt();
            counter += num;
        }
        System.out.println("El promedio es de: " + counter / 10);
    }

    public void ciclo6() {
        int n = 0;
        int counter = 0;
        while (n == 0) {
            counter++;
            if (counter % 2 == 0) {
                System.out.print(counter + " / ");
            } else if (counter > 20) {
                n++;
            }
        }
        System.out.println("");
    }

    public void ciclo7() {
        int counter = 0;
        int suma = 0;
        while (counter <= 400) {
            if (counter % 3 == 0) {
                suma += counter;
            }
            counter++;
        }
        System.out.println("La suma de los numeros impares hasta el 400: " + suma);
    }

    public void ciclo8() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingrese el radio del circulo");
            int num = leer.nextInt();
            leer.nextLine();
            while (num < 0) {
                System.out.println("Ingrese un numero positivo!");
                num = leer.nextInt();
            }
            double area = 3.14 * (num * num);
            System.out.println("El area del circulo es de: " + area);
            System.out.println("Desea ingresar otro numero? [N] - Salir");
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                System.out.println("Hasta luego!");
                n++;
            }
        }
    }

    public void ciclo9() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingrese el radio del circulo");
            int num = leer.nextInt();
            leer.nextLine();
            while (num < 0) {
                System.out.println("Ingrese un numero positivo!");
                num = leer.nextInt();
            }
            double peri = 2 * 3.14 * num;
            System.out.println("El perimetro del circulo es de: " + peri);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                System.out.println("Hasta luego!");
                n++;
            }
        }
    }

    public void ciclo10() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingrese el valor de la base");
            int base = leer.nextInt();
            System.out.println("Ingrese el valor de la altura");
            int altura = leer.nextInt();
            while (base < 0 || altura < 0) {
                System.out.println("Error! Ingrese solo numeros positivos!");
                System.out.println("Ingrese el valor de la base");
                base = leer.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura = leer.nextInt();
            }
            int area = base * altura;
            System.out.println("El area del rectangulo es: " + area);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            leer.nextLine();
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                n++;
            }
        }
    }

    public void ciclo11() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingrese el radio del circulo");
            int r = leer.nextInt();
            while (r <= 0) {
                System.out.println("Error! Ingrese un numero positivo!");
                r = leer.nextInt();
            }
            double volumen = (4 / 3) * 3.14 * (r * r * r);
            System.out.println("El volumen de la esfera es de: " + volumen);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            leer.nextLine();
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                n++;
            }
        }
    }

    public void ciclo12() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingrese el lado del cubo");
            int l = leer.nextInt();
            while (l < 0) {
                System.out.println("Error! Ingrese un numero positivo");
                l = leer.nextInt();
            }
            int area = 6 * (l * l);
            int peri = 12 * l;
            System.out.println("El area del cubo es de: " + area);
            System.out.println("El perimetro del cubo es de: " + peri);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            leer.nextLine();
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                n++;
            }
        }
    }

    public void ciclo13() {
        for (int i = 1; i <= 100; i++) {
            if (!(i % 3 == 0)) {
                System.out.println(i);
            }
        }
    }

    public void ciclo14() {
        for (int i = 1; i <= 100; i++) {
            if (!(i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }

    public void ciclo15() {
        for (int i = 1; i <= 100; i++) {
            if (!((i % 5 == 0) || (i % 3 == 0))) {
                System.out.println(i);
            }
        }
    }

    public void ciclo16() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Cuek");
                i++;
            }
            System.out.println(i);
        }
    }

    public void ciclo17() {
        int counter = 0;
        while (counter == 0) {
            System.out.println("Ingresa un numero");
            int num = leer.nextInt();
            while (num <= 0) {
                System.out.println("Error! Ingresa un numero valido!");
                num = leer.nextInt();
            }
            int f = 1;
            for (int i = num; i != 0; i--) {
                f *= i;
            }
            System.out.println("El factorial de " + num + " es: " + f);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            leer.nextLine();
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                counter++;
            }
        }
    }

    public void ciclo18() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingresa un numero");
            int num = leer.nextInt();
            while (num <= 0) {
                System.out.println("Error! Ingresa un numero valido!");
                num = leer.nextInt();
            }
            int counter = 0;
            while (num != 0) {
                num = num / 10;
                counter++;
            }
            System.out.println("La cantidad de digitos es de: " + counter);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            leer.nextLine();
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                n++;
            }
        }
    }

    public void ciclo19() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingrese el lado del cuadrado");
            int l = leer.nextInt();
            while (l < 0) {
                System.out.println("Error! Ingrese un numero positivo");
                l = leer.nextInt();
            }
            int peri = 4 * l;
            System.out.println("El perimetro del cuadrado es de: " + peri);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            leer.nextLine();
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                n++;
            }
        }
    }

    public void ciclo20() {
        int n = 0;
        while (n == 0) {
            System.out.println("Ingrese el valor del numero");
            int num = leer.nextInt();
            System.out.println("Ingrese el valor al cual estara elevado");
            int p = leer.nextInt();
            while (num < 0 || p < 0) {
                System.out.println("Error! Ingrese solo numeros positivos!");
                System.out.println("Ingrese el valor del numero");
                num = leer.nextInt();
                System.out.println("Ingrese el valor al cual estara elevado");
                p = leer.nextInt();
            }
            int res = 1;
            for (int i = p; i != 0; i--) {
                res *= num;
            }
            System.out.println(num + " Elevado a " + p + " es: " + res);
            System.out.println("Desea hacer otra operacion? [N] - Salir");
            leer.nextLine();
            String op = leer.nextLine();
            if (op.equalsIgnoreCase("n")) {
                n++;
            }
        }
    }
}