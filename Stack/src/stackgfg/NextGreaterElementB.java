package stackgfg;

import java.util.ArrayDeque;

public class NextGreaterElementB 
{
	public static void main(String args[])
	{
		long arr[]= {6,8,0,1,3};
		int n=arr.length;
		long res[]=nextLargerElement(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}
	}


public static long[] nextLargerElement(long[] arr, int n)
{ 
	ArrayDeque<Long>s=new ArrayDeque<>();
	long arr1[]=new long[n];
    for(int i=n-1;i>=0;i--)
    {
        if(s.isEmpty()==true)
        {
           arr1[i]=-1;
            s.push(arr[i]);
        }
        else if(s.peek()>arr[i])
        {
         arr1[i]=s.peek();
            s.push(arr[i]);
        }
        else if(s.peek()<=arr[i])
        {
            while(s.isEmpty()!=true && s.peek()<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty()==true)
            {
                arr1[i]=-1;
                s.push(arr[i]);
            }
            else{
                arr1[i]=s.peek();
                s.push(arr[i]);
            }
        }
    }
    return arr1;
}
}