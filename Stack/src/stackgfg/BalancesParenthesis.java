package stackgfg;

import java.util.ArrayDeque;
import java.util.Scanner;

/*-------[{()}]----valid
 * ------[{( })]-------invalid
 * 
 * jo bracket pahle aaya vo pahle hi jayega
 * 
 * 
 */
public class BalancesParenthesis {

	public static void main(String[] args) 
	{
		//Scanner sn=new Scanner(System.in);
		String S="((())";
		
		System.out.println(balanced(S));
	}
	public static boolean balanced(String S)
	{
		ArrayDeque<Character>s=new ArrayDeque<>();
		char ch[]=S.toCharArray();
		if(ch[0]=='(' || ch[0]=='{' || ch[0]=='[')
		{
			s.push(ch[0]);
		}
		else {
			return false;
		}
		for(int i=1;i<S.length();i++)
		{
			if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
			{
				s.push(ch[i]);
			}
			//yeh (())) iss case k liye
			else if(s.isEmpty())
			{
				return false;
			}
			else if(!(match(ch[i],s.peek())))
			{
				return false;
			}
			else {
				s.pop();
			}
		}
		if(s.isEmpty()==true)
		{
			return true;
		}
		return false;
	}
	public static boolean match(char b,char a)
	{
		if(a=='('&& b==')')
		{
			return true;
		}
		else if(a=='{' && b=='}')
		{
			return true;
		}
		else if(a=='[' && b==']')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
