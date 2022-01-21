package com.mittal.Sliding.Window;
/*
 * this is better approach
 * why we thought of this??
 * first see naive approach
 * IN THIS QUESTION SEE HOW WE ATTEMPT WINDOW SLIDING
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
            sum=sum+arr[j]; //MAIN TASK kya karna hai sum
            if((j-i+1)<K)
            {
                j++;		       //FIRST---create karo window ko fir iss loop mei kabhi nahi aana
            }
            else if((j-i+1)==K) //SECOND--agar window ho gyi fir operations karo
                {
                    if(sum>maxsum)
                    {
                    maxsum=sum;   
                    }
                    sum=sum-arr[i];
                    i++;
                    j++;
                }
        }
        System.out.println(maxsum);
		}
}
