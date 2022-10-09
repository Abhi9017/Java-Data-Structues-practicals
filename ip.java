import java.util.*;
public class ip{
	static Stack<Character> s=new Stack<Character>();
	 static StringBuffer sb=new StringBuffer(new String());
	public static Boolean checkoperand(char ch)
	{
		return (ch>='a' && ch<='z' || ch>='A' &&  ch<='Z');
	}
	public static int precendence(char ch)
	{
		switch(ch)
		{
			case '+':
			case '-':
			       return 1;
				   
	        case '*':
			case '/':
			       return 2;
				   
				   
		   case '^':
			
			       return 3;
				   
		}
		return -1;
	}
	
	public  static void infixtopost(String expr)
	{
		for(int i=0;i<expr.length();i++)
		{
			if(checkoperand(expr.charAt(i)))
			{
				sb.append(expr.charAt(i));
			}
			else  if(expr.charAt(i)=='(')
			{
				s.push(expr.charAt(i));
			}
			else if(expr.charAt(i)==')')
			{
				while(!s.isEmpty() && s.peek()!='(')
				{
					sb.append(expr.charAt(i));
					s.pop();
				}if(!s.isEmpty() && s.peek()!='(')
				{
					return;
				}else
				{
					s.pop();
				}
			}
			else
			{
				while(!s.isEmpty() && precendence(expr.charAt(i))<=precendence(s.peek()))
				{
					sb.append(s.peek());
					s.pop();
				}
				s.push(expr.charAt(i));
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
		String expression="((a+(b*c))-d)";
		infixtopost(expression);
	}
}