/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        String s1="abcd";
        String s2="bcda";
        int len=s1.length();
        //rotation of s1

        String s3="";
        char ch[]=new char(n);
        for(int i=0;i<n;i++)
        {
            ch[i]=s1.charAt(i);
        }
        char ch1=ch[0];
        for(int i=0;i<n-1;i++)
        {
            s3.charAt(i)=ch[i+1];
        }
        s3.charAt(n-1)=ch1;
        System.out.println(s3);
    }
}
