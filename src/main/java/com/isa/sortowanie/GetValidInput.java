package com.isa.sortowanie;

import java.util.Scanner;

public class GetValidInput {

    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Podaj liczbę elementow array: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Liczba musi być nieujemna. Spróbuj ponownie.");
                }
            } else {
                System.out.println("To nie jest prawidłowa liczba. Spróbuj ponownie.");
                scanner.next(); // uniknanie pętli nieskończonej
            }
        }
        return input;
    }
}
