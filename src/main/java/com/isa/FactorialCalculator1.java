package com.isa;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator1 {
    public static BigInteger calculateFactorial(int n1) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n1; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
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
