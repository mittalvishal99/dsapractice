package com.mittal.interview;

public class removeAllSpaces 
{
	public static void main(String args[]) 
	{
		String S="Vishal      Mittal";
		
		//convert it to char array
		char[] ch=S.toCharArray();
		
		//take an empty string
		String s2="";
		int i=0;
		
		//traverse the char array if ch is not space then add it to new string
		while(i<S.length())
		{
			if(ch[i]!=' ')
			{
				s2=s2+ch[i];
			}i++;
		}
		
		//print new string
		System.out.println(s2);
		
		
		/*String S;
		String V="";
		S=V;
		System.out.println(S.isEmpty());
		
		*/
	}

}
