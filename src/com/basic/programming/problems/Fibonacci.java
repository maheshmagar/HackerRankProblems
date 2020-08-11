package com.basic.programming.problems;

public class Fibonacci {
	public static int first=0;
	public static int second=1;
	
	public static void fibonacciSeries(int n) {
		
		int arr[] = new int[n];
		
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void fiborecur(int n) {
		
		int sum;
		if(n > 2) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum + " ");
			fiborecur(n-1);
		}
		else 
			System.out.println("");
	}
	
	public static void main(String args[]) {
		
		fibonacciSeries(10);
		System.out.print("\n0 1 ");
		fiborecur(10);
	}
	
}
