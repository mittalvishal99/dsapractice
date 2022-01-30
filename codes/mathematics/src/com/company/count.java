//naive method.....O(n)
//..........123/10=12
//...........12/10=2
//...........2/10=0.2(break)
package com.company;
import java.util.*;
public class count {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x=123;
        int count=0;
        while(x!=0)
        {
            x=x/10;
            count++;
        }
        System.out.println(count);
    }
}
