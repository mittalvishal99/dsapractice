// ..............find number is prime or not
//time complexity is [n ^ 1/2]
// this is using till square root of n  which as approx n/2
package com.company;

import java.util.Scanner;

public class prime {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N=14;
            for(int i=2;i<=Math.sqrt(N);i++)
            {
                if(N%i==0)
                {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        // write your code here
    }
}