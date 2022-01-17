package com.mittal.doublyll;

public class deleteHead {
	public static Node deleteheadd(Node head)
	{
		
		if(head==null || head.next==null)
		{
			return null;
		}
		head=head.next;
		head.prev=null;
		return head;
		
	}

}
