package com.bd.benu.basic;

public class PrimeNumberCheck {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, not a prime number
            }
        }

        return true; // If not divisible by any number, it's a prime number
    }

    public static void main(String[] args) {
        int num = 8; // Change this to the number you want to check

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

