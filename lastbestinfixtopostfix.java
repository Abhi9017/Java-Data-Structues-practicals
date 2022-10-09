import java.util.*;
public class  lastbestinfixtopostfix
{
	static StringBuffer sb=new StringBuffer();
	static Stack<Character> s=new Stack<>();
	
	public static Boolean checkoperand(char ch)
	{
		return (ch>='a' && ch<='z' || ch>='A' && ch<='Z');
		
	}
	public static int cheackoperanttot(char ch)
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
	public static void post(String expre)
	{
		for(int i=0;i<expre.length();i++)
		{
			if(checkoperand(expre.charAt(i)))
			{
				sb.append(expre.charAt(i));
			}else if(expre.charAt(i)=='(')
			{
				s.push(expre.charAt(i));
			}
			else if(expre.charAt(i)==')')
			{
				while(!s.isEmpty() && s.peek()!='(')
				{
					sb.append(s.peek());
					s.pop();
				}if(!s.isEmpty() && s.peek()!='(')
				{
					return;
				}else
				{
					s.pop();
				}
			}else
			{
				while(!s.isEmpty() && cheackoperanttot(expre.charAt(i))<=cheackoperanttot(s.peek()))
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
		System.out.print(sb);
	}
	
	
	
	public static void main(String args[]){
		String expression="5+6";
		post(expression);
	}
}