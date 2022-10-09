import java.util.*;
public class pretoin
{
	static Stack<String> s=new Stack<>();
	
	public static Boolean checkoperand(char ch)
	{
		return (ch>='a' && ch<='z' || ch>='A'  && ch<='Z');
	}
	
	public static void convert(String expre)
	{
		for(int i=0;i<expre.length();i++)
		{
		if(checkoperand(expre.charAt(i)))
		{
			s.push(expre.charAt(i)+"");
		}
		else
		{
			String y=s.pop();
			String  x=s.pop();
			switch(expre.charAt(i))
			{
				case'+':
				s.push(x+expre.charAt(i)+y);
				break;
				case'-':
				s.push(x+expre.charAt(i)+y);
				break;
				case'*':
				s.push(x+expre.charAt(i)+y);
				break;
				case'/':
				s.push(x+expre.charAt(i)+y);
				break;
				case'^':
				s.push(x+expre.charAt(i)+y);
				break;
			}
		}
		
		}
		System.out.print(s.peek());
	}
	
	
	
	
	public static void main(String args[])
	{
		String expression="abc*+";
		convert(expression);
	}
}