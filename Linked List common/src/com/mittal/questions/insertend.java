package com.mittal.questions;

public class insertend 
{
	public static Node insertendd(Node head,int val)
	{
		Node temp=new Node(val);
		if(head==null)
		{
			head=temp;
			return head;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		return head;
	}

}
