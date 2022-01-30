package com.company;

import java.util.Scanner;

public class reverse{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        // write your code here
        String s="";
        for(int i=str.length()-1;i>=0;i--)
        {
            s=s+str.charAt(i);
        }
        System.out.println(s);
    }
}
