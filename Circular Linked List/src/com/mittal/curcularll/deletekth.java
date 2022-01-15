package com.mittal.curcularll;

import java.util.Scanner;

public class deletekth 
{
	public static Node deletekthh(Node head)
	{

		if(head==null)
			return head;
		
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
	    if(k==1)return deletehead.deleteheadd(head);
	    
	    Node curr=head;
	    for(int i=0;i<k-2;i++)
	        curr=curr.next;
	    curr.next=curr.next.next;
	    return head;

		
	}
}
