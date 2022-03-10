package com.fibonic;

public class FibonicSeries {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c,i;
		
		System.out.print(a+" "+b);
		for(i=1;i<=10;i++){
			
			c=a+b;
			
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
