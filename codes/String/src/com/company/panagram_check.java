package com.company;

import java.util.Scanner;

public class panagram_check {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        // write your code here
        if(str.length()<26)
        {
            System.out.println(" false");
            return;
        }
        int count[]=new int[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            int val=str.charAt(i)-'a';
            count[val]++;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]==0)
            {

                System.out.println(" false");
                return;
            }
        }

        System.out.println("true");
    }
}
