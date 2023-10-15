package com.isa;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator2 {
    public static double calculateFactorial2(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Liczba musi być nieujemna.");
        }

        if (n2 == 0) {
            return 0;
        }

        if (n2 == 1) {
            return 0;
        }

        double factorial2 = 1;
        for (int i = 1; i <= n2; i++) {
            factorial2 *= i*(i-1);
        }

        return factorial2;
    }

    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Podaj liczbę n: ");
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
