package com.mittal.questions;

public class insertbegin {
	
	public static Node insertbeginn(Node head,int val)
	
	{
		Node temp=new Node(val);
		
		if(head==null)
		{
			return temp;
		}
		temp.next=head;
		return temp;
		
	}

}
