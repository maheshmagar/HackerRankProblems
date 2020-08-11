package com.basic.programming.problems;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumbers {

	public static Set<Integer> findPrimeNumber(Integer n) {
		int i=0,j;
		Set<Integer> arr = new LinkedHashSet<Integer>();
		while(i<=n) {
			
			if(i==0 || i==1) {
				i++;
				continue;
			}else {
				for(j=2; j<=i; j++) {
					if(i%j==0) {
						break;
					}
				}
			}
			if(j==i) {
				arr.add(j);
			}
			i++;
		}
		
		return arr;
	}
	
	
	public static Set<Integer> findFirstNPrimeNumbers(Integer n) {
		int i=2,j,count=1;
		Set<Integer> arr = new LinkedHashSet<Integer>();
		while(count<=n) {
				
				for(j=2; j<=i; j++) {
					if(i%j==0) {
						break;
					}
				}
				if(j==i) {
					arr.add(i);
					count++;
				}
				i++;
				
		}
		
		return arr;
	}
	
	public void primeOrNot(int i) {
		int j;
		if(i==0 || i==1) {
			System.out.println("Not a Prime Number or Composite number");
		}
		else {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					System.out.println("Not a Prime Number");
					break;
				}
			}
			if(j==i) {
				System.out.println("Its a Prime Number");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Set<Integer> primeNumbers = new LinkedHashSet<Integer>(); 
		System.out.println("Enter Number : ");
		Integer number = scanner.nextInt();
		//primeNumbers = findPrimeNumber(number);
		//primeNumbers = findFirstNPrimeNumbers(number);
		PrimeNumbers primeNum = new PrimeNumbers();
		primeNum.primeOrNot(number);
		Iterator itr = primeNumbers.iterator();
		
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
		
	}

}
