package com.mittal.questions;

public class insert_in_sorted {
	
	public static Node insertinsorted(Node head,int val)
	{
		Node temp=new Node(val);
		
		if(head==null)
		{
			return temp;
		}
		Node curr=head;
		if(curr.data>val)
		{
			return insertbegin.insertbeginn(curr, val);
		}
		while(curr.next!=null && curr.next.data<val)
		{
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
		return head;
	}

}
