package stackgfg;

//Output: 2 5 2 -1 -1
public class NextSmallerElementA 
{
	public static void main(String args[])
	{
		int arr[]= {3, 8, 5, 2, 25};
		int n=arr.length;
		int res[]=nextSmallerElement(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static int[] nextSmallerElement(int arr[], int n) 
	{ 
	    int arr1[]=new int[n];
	    arr1[n-1]=-1;
	    for(int i=0;i<n-1;i++)
	    {
	        boolean flag=false;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[j]<arr[i])
	            {
	                flag=true;
	                arr1[i]=arr[j];
	                break;
	            }
	        }
	        if(flag==false)
	        {
	            arr1[i]=-1;
	        }
	    }return arr1;
	    
	} 

}
