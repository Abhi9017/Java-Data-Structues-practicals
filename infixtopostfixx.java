import java.util.*;
public class infixtopostfixx
{
	public static Boolean  checkoperand(char ch)
	{
		return(ch>='a' && ch<='z' || ch>='A' && ch<='Z');
	}
	public static String getinfix(String expre)
	{
		Stack<String> s=new Stack<>();
		for(int i=0;i<expre.length();i++)
		{
			if(checkoperand(expre.charAt(i)))
			{
				s.push(expre.charAt(i)+"");
			}
			else
			{
				String f=s.peek();
				s.pop();
				String st=s.peek();
				s.pop();
				s.push(st+expre.charAt(i)+f);
			}
		}
		return s.peek();
	}
	public static void main(String args[])
	{
		String expression="ab*c+";
		System.out.print(getinfix(expression));
	}
}