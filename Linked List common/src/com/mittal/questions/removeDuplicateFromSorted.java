package com.mittal.questions;

public class removeDuplicateFromSorted 
{
	public static Node remove(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node curr=head;
	
		while(curr.next!=null)
		{									//...5-->5-->5-->7-->null
			if(curr.data==curr.next.data)
			{								//5==5
											//.....5-->5-->7-->null
				curr.next=curr.next.next;
											//keep current to 5 only
			}
			else {							
											//...5-->6-->7-->null
											//...5!=6
											//   curr is now 6
				curr=curr.next;
			}
		}return head;
	}

}
