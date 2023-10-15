package com.isa;

import java.math.BigInteger;

public class App
{
    public static void main( String[] args ) {

        System.out.println("Factorial n!");
        int n1 = FactorialCalculator1.getValidInput();
        BigInteger factorial1 = FactorialCalculator1.calculateFactorial(n1);
        System.out.println("Factorial of " + n1 + " is: " + factorial1 + "\n___________________________");

        System.out.println("Factorial n*(n-1)!");
        int n2 = FactorialCalculator2.getValidInput();
        double factorial2 = FactorialCalculator2.calculateFactorial2(n2);
        System.out.println("Factorial of " + n2 + " is: " + factorial2);

    }
}
