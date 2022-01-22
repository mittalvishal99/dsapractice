package com.mittal.Sliding.Window;
/*
 * Input : 
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output : 
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6
 */
public class FirstNegativeNumberInWindow 
{
	public static void main(String[] args) 
	{
		int N=5;
		int A[]= {-8, 2, 3, -6, 10};
		int K=2;
        long[] arr=new long[N-K+1];
        int k=0;
        for(int i=0;i<N-K+1;i++)
        {
            boolean flag=true;
            for(int j=i;j<i+K;j++)
            {
                if(A[j]<0)
                {
                    arr[k]=A[j];
                    flag=false;
                    k++;
                    break;
                }
            }
            if(flag==true)
            {
                arr[k]=0;
                k++;
            }
        }
        for(int i=0;i<N-K+1;i++)
        {
        	System.out.println(arr[i]);
        }
	}
}
