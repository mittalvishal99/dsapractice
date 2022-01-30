package com.company;
import java.util.Scanner;
//.......................................this solution not valid for larger values
//Input:
//N = 4
//Output: 24
//Explanation: 4! = 4 * 3 * 2 * 1 = 24
public class factorial {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N=13;

            long mul=1;
            while(N>=1)
            //..................................example factorial of 6 is 6*5*4*3*2*1 which is 720.
            {
                mul=mul*N;
                N--;
            }
            System.out.println(mul);


    }
}