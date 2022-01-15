package com.mittal.curcularll;

public class display {
	
	public static void displayy(Node head)
	{
		if(head==null)
		{
			return;
		}
		System.out.println(head.data);
		Node curr=head.next;
		while(curr!=head)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
}
