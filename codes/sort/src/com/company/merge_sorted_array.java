package com.company;
import java.util.*;
// this solution is with extra space
//it is basic for merge sort
public class merge_sorted_array
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        int arr1[]=new int[]{10,15,20,40};
        int m=4;
        int n=5;
        int arr2[]=new int[]{5,6,6,10,15};
        //int temp[]=new int[m+n];
        int i=0;
        int j=0;
        //int k=0;
        while(i<m && j<n)
        {
            if(arr1[i]<arr2[j])
            {
                System.out.println(arr1[i]+" ");
                //temp[k]=arr1[i];
                i++;
                //k++;
            }
            else if(arr1[i]>arr2[j])
            {

                System.out.println(arr2[j]+" ");
                    //temp[k]=arr2[j];
                    j++;
                    //k++;
            }
            else
            {

                System.out.println(arr2[j]+" ");
                //temp[k] = arr1[i];
                i++;
                //k++;
                j++;
            }
        }
        while(i<m)
        {
            System.out.println(arr1[i]+" ");
            //temp[k]=arr1[i];
            i++;
            //k++;
        }
        while(j<n)
        {
            System.out.println(arr2[j]+" ");
            //temp[k]=arr2[j];
            j++;
            //k++;
        }
       // for(int l=0;l<temp.length;i++)
        //{
          //  System.out.println(temp[l]);
        //}
    }

}