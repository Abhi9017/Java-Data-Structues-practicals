import java.util.*;
public class infixtoprefix
{
	 static StringBuffer sb =new StringBuffer();
	static Stack<Character> s=new Stack<>();
	public static Boolean checkoperaand(char ch)
	{
		return(ch>='a' && ch<='z' || ch>='A' && ch<='Z');
	}
	public static int precedence(char ch)
	{
		switch(ch)
		{
			case'+':
			case'-':
			return 1;
			case'*':
			case'/':
			return 2;
			case'^':
			
			return 3;
			
		}
		return -1;
	}
	public static  void convert(String expre)
	{
		for(int i=expre.length()-1;i>=0;i--)
		{
			if(checkoperaand(expre.charAt(i)))
			{
				sb.append(expre.charAt(i));
			}
			else if(expre.charAt(i)==')')
			{
				s.push(expre.charAt(i));
			}
			else if(expre.charAt(i)=='(')
			{
				while(!s.isEmpty() && s.peek()!=')')
				{
					sb.append(s.peek());
					s.pop();
				}
				if(!s.isEmpty() && s.peek()!=')')
				{
					return;
				}
				else
				{
					s.pop();
				}
			}
			else
			{
				while(!s.isEmpty() && precedence(expre.charAt(i))<precedence(s.peek()))
				{
					sb.append(s.peek());
					s.pop();
				}
				s.push(expre.charAt(i));
			}
		}
		while(!s.isEmpty())
		{
			sb.append(s.peek());
			s.pop();
		}
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
	
	
	public static void  main(String args[])
	{
		String expression="k+l-m*n+(o^p)*w/u/v*t+q";
		convert(expression);
	}
}