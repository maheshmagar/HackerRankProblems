package com.basic.programming.problems;

public class GetSumOfNNumbers {

	public static int sum=0;
	
	public static int getSum(int n) {
		
		 if(n > 0)
		    {
		        sum = getSum(n-1) + n;
		        //getSum(n-1);
		    }
		    return sum ;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(getSum(5));
		
	}
	
}
