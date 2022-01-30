//...............counting digits in factorial without finding factorial value
package com.company;
import java.util.Scanner;
public class digits_in_factorial {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N=120;
        if(N==0 || N==1)
        {
            System.out.println(1);
            return;
        }
        /*
        Observe that the floor value of log base 10 if increased by 1, of any number, gives the
number of digits present in that number.
........AND

log(a*b) = log(a) + log(b)

Therefore we need
log( n! ) = log(1*2*3....... * n)
          = log(1) + log(2) + ........ +log(n)

Hence, Number of digits would be : floor(log10(n!)) + 1
 */
        double result=0;
        for(int i=2;i<=N;i++)
        //calculating log10(n!)
        {
            result=result + Math.log10(i);
        }
        //calculating floor value +1;
        int y=(int)Math.floor(result)+1;
        System.out.println(y);
    }
}