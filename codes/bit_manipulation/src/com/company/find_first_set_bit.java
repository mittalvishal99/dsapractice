//..................The task is to return the position of first set bit found from the right side
// ..................in the binary representation of the number.
//...................Note: If there is no set bit in the integer N, then return 0 from the function.

//Input: N = 18
//Output: 2
//Explanation: Binary representation of
//18 is 010010,the first set bit from the
//right side is at position 2.

package com.company;
import java.util.Scanner;

public class find_first_set_bit{

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int count=1;
        while(n!=0)
        {
            if(n%2!=0)
            {
                System.out.println(count);
                return;
            }else{

                n=n>>1;
                count++;
            }
        }System.out.println("0");
    }
}
