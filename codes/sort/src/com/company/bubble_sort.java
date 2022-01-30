package com.company;

import java.util.Scanner;

public class bubble_sort {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        /*
         * 	First Sorting Algo
           	bigO(n^2)
        	stable
        	best case O(n) for already sorted algo
        	AFTER FIRST ITERATION THE LARGEST ELEMENT IS AT LAST POSITION
        
        arr[]={ 5,3,1,6,9,8}
        n=6
        After first iteration-
        i=0;    	j<5;
     
   j-->0 if(5>3)
         {
         	swap(5,3)
         }							    arr-->3,5,1,6,9,8
     
   j-->1 if(5>1)
         {
         	swap(5,1)
         }								arr-->3,1,5,6,9,8
     
   j-->2 if(5>6)
         {
         	NO
         }					 arr-->3,1,5,6,9,8
         
   j-->3 if(6>9)
         {
         	no
         }					 arr-->3,1,5,6,9,8
         
    j-->4 if(9>8)
         {
         	swap(9,8)
         }					 arr-->3,1,5,6,8,9
         
         LIKE THIS MAX ELEMENT IS MOVED AT LAST POSITION
         AND WE ALWAYS START OUR J LOOP FROM 0
         TILL N-I
         MEANS EXCULDING LAST VALUES
        */
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
