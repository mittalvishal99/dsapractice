package com.mittal.interview;
//swap a number without third variable

public class One 
{
	public static void main(String args[])
	{
		int a=10;
		System.out.println("before a " +  a);
		int b=20;

		System.out.println("before b " +  b);
		
		a=a+b;
		
		b=a-b;
		
		a=a-b;
		
		System.out.println("after a " +  a);
		System.out.println("after b " +  b);
	}
}
