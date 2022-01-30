package com.company;

import java.util.Scanner;

public class missing_char_panagram{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s1="";
        // Find and return the missing characters
        // to complete Panagram string
        int count[]=new int[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            int val=str.charAt(i)-'a';
            count[val]++;
        }
        int flag=0;
        for(int i=0;i<26;i++)
        {
            if(count[i]==0)
            {
                int val=i+ (int)'a';
                s1=s1+(char)val;
                flag=1;
            }
        }
        if(flag==0)
        {
            s1=s1+"-1";
        }
        System.out.println(s1);
    }
}
