package com.bd.benu.basic;

public class CheckPrimeNumber {
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}

		if (num <= 3) {
			
			return true;  // 2 and 3 are prime numbers
		}

		if(num % 2==0 || num % 3==0) {
			
			return false; // Numbers divisible by 2 or 3 are not prime
		}
		/*for (int i = 1; i <= Math.sqrt(i); i++) {

			if (num % i == 0) {

				return false;
			}
		}*/
		return true;
	}
	public static void main(String[] args) {
		if(isPrime(7)) {
			System.out.println("prime");
		}else {
			System.out.println(" not prime");
		}
	}


}
