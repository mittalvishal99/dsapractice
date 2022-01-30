//......take O(n)

package com.company;
import java.util.*;
public class linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int X=in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");


    }
}