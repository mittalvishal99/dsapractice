package com.company;

import java.util.Scanner;

public class mergesort_full {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        void mergesort(int arr[],int l,int r)
        {
            int m=(l+(r-l))/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
        void merge(int arr[]int l,int m,int r)
        {
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



        }
    }
}
