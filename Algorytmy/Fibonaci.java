package Algorytmy;

public class Fibonaci {

    public static int Oblicz(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int poprzednia2=0;
        int poprzednia1=1;
        int obecna=1;
        int licznik=2;

        while (licznik!=n)
        {
            poprzednia2=poprzednia1;
            poprzednia1=obecna;
            obecna=poprzednia2+poprzednia1;
            licznik++;
        }
        return  obecna;
    }

    public static int ObliczRec(int n)
    {
        int wynik=0;
        int poprzednia2=0;
        int poprzednia1=1;
        int obecna=1;
        if(n>1) {
            poprzednia2=ObliczRec(n-2);
            poprzednia1=ObliczRec(n-1);
            obecna=poprzednia2+poprzednia1;
            wynik=obecna;
        }
        else {
            if(n==1)
                wynik=1;
            else
                wynik=0;
        }
        return wynik;
    }
}
