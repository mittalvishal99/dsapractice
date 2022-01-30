//...........MERGE_fUNCTION
package com.company;
import java.util.*;

public class merge_sort {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=9;
        int arr[]=new int[]{10,15,20,40,8,11,15,22,25};
        //for(int i=0;i<n;i++)
        //{
          //  arr[i]=in.nextInt();
        //}
        int l=0;
        int h=8;
        int m=3;
    int val1=m-l+1;
    int val2=h-m;
        int left[]=new int[val1];
        int right[]=new int[val2];
        for(int i=0;i<val1;i++)
        {
            left[i]=arr[i];
        }
        for(int i=0;i<val2;i++)
        {
            right[i]=arr[m+1+i];
        }

        for(int i=0;i<val1;i++)
        {
            System.out.print(left[i]+" ");
        }
        System.out.println();
        for(int i=0;i<val2;i++)
        {
            System.out.print(right[i]+" ");
        }
    }
}
