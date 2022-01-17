package com.mittal.interview;

public class reverseCharacterString {

	public static void main(String[] args) 
	{
		String S="god is one";
		char ch[]=S.toCharArray();
		ch=reverse(ch);
		String s1=String.valueOf(ch);
		System.out.println(s1);
		
	}
	//main method reverse krne k liye
	public static char[] reverse(char ch[])
	{
		int start=0;
		for(int end=0;end<ch.length;end++)
		{
			if(ch[end]==' ')
			{
				reversee(ch,start,end);
				//reverse god to dog
				start=end+1;
			}
		}// by this we will get ...dog si one
		
		//now reverse one
		reversee(ch,start,S.length()-1);
		//now we have .....dog si eno
		// we want one is god....so just reverse dog si eno
		reversee(ch,0,S.length(-1));
		
		return ch;
	}
	public static void reversee(char ch[],int start, int end)
	{
		//just put swap logic
		while(start<=end)
		{
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		//it will make god to dog
	}

}
