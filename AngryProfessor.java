//package com.techleads.app;

public class AngryProfessor {

	public static void main(String[] args) {
		int k=3;
		//int k=2;
		int[] a= {-1, -3, 4, 2};
		//int[] a= {0, -1,0,0, 2, 1};
		String angryProfessor = angryProfessor(k, a);
		System.out.println(angryProfessor);
		System.out.println("modified this change in DEV branch");
	}
	
	static String angryProfessor(int k, int[] a) {
		String result = "YES";
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				count++;
				if (k == (count)) {
					result = "NO";
					System.out.println(count+" "+result);
					break;
				}
			}
		}
		System.out.println(result);
		return result;
	}

}
