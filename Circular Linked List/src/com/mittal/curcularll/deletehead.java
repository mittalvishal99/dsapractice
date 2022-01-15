package com.mittal.curcularll;

public class deletehead {
	
	public static Node deleteheadd(Node head)
	{
		if(head==null || head.next==null)
		{
			return null;
		}
		head.data=head.next.data;
		head.next=head.next.next;
		return head;
	}

}
