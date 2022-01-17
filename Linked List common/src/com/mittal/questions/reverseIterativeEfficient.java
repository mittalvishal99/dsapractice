package com.mittal.questions;
//changing links
//one traversal
public class reverseIterativeEfficient 
{
	public static Node reverseefficient(Node head)
	{
		if(head==null)
		{
			return head;
		}
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		//head=curr;
		return prev;
	}

}
