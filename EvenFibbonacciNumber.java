package com.review3;

import java.util.Scanner;

public class EvenFibbonacciNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=15;
		 int a=0,b=1,c;
		 for(int i=0;i<=n;i++)
		 {
			 c=a+b;
			 a=b;
			 b=c;
			 System.out.println(a);
			
			 if(a%2==0)
			 {
				 System.out.println("Even Fibbonacci number is :"+a);
			 }
			
		 }
		
		
	}

}
