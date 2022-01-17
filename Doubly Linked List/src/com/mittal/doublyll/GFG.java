package com.mittal.doublyll;

public class GFG {
	 
	    
	    public static void main(String args[]) 
	    { 
	        Node head=new Node(10);
	    	Node temp1=new Node(20);
	    	Node temp2=new Node(30);
	    	head.next=temp1;
	    	temp1.next=temp2;
	    	temp1.prev=head;
	    	temp2.prev=temp1;
	    	//head=insertbegin.insertbeginn(head);
	    	//isme store karana pada head ko
	    	//kyuki head humne update kiya function mei
	    	//lekin main mei to puare wala hi hai jisko lekar call chalegi
	    	//iss liye pahle usko store kiya taaki modify ho jaye
	    	
	    	//head=insertend.insertendd(head);
	    //	head=reverse.reversee(head);
	    	//head=deleteHead.deleteheadd(head);
	    	deleteLastnode.deletelastnodee(head);
	    	print.printll(head);
	    } 
	    
	

}
