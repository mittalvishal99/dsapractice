package com.company;
//...........................direct......return str.toUpperCase();
import java.util.Scanner;

public class up_to_low {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();


        String s1="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch>64 && ch<91)
            {
                int val=ch+32;
                ch=(char)val;
                s1=s1+ch;
            }
            else{
                s1=s1+ch;
            }
        }
        System.out.println(s1);    // write your code here
    }
}
