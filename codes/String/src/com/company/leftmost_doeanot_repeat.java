package com.company;
import java.util.*;
public class leftmost_doeanot_repeat {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int count[]=new int[256];
        //find frequency
        for(int i=0;i<a.length();i++)
        {
            int val=a.charAt(i);
            count[val]++;
        }//check from left if freq==1
        for(int i=0;i<a.length();i++)
        {
            int val=a.charAt(i);
            if(count[val]==1)
            {
                System.out.println(a.charAt(i));
                break;
            }
        }
    }
}
