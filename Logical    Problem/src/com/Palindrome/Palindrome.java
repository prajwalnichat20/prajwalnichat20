package com.Palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		
		while (num >0) {
			int r=num%10;
			sum= (sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("number is  not palindrom");
		}
	}
}
