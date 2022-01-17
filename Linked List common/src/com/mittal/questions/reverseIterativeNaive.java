package com.mittal.questions;
//naive
//two traversal
//require auxillary space O(n) 
import java.util.ArrayList;

//we are changing data in this approach

public class reverseIterativeNaive 
{
	public static Node reversenaive(Node head)
	{
		ArrayList<Integer>arr=new ArrayList<Integer>();
		
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			arr.add(curr.data);
		}
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			curr.data=arr.remove(arr.size()-1);
		}return head;	
	}
}
