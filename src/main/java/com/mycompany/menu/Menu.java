/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.menu;
/**
 *
 * @author mplab4.pc24
 */
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ciclos c = new Ciclos();
        int counter = 1;
        while (counter == 1) {
            System.out.println("-------------- Opciones --------------");
            System.out.println("1 - Ciclo 1             11 - Ciclo 11");
            System.out.println("2 - Ciclo 2             12 - Ciclo 12");
            System.out.println("3 - Ciclo 3             13 - Ciclo 13");
            System.out.println("4 - Ciclo 4             14 - Ciclo 14");
            System.out.println("5 - Ciclo 5             15 - Ciclo 15");
            System.out.println("6 - Ciclo 6             16 - Ciclo 16");
            System.out.println("7 - Ciclo 7             17 - Ciclo 17");
            System.out.println("8 - Ciclo 8             18 - Ciclo 18");
            System.out.println("9 - Ciclo 9             19 - Ciclo 19");
            System.out.println("10 - Ciclo 10           20 - Ciclo 20");
            System.out.println("---------------------------------------");
            System.out.print("Elija una opcion: ");
            int op = leer.nextInt();
            while (op < 1 || op > 20) {
                System.out.println("Error! Elija un numero dentro de las opciones.");
                op = leer.nextInt();
            }
            switch (op) {
                case 1 -> c.ciclo1();
                case 2 -> c.ciclo2();
                case 3 -> c.ciclo3();
                case 4 -> c.ciclo4();
                case 5 -> c.ciclo5();
                case 6 -> c.ciclo6();
                case 7 -> c.ciclo7();
                case 8 -> c.ciclo8();
                case 9 -> c.ciclo9();
                case 10 -> c.ciclo10();
                case 11 -> c.ciclo11();
                case 12 -> c.ciclo12();
                case 13 -> c.ciclo13();
                case 14 -> c.ciclo14();
                case 15 -> c.ciclo15();
                case 16 -> c.ciclo16();
                case 17 -> c.ciclo17();
                case 18 -> c.ciclo18();
                case 19 -> c.ciclo19();
                case 20 -> c.ciclo20();
                case 21 -> counter++;
            }
        }
    }
}
