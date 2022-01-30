//..........theta(n^2)
//best performance for small input size

package com.company;
import java.util.Scanner;

public class insertion_sort
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        //start from second element
        //after every iteration elements from 0 to i-1 are sorted
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
