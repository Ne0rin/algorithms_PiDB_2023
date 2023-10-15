package com.isa.sortowanie;

import java.util.Random;

public class App {
    public static void main( String[] args ) {
        int size = GetValidInput.getValidInput();
        int[] randomArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            randomArray[i] = random.nextInt(1000);
        }

        System.out.println("____________________");
        System.out.println("Losowa array: ");
        for (int number : randomArray) {
            System.out.print(number + " ");
        }

        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < size; i++) {
                if (randomArray[i-1]>randomArray[i]) {
                    int temp = randomArray[i - 1];
                    randomArray[i - 1] = randomArray[i];
                    randomArray[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("");
        System.out.println("____________________");
        System.out.println("Posortowana tablica: ");
        for (int arraySort:randomArray) {
            System.out.print(arraySort + " ");
        }
    }
}
