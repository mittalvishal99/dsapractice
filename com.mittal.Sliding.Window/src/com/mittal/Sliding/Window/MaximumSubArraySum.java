package com.mittal.Sliding.Window;

/*
 * Given an array of integers Arr of size N and a number K.
 *  Return the maximum sum of a subarray of size K.
 * Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700 
 */

public class MaximumSubArraySum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		int arr[]= {199,200,300,400};
		int K=2;
        int sum=0;
        int maxsum=0;
        //array ko n-k+1 length tak chalana hai
        for(int i=0;i<N-K+1;i++)
        {
            sum=0;
            // for each value of i uska window size tak karna hai i+k
            for(int j=i;j<i+K;j++)
            {
                sum=sum+arr[j];
            }
            if(sum>maxsum)
            {
                maxsum=sum;
            }
        }
        System.out.println(maxsum);

	}
	/*
	 * We can see
	 * 1) We are doing duplicate work sum ko 100+200+300
	 *  fir sum ko 200+300+400
	 *  why
	 *  and see given data in question window hai
	 *  to try ki sliding window lagay
	 * 
	 */

}
