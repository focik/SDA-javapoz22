package Algorytmy;

public class Silnia {
    public static int ObliczRekurancyjnie(int n)
    {
        int wynik=0;
        if(n>1) {
            wynik = ObliczRekurancyjnie(n - 1);
            wynik = wynik * n;
        }
        else {
            wynik=1;
        }
        return wynik;
    }

    public static long pow(int a, int n)
    {
        long wynik=0;
        if (n==0)
            return 1;

        if(n%2==0)
        {
            wynik=pow(a,n/2);
            wynik=wynik*wynik;
        }
        else {
            wynik=pow(a,n-1);
            wynik=wynik*a;
        }
        return wynik;
    }
}
