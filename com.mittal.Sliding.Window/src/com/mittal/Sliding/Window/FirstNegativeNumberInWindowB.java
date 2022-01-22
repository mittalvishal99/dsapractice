package com.mittal.Sliding.Window;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNegativeNumberInWindowB 
{
	public static void main(String[] args) 
	{
		int N=5;
		long A[]= {-8, 2, 3, -6, 10};
		int K=2;
		Queue<Long>q=new ArrayDeque<Long>();
        long[] arr=new long[N-K+1];
        int k=0;
        int j=0;
        int i=0;
        while(j<N)
        {
            if(A[j]<0)
            {
                q.offer(A[j]);
            }
            if((j-i+1)<K)
            {
                j++;
            }
            else{
                if((j-i+1)==K)
                {
                    if(q.isEmpty()==true)
                    {
                        arr[k]=0;
                        k++;
                    }
                    else{
                        arr[k]=q.peek();
                        k++;
                    }
                }if(A[i]<0)
                {
                    q.poll();
                    i++;
                    j++;
                }
                else{
                    i++;
                    j++;
                }
            }
        }
        
        for(int m=0;m<(N-K+1);m++)
        {
        	System.out.println(arr[m]);
        }
	
}
}
