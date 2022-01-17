package com.mittal.questions;


/*
 * Modify the LL but find in O(n) without extra space 
 * 
 //create an empty node as temp
 //as you are traversing each node point it to the temp
 //check before traversing if it is already point to temp
  * if yes then loop
 */
public class detectloop2 {
	
	public static boolean detect(Node head)
	{
		Node curr=head;

		Node temp=new Node(10);
		while(curr!=null)
		{

			if(curr.next==temp)
			{
				return true;
			}
			Node val;
			val=curr.next;
			curr.next=temp;
			curr=val;
		}return false;
	}

}
