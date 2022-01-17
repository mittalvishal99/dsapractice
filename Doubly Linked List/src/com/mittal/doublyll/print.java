package com.mittal.doublyll;

public class print {

	public static void printll(Node head)
	{
		Node curr=head;
		if(head==null)
		{
			return;
		}
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
		
}
	}
