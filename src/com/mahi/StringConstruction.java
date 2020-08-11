package com.mahi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringConstruction {

	static int stringConstruction(String s) {
		//List<Character> list = new ArrayList<Character>();
		Set<Character> uniqueChars = new TreeSet<Character>();
		
		for (char c : s.toCharArray()) {
		//	list.add(c);
			uniqueChars.add(c);
		}
		
		return uniqueChars.size();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			String s = in.next();
			int result = stringConstruction(s);
			System.out.println(result);
		}
		//Comment Added By VB Mahesh User
	}
	
}
