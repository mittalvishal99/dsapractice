package com.mittal.interview;

public class LargestInArray {

	public static void main(String[] args) 
	{
		int arr[]= {13,67,11,9,2,54};
		
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}System.out.println(max);
	}

}
