package com.Prime;



public class Prime {
	public static void main(String[] args) {
		
		int a= 6;
		int f=0;
		for(int i=2; i<a; i++) {
			
			if(a%i==0) {
				f=1;
			}
		}
		if(f==0) {
		System.out.println("Prime");
		}
		else {
			System.out.println("No prime");
		}
		}

}
