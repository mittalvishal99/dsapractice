//Given a binary sorted non-increasing array of 1s and 0s. You need to print the count of 1s in the binary array.
//
//Example 1:
//
//Input:
//N = 8
//arr[] = {1,1,1,1,1,0,0,0}
//Output: 5
//Explanation: Number of 1's in given
//binary array : 1 1 1 1 1 0 0 0 is 5.
//can do it in O(n) easily
// but to do in log(n).....need to use binary search
package com.company;
import java.util.*;
public class count_number_of_one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] == 0)
            {
                high = mid - 1;
            }
            //yaa to last element aa gya jo 1 hoga....zero to ho nhi sakta,kyuki uska case uupar handle kar liya
            // OR suppose array is this [1,1,1,1,0,0] and you are at 4 th pos
            else if (mid == n - 1 || arr[mid + 1] == 0)
            {
                System.out.println(mid+1);
                return;
            }
            //nhi to vo second index prr hai...iska mtlb uske peechay k bekaar
            else {
                low = mid + 1;
            }
        }
        System.out.println("-1");
    }
}