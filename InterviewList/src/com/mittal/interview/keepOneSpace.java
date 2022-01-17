package com.mittal.interview;

public class keepOneSpace 
{
	public static void main(String args[]) 
	{
		String S="Vishal      Mittal";
		char[] ch=S.toCharArray();
		String s2="";
		int i=0;
		boolean flag=true;
		
		while(i<S.length())
		{
			//if character then add it to string
			while(i<S.length() && ch[i]!=' ')
			{
				s2=s2+ch[i];
				i++;
			}
			//if space then move move move...put flag to false
			while(i<S.length() && ch[i]==' ')
			{
				flag=false;
				i++;
			}
			//if flag is false then increase one space 
			if(flag==false)
			{
				s2=s2+" ";
				flag=true;
			}
			
		}System.out.println(s2);
		
		

	}

}
