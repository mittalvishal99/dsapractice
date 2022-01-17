package com.mittal.doublyll;

public class reverse {
	
	public static Node reversee(Node head)
	{
		if(head.next==null || head==null)
		{
			return head;
		}
		Node curr=head;
		Node pre=curr.prev;
		while(curr!=null)
		{
			pre=curr.prev;
			curr.prev=curr.next;
			curr.next=pre;
			curr=curr.prev;
		}
		return pre.prev;
	}

}
