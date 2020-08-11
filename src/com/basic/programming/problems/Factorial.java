package com.basic.programming.problems;

public class Factorial {

	public void findFactorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result = result * i;
		}
		System.out.println(result);
	}
	
	public int fact(int n) {
		
		if(n==1 || n==0)
			return 1;
		else
			return n*fact(n-1);
		
	}
	
	public static void main(String args[]) {
		
		Factorial fact = new Factorial();
		fact.findFactorial(10);
		
		int result = fact.fact(10);
		System.out.println(result);
	}
	
}
