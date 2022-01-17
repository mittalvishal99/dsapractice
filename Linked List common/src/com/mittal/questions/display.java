package com.mittal.questions;

public class display {
	 
	public static void displayy(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	System.out.println(" ");
	}

}
