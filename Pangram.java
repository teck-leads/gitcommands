package com.techleasds.app;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		//String str = "We promptly judged antique ivory buckles for the next prize";
		String str="We promptly judged antique ivory buckles for the prize";
		str = str.toLowerCase();
		int count = 0;
		for (int i = 97; i <= 122; i++) {

			char ch = (char) i;
			if (strContains(ch, str)) {
				count++;
			}

		}
		if (count == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}

	private static boolean strContains(char ch, String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		int binarySearch = Arrays.binarySearch(charArray, ch);
		if (binarySearch >= 0) {
			return true;
		} else {

			return false;
		}
	}

}
