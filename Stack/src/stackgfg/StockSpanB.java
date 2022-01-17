package stackgfg;

import java.util.ArrayDeque;

public class StockSpanB 
{
	public static void main(String[] args) 
	{
		int price[]= {10,4,5,90,120,80};
		int brr[]=calculateSpan(price,6);
		for(int i=0;i<6;i++)
		{
			System.out.print(brr[i]+" ");
		}

	} public static int[] calculateSpan(int arr[], int n)
    {
		int arr2[]=new int[n];
        ArrayDeque<Integer>s=new ArrayDeque<>();
        
        for(int i=0;i<n;i++)
        {
            if(s.isEmpty()==true)
            {
                s.push(i);
                arr2[i]=1;
            }
            else if(arr[s.peek()]>arr[i])
            {
                arr2[i]=s.peek();
                s.push(i);
            }
            else if(arr[s.peek()]<=arr[i])
            {
                while(s.isEmpty()!=true && arr[s.peek()]<=arr[i])
                {
                    s.pop();
                }
                if(s.isEmpty()==true)
                {
                    s.push(i);
                    arr2[i]=-1;
                }
                else{
                    arr2[i]=s.peek();
                    s.push(i);
                }
            }
        }for(int i=1;i<n;i++)
        {
            arr2[i]=i-arr2[i];
        }
        return arr2;
    
    }
}
