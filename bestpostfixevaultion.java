import java.util.*;
public class bestpostfixevaultion
{
    
	static Stack<Integer> s=new Stack<>();
	public static int post(String expre)
	{
		for(int i=0;i<expre.length();i++)
		{
			 char ch=expre.charAt(i);
			if(Character.isDigit(ch))
			{
				s.push(ch -'0');
			}
			else
			{
				int y=s.pop();
				int x=s.pop();
				switch(expre.charAt(i))
				{
					case'+':
					  s.push(x+y);
					  break;
					  case'-':
					  s.push(x-y);
					  break;
					  case'*':
					  s.push(x*y);
					  break;
					  case'/':
					  s.push(x/y);
					  break;
				}
			}
		}
		return s.pop();
	}
	public static void main(String args[])
	{
		String expression="ab+";
		System.out.print("answers is "+post(expression));
	}
}