package com.mittal.questions;

public class segregate_even_odd 
{
	public static void segregate(Node head)
	{
		Node curr=head;
		int count=1;
		while(curr.next!=null)
		{
			curr=curr.next;
			count++;
		}
		System.out.println(count);
	}

}
