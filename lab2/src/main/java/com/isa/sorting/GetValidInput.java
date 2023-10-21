package com.isa.sorting;

import java.util.Scanner;

public class GetValidInput {

    public static int getValidInputSize() {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Podaj liczbę elementow tablicy: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Liczba musi być nieujemna. Spróbuj ponownie.");
                }
            } else {
                System.out.println("To nie jest prawidłowa liczba. Spróbuj ponownie.");
                scanner.next();
            }
        }
        return input;
    }

    public static int getValidInputNumberElement() {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Podaj maksymanlna wartosc elementow: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Liczba musi być nieujemna. Spróbuj ponownie.");
                }
            } else {
                System.out.println("To nie jest prawidłowa liczba. Spróbuj ponownie.");
                scanner.next();
            }
        }
        return input;
    }
}
