package com.bd.benu.basic;

public class PrimeNumber {

	public void checkPrimeOrNot(int num) {
		System.out.println("checkPrimeOrNot is calling");
		if(num <=1 ) {
			System.out.println("thsi is the negative number");
		}
		
		int count = 0;
		if (num == 2) {
			System.out.println(num + "Is a prime Number");
		} else {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
		}

	}

}
