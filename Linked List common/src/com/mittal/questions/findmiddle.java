package com.mittal.questions;
//naive approach........
public class findmiddle 
{
	public static void middle(Node head)
	{
		if(head==null)
		{
			return;
		}
		int count=0;
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			count++;
		}
		Node curr=head;
		for(int i=0;i<(count/2);i++)
		{
			curr=curr.next;
		}
		System.out.println(curr.data);
	}

}
