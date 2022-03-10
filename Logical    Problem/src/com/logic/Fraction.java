package com.logic;

import java.util.Scanner;

public class Fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		
		int sum=1;
		
		for(int i =1; i<=a; i++) {
			
			sum = sum *i;
			
		}
		System.out.println("Factorial of "+ a + " is : "+ sum);
		
		
	}
}
