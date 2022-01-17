package com.mittal.doublyll;

import java.util.*;
public class insertbegin {
	
	public static Node insertbeginn(Node head)
	{
		Scanner sc= new Scanner(System.in);    //Sy
		int val= sc.nextInt();  
		Node temp=new Node(val);
		
		if(head==null)
		{
			return head;
		}
		temp.next=head;
		head.prev=temp;
		head=temp;
		return head;
		
	}

}
