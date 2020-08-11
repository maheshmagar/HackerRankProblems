package com.mahi;

import java.util.Scanner;

public class Mars_Exploration {

    static int marsExploration(String s) {
    		
    		int len = s.length();
    		
    		int var = len / 3;
    		int count = 0;
    		for (int i = 0; i < len; i=i+3) {
    			
    			if(s.charAt(i) != 'S') {
    				count ++;
    			}
    			if(s.charAt(i+1) != 'O')
    				count++;
    			if(s.charAt(i+2) != 'S')
    				count++;
		}
    		
    		return count;
    }
	
    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		String s = scanner.nextLine();
		
        int result = marsExploration(s);
		System.out.println(result);
		
	}
	
}
