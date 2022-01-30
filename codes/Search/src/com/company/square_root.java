//square root O(n)
package com.company;
import java.util.*;
public class square_root {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int x = in.nextInt();
        int i = 1;
        int val = 1;
        while (val <= x) {

            i++;
            val = i * i;


        }
        System.out.println(i - 1);
    }
}