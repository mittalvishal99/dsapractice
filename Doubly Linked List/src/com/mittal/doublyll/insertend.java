package com.mittal.doublyll;

import java.util.Scanner;

public class insertend 
{
	public static Node insertendd(Node head)
	{

		Scanner sc= new Scanner(System.in);    //Sy
		int val= sc.nextInt();  
		Node temp=new Node(val);
		if(head==null)
		{
			return temp;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		temp.prev=curr;
		return head;
	}
}
