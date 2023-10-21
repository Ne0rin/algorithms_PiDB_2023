package com.isa.sorting;

import java.util.Random;

public class SortingApp {
    public static void runApp() {
        int size = GetValidInput.getValidInputSize();
        int numberElements = GetValidInput.getValidInputNumberElement();
        int[] randomArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(numberElements);
        }

        long startTime = System.currentTimeMillis();

        System.out.println("____________________");
        System.out.println("Losowa array: ");
        for (int number : randomArray) {
            System.out.print(number + " ");
        }

        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < size; i++) {
                if (randomArray[i - 1] > randomArray[i]) {
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
        for (int arraySort : randomArray) {
            System.out.print(arraySort + " ");
        }
        System.out.println(" ");
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Program zostal wykonany " + executionTime + " ms");
    }
}
