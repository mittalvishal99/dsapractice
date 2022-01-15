
public class main2 {

	public static void main(String[] args) 
	{
		for(int i=0;i<6;i++)
		{
			if(i!=0)
			{
			System.out.print("#");
			
			}
			for(int j=1;j<6;j++)
			{
				if(i==0 || i==5)
				{
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i!=5)
			{
			System.out.print("#");
			}
			System.out.println();
		}
	}

}
