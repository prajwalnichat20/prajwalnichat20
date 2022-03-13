package com.Reverse;

import java.util.List;

public class Reverse {
	
	public static void main(String[] args) {
		String s= " PRavin Vishal  PRavin PRAJWAL   PRavin PRAJWAL PRavin hhhhh";
		char[] a =s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	
	
		String[] split = s.split("PRavin");
		System.out.println(split.length-1);
		for(int j=0;j<split.length;j++) {
			System.out.println(split[j]);
		}
		
		
	  
	}

}
