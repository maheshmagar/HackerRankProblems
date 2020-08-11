package com.mahi;

import java.util.Scanner;

public class CaesarCipher {
	
	public static int getAscii(char ch) {
		return (int)ch;
	}
	
	public static char getChar(int i) {
		return (char)i;
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char[] encrypted = new char[n];
        for (int i = 0; i < n; i++) {
        		int val = getAscii(s.charAt(i));
			int val1 = ((val >=65 && val <=90) || (val>=97 && val<=122))?val:0;
			k=k%26;
			
			switch (val1) {
			case 0:
				val1 = val;
				break;	
			default:
				val1 = val1 + k;
				if(val1>90 && val <= 90 && val >= 65) {
					val1 = val1 - k;
					val1 = 65 + (k-(90-val1+1));
				}
                else if(val1>122 && val<=122 && val>=97){
                     val1 = val1 - k;
					 val1 = 97 + (k-(122-val1+1));   
                }
				break;
			}
			char ch1 = getChar(val1);
			encrypted[i] = ch1;
			
		}
		
        System.out.println(encrypted);
        in.close();
	}

}
