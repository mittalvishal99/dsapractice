package stackgfg;
/*
 * N = 5, arr[] [6 8 0 1 3]
Output:
8 -1 1 3 -1
Explanation:
In the array, the next larger element to 
6 is 8, for 8 there is no larger elements 
hence it is -1, for 0 it is 1 , for 1 it 
is 3 and then for 3 there is no larger 
element on right and hence -1.
 * 
 */
public class NextGreaterElementA 
{
	public static void main(String args[])
	{
		long arr[]= {6,8,0,1,3};
		int n=arr.length;
		long res[]=nextLargerElement(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	 public static long[] nextLargerElement(long[] arr, int n)
	    { 
	        long arr1[]=new long[n];
	        arr1[n-1]=-1;
	        boolean flag=false;
	        for(int i=0;i<n-1;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(arr[j]>arr[i])
	                {
	                    arr1[i]=arr[j];
	                    flag=true;
	                    break;
	                }
	            }if(flag==false)
	            {
	                arr1[i]=-1;
	            }flag=false;
	        }
	        return arr1;
	    } 
}
