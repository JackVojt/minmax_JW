package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int wynik = a[0];
        for (int i = 1; i <= a.length; i++) {
            if (a[i] < wynik) {
                wynik = a[i];
            }
        }

        System.out.println(wynik);
    }
}


