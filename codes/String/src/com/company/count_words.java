package com.company;

import java.util.Scanner;

public class count_words {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
