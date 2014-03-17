package org.java.test.algo;

public class Fibonacci {
	public static void main(String[] a) {
		Fibonacci fibo = new Fibonacci();
		for(int i = 0; i < 10; i++) {
			System.out.println(fibo.fibo(i));
		}
	}

	public int fibo(int num) {
		if(num <= 1) {
			return 1;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}
}
