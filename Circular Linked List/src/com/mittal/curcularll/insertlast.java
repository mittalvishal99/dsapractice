package com.mittal.curcularll;

import java.util.Scanner;

public class insertlast {
	
	public static Node insertlastt(Node head)
	{
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		Node temp=new Node(val);
		
		if(head==null)
		{
			temp.next=temp;
			return temp;
		}
		

		Node curr=head;
		temp.next=head.next;
		head.next=temp;
		int val1=head.data;
		head.data=temp.data;
		temp.data=val1;
		
		return head.next;
		

	}

}
