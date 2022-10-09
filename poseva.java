import java.util.*;
public class poseva
{
	static Stack<Integer> s=new Stack<>();
	
	public static Boolean checkoperand(char ch)
	{
		return (ch>='a' && ch<='z' || ch>='A'  && ch<='Z');
	}
	
	public static void convert(String expre)
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
			int  x=s.pop();
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
				case'^':
				s.push(x^y);
				break;
			}
		}
		
		}
		System.out.print(s.peek());
	}
	
	
	
	
	public static void main(String args[])
	{
		String expression="56+";
		convert(expression);
	}
}