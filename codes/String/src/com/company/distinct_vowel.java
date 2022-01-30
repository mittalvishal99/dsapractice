package com.company;
//count distinct vowels
import java.util.Scanner;

public class distinct_vowel {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
//take count array just like anagram
        int count[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            //but increment count array value only when vowel is there
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                int val=ch;
                count[val]++;
            }
        }
        int sum=0;
        //just check for value more than one
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
