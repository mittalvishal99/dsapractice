package stackgfg;
/*
 * Input: 
N = 6, price[] = [10 4 5 90 120 80]
Output:
1 1 2 4 5 1
Explanation:
Traversing the given input span for 10 
will be 1, 4 is smaller than 10 so the 
span will be 1, 5 is greater than 4 so 
the span will be 2 and so on. Hence, the 
output will be 1 1 2 4 5 1.
 */
public class StockSpan {
//naive O(n2) in worst case if array is sorted
	public static void main(String[] args) 
	{
		int price[]= {10,4,5,90,120,80};
		int brr[]=calculateSpan(price,6);
		for(int i=0;i<6;i++)
		{
			System.out.print(brr[i]+" ");
		}

	} public static int[] calculateSpan(int price[], int n)
    {
        int arr[]=new int[n];
        arr[0]=1;
        int count=1;
        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(price[j]<=price[i])
                {
                    count++;
                }
                else{
                    break;
                }
            }
            arr[i]=count;
            count=1;
        }
        return arr;
    }

}
