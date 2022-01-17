package stackgfg;
/*LINKED LIST IMPLEMENTATION
 * NEED TO USE LINKEDLIST TO IMPLEMENT ALL THE OPERATIONS OF STACK
 * 
 * TIME COMPLEXITY--O(1)
 * INSERTIONS AND DELETIONS SHOULD HAPPEN AT ONE END ONLY AS IT IS A STACK
 *  
 *  []--->[]--->[]--->[]--->null
 *  ^				   ^
 *  head			  tail
 *  
 ***If WE TAKE TAIL AS OUR END 
 * CASE A)- WE HAVE POINTER AT HEAD ONLY
 * 			THEN IT WILL BE LINEAR TIME O(N) TO DO REMOVE AND ADD FROM TAIL
 * 
 * CASE B)- WE HAVE POINTER AT TAIL AND HEAD BOTH
 * 			THEN INSERTION WILL BE EASY
 * 			BUT DELETION WILL BE O(N) AS TO REMOVE LAST NODE WE NEED CONTROL AT LAST SECOND NODE
 *				because NEXT OF IT HAS TO BE CHANGED
 *
 ***IF WE TAKE HEAD AS OUR END
 *       AT HEAD BOTH INSERTIONS AND DELETION IS O(1)
 *       SO USE THIS
 *       
 * TO CALCULATE FULL SIZE(LENGTH) -IT WOULD BE LINEAR
 * NO, WE CAN CREATE SIZE VARIABLE WITH PUSH AND POP
 * IF PUSH SIZE++ IF POP SIZE--       	 
 */

class Node{
	int data;
	Node next;
	Node(int x)
	{
		data =x;
	}
}
//	we have to create our own mystackk class by which we can create instance and use its methods
class mystackk
{
	Node head;
	int size;
	public mystackk() {
		head=null;
		size=0;
	}
	public void push(int val)
	{
		Node temp=new Node(val);
		if(head==null)
		{
			head=temp;
		}else {
			temp.next=head;
			head=temp;
		}size++;
	}
	public int pop()
	{
		if(head==null)
		{
			return -1;
		}
		int value=head.data;
		head=head.next;
		size--;
		return value;
	}
	
	public int size()
	{
		return size;
	}
	public int peek()
	{
		if(head==null)
		{
			return -1;
		}
		int value=head.data;
		return value;
	}
	public void isempty()
	{
		if(head==null)
		{
			System.out.println("empty");
		}
		else {
			System.out.println("not empty");
		}
	}
	
}

public class LinkedListToStack {
		public static void main(String args[])
		{

			mystackk s=new mystackk();
		    s.push(5);
		    s.push(10);
		    s.push(20);
		    System.out.println(s.pop());
		    System.out.println(s.size());
		    System.out.println(s.peek());
		   s.isempty();

		}
}
