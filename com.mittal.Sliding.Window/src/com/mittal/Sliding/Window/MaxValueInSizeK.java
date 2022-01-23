package com.mittal.Sliding.Window;
/*
 * Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6
 */
public class MaxValueInSizeK 
{
	public static void main(String[] args) 
	{
	int N=9;
	int arr[]= {1,2,3,1,4,5,2,3,6};
	int K=3;
    //int[] arr1=new int[N-K+1];
    int k=0;
    int value=arr[0];
    int maxvalue=arr[0];
       for(int i=0;i<N-K+1;i++)
       {
           maxvalue=arr[i];
           for(int j=i;j<i+K;j++)
           {
               value=arr[j];
               if(value>maxvalue)
               {
                   maxvalue=value;
               }
           }
           System.out.print(maxvalue+" ");
       }
    
}}
