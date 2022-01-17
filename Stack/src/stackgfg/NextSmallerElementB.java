package stackgfg;

import java.util.ArrayDeque;

public class NextSmallerElementB
{
	public static void main(String args[])
	{
		int arr[]= {3, 8, 5, 2, 25};
		int n=arr.length;
		int res[]=nextSmallerElement(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static int[] nextSmallerElement(int arr[], int n) 
	{ 
	    ArrayDeque <Integer> s=new ArrayDeque<>();
	    int arr2[]=new int[n];
	    
	    for(int i=n-1;i>=0;i--)
	    {
	        if(s.isEmpty()==true)
	        {
	            arr2[i]=-1;
	            s.push(arr[i]);
	        }
	        else if(s.peek()<arr[i])
	        {
	            arr2[i]=s.peek();
	            s.push(arr[i]);
	        }
	        else if(s.peek()>=arr[i])
	        {
	            while(s.isEmpty()!=true && s.peek()>=arr[i])
	            {
	                s.pop();
	            }
	            if(s.isEmpty()==true)
	            {
	                arr2[i]=-1;
	                s.push(arr[i]);
	            }
	            else{
	                arr2[i]=s.peek();
	                s.push(arr[i]);
	            }
	        }
	    }return arr2;
	} 
}
