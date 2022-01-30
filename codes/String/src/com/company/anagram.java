//...........anagram
//geeks ekegs both are anagram
//jumble if same or permutation
package com.company;
import java.util.*;
public class anagram {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
    //if length is not same then strings cant be anagram
        if(a.length()!=b.length())
        {
            System.out.println("False");
            return;
        }
        //count array of 256 can take 26 with some math
        int count[]=new int[256];
        //what we do is make the value of count at that word as 1
        //then traverse other string and make its as -1
        //if both strings contain same letters then the result should be 0
        for(int i=0;i<a.length();i++)
        {
            int val=a.charAt(i);
            count[val]++;
        }
        for(int i=0;i<b.length();i++)
        {
        int val=b.charAt(i);
        count[val]--;
        }
        // checking for 0 result
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");

    }
}
