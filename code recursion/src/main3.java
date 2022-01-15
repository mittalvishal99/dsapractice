import java.util.ArrayList;
import java.util.Scanner;

public class main3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer>arrodd=new ArrayList<>();
		ArrayList<Integer>arreven=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				arreven.add(arr[i]);
			}
			else {
				arrodd.add(arr[i]);
			}
		}
		System.out.println("even number array");
		for(int i:arreven)
		{
			System.out.print(i+" ");
		}
System.out.println();
		System.out.println("eoddnumber array");
		for(int i:arrodd)
		{
			System.out.print(i+" ");
		}
		
		
		

	}

}
