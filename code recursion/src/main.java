import java.util.*;

public class main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weight");
		int weight=sc.nextInt();
		System.out.println("enter height");
		double height=sc.nextInt();
		double heightmeter=(height/100);
		
		
		
	 double bmi=(weight/(heightmeter*heightmeter));
	 
	 System.out.println(bmi);
		
				
				
	}
}
