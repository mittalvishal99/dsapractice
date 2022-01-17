package com.mittal.interview;

//swapping with third variable

public class Two {

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("before a " +  a);
		int b=20;
		System.out.println("before b " +  b);
		
		int temp=a;
		a=b;
		b=temp;

		System.out.println("after a " +  a);
		System.out.println("after b " +  b);
	}

}
