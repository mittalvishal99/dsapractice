//efficient......
// but not for 0
//...........observe that the floor value of log base 10 increased by 1,of any number
//...........gives the number of digits present in that number.

package com.company;

import java.util.*;


public class count_efficient {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int x=0;
        int y=(int)Math.floor(Math.log10(x) + 1);
        System.out.println(y);


    }
}
