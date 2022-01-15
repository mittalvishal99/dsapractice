import java.util.*;
public class pattern {
	public static void main(String args[])
	{
		int row=6;
		int column=row;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i==0 || i==5 || j==0 || j==5)
				{
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}

}
