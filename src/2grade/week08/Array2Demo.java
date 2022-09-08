package week08;

import java.util.Scanner;

public class Array2Demo {

	public static void main(String[] args) {
		int arry1[] = {100, 200, 300};
		int arry2[] = new int [arry1.length];

		
		for(int i=0; i < arry1.length; i++)
			arry2[i] = arry1[arry1.length-1-i];
		
		System.out.println("===========================");
		
		for(int i = 0; i < arry1.length; i++) {
			System.out.println("arry1[" + i + "] : " + arry1[i]);
			System.out.println(", arry2[" + i + "] : " + arry2[i]);
			System.out.println();
		}
			
	}

}
