package com.mittal.Sliding.Window;

public class LongestSubarrayWithSumK 
{
	  int maxvalue=0;
      for(int i=0;i<n;i++)
      {   int value=0;
          int sum=0;
          for(int j=i;j<n;j++)
          {
              sum=sum+A[j];
              if(sum==K)
              {
                  value=j-i+1;
                  if(value>maxvalue)
                  {
                      maxvalue=value;
                  }
                  
              }
          }
      }
      return maxvalue;

}
