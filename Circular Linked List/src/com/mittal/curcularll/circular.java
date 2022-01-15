package com.mittal.curcularll;

public class circular {

	public static void main(String[] args) 
	{
		Node head=new Node(10);
		Node temp1=new Node(90);
		Node temp2=new Node(30);
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=head;
		//head=insertbegin.beginn(head);
		//head=insertlast.insertlastt(head);
		//head=deletehead.deleteheadd(head);
		head=deletekth.deletekthh(head);
		display.displayy(head);
	}
	

}
