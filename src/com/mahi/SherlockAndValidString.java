package com.mahi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndValidString {
	
	static String isValid(String s)  {
		
		Map<Character,Integer> mymap = new HashMap<Character,Integer>();
		
		for (int i = 97; i < 123 ; i++) {
			char c = (char) i;
			mymap.put(c,0);
		}
		
		System.out.println(mymap.get('a'));
		
		for(int i=0; i < s.length()-1 ; i++) {
			char c = s.charAt(i);
			Integer val = mymap.get(c) + 1;
			mymap.put(c, val);
		}
		
		return "";
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = isValid(s);
		System.out.println(result);
	}

}
