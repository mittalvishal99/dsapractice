//...........O(n^2)
// not stable....same element swaps itself
package com.company;
import java.util.*;

public class selection_sort {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int min=arr[0];
        int index=0;
        //selection sort
        //find minimum element and then put it in front

        for(int i=0;i<n;i++)
        {
            int index1=0;
            int min_val=arr[i];
            for(int j=i;j<n;j++)
            {
                if(arr[j]<=min_val)
                {
                    min_val=arr[j];
                    index1=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index1];
            arr[index1]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
