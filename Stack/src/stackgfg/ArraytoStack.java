package stackgfg;
/*
 * ARRAY IMPLEMENTATION OF STACK IN JAVA
 * We need to design out own stack and call it mystack class by which we can create instance
 * and use its methods
 * 
 * TIME COMPLEXITY OF ALL THE OPERATIONS O(1)
 * 
 * 
 */

class mystack{
	int top;
	int cap;
	int arr[];
	/*constructor iss liye bnaya ki jab koi iss class ka object bnayega
	to ek mystack naam ka instance create hoga jiski capacity defined hogi
	jaise node ka ek defined structure hai vaise hi stack ka ho gya
	*/
	public mystack(int c) 
	{
		top=-1;
		cap=c;
		arr=new int[cap];
	}
	public void push(int val)
	{
		
		top++;
		if(top==cap)
		{
			System.out.println("stack is full OVERFLOW");
			return;
		}
		arr[top]=val;
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty UNDERFLOW");
			return -1;
		}
		int value=arr[top];
		top--;
		return value;
	}
	public int size()
	{
		int sizee=top+1;
		return sizee;
	}
	public int peek()
	{
		return arr[top];
	}
	public void isEmpty()
	{
		if(top==-1)
		{
			System.out.println("yes empty");
		}else {
			System.out.println("no");
		}
	}
}

public class ArraytoStack 
{
	public static void main(String args[]) 
	{
		mystack s=new mystack(10);

	    s.push(5);
	    s.push(10);
	    s.push(20);
	    System.out.println(s.pop());
	    System.out.println(s.size());
	    System.out.println(s.peek());
	    s.isEmpty();
		
	}

}
