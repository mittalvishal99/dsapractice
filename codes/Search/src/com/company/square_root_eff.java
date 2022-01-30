//..................square root in log(n)
package com.company;
import java.util.*;
public class square_root_eff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        long ans=0;
        int low=0;
        long high=x;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(mid*mid>x)
            {
                high=mid-1;
            }
            else{
                if(mid*mid<x)
                {
                    ans=mid;
                }
                else{
                    System.out.println(mid);
                    return;
                }
            }
        }System.out.println(ans);
}}