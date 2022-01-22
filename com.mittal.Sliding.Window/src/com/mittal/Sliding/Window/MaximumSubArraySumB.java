package com.mittal.Sliding.Window;
/*
 * this is better approach
 * why we thought of this??
 * first see naive approach
 * IN THIS QUESTION SEE HOW WE ATTEMPT WINDOW SLIDING---3 STEP PROCESS
 * WE WILL HAVE NO CALCULATION OF J IN IF LOOP
 */
public class MaximumSubArraySumB {

	public static void main(String[] args) 
	{
		int N=4;
		int arr[]= {199,200,300,400};
		int K=2;
        int sum=0;
        int maxsum=0;
       
        int i=0;
        int j=0;
        // i is starting of window and j is ending
        while(j<N)// j<N we have to work till ending of window end of array ko hit nhi krti 
        {
            sum=sum+arr[j]; //FIRST..FIND OUT THE CALCULATION
            				//MAIN TASK kya karna hai sum
            if((j-i+1)<K)
            {
                j++;	//SECOND---CREATE WINDOW
                		//ONE TIME VISIT
            }
            else if((j-i+1)==K) 
                {
                    if(sum>maxsum)
                    {
                    maxsum=sum;   //THIRD..DO THE CALCULATIONS
                    }
                    sum=sum-arr[i];
                    i++;		//FOURTH...SLIDE THE WINDOW
                    j++;
                }
        }
        System.out.println(maxsum);
		}
}
