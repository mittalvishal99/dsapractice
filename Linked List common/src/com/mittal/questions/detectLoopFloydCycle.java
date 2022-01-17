package com.mittal.questions;
//O(length of the linked list
//O(m+n)....m be nodes not in loop
// n be length to traverse loop twice

public class detectLoopFloydCycle {
	public static boolean detect(Node head)
	{
		Node first=head;
		Node second=head;
		Node current=head;
		while(first.next!=null && first!=null)
		{
			
			first=first.next.next;
			second=second.next;
			if(first==second)
			{
				return true;
			}
		}return false;
	}

}
