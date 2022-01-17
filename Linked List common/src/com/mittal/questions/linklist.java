package com.mittal.questions;

public class linklist {

	public static void main(String[] args)
	{
		Node head=null;
		head=insertend.insertendd(head,15);
		head=insertend.insertendd(head,12);

		head=insertend.insertendd(head,20);
		

		head=insertend.insertendd(head,12);

		head=insertend.insertendd(head,20);

		/*
		Node temp1=new Node(30);
		temp.next=temp1;
		
		Node temp2=new Node(40);
		temp1.next=temp2;
		temp2.next=temp;*/
		//head=reverseIterativeNaive.reversenaive(head);
		//findmiddle.middle(head);
		//head=insert_in_sorted.insertinsorted(head, 30);
		

		//head=reverseIterativeNaive.reversenaive(head);
	//	head=reverseIterativeEfficient.reverseefficient(head);
		//head=removeDuplicateFromSorted.remove(head);
		//display.displayy(head);
		//System.out.println(detectloop1.detect(head));
		//System.out.println(detectloop2.detect(head));
	//	System.out.println(detectLoopFloydCycle.detect(head));
		display.displayy(head); 
			segregate_even_odd.segregate(head);
	}

}
