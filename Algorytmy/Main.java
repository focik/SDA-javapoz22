package Algorytmy;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     /*   System.out.print("Podaj podstawę potęgi: ");
        int a = scanner.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
        System.out.print("Podaj wykładnik potęgi: ");
        int b = scanner.nextInt();
//        System.out.println("NWD liczb "+ a+ " i "+b+ " wynosi: "+Nwd.Oblicz(a,b));
       // System.out.println("Wynik wynosi: "+Fibonaci.Oblicz(a));
       // System.out.println("Wynik wynosi: "+Silnia.ObliczRekurancyjnie(a));
        System.out.println("Wynik wynosi: "+Silnia.pow(a,b));
       */
        //fibonaci
        System.out.print("Podaj liczbęi: ");
        int a = scanner.nextInt();
        System.out.println("Wynik wynosi: "+Fibonaci.Oblicz(a));
        System.out.println("Wynik wynosi: "+Fibonaci.ObliczRec(a));
    }
}
