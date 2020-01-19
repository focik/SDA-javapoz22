package Algorytmy;

public class InsertionSort {
    public static void sort(long[] a) {
        int n=a.length;
        int nsort=1;
        int min=0;
        int i=0;
        long temp;

        while (!(nsort == n)) {
            i = nsort;

            while (i > 0 && (a[i-1]>a[i])) {

                    temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    i--;
                }
            nsort+=1;
        }
        }
        // twoj kod moze byc tutaj!
        // zadzwon pod nasz numer
    }

