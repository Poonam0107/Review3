package com.review3;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number :");
		int a =sc.nextInt();
		
		System.out.println("Enter second Number :");
		int b = sc.nextInt();
		
	      a=a+b;
	      b=a-b;
	      a=a-b;
		 System.out.println("First Number :"+a);    
		 System.out.println("Second Number :"+b); 
	}

}
