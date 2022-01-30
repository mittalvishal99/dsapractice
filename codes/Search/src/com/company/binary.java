//.............takes log(n) time complexity
package com.company;
import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int X=in.nextInt();

        int low=0;
        int high=n-1;
        int flag=0;
        while(low<=high)
        {

            int mid=(low+high)/2;
            if(X==arr[mid])
            {
                flag=1;
                break;
            }
            else if(X<arr[mid])
            {
                high=mid-1;
            }
            else if(X>arr[mid])
            {
                low=mid+1;
            }
        }
        if(flag==0)
        {
            System.out.println("-1");
            return;
        }
        System.out.println("1");

    }
}