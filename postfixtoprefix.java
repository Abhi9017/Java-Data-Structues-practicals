import java.util.*;
public class postfixtoprefix
{
	static Stack<String> s=new Stack<>();
	public static Boolean checkoperand(char ch)
	{
		return  (ch>='a' && ch<='z' ||  ch>='A' && ch<='Z' );
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
			String y=s.peek();
			s.pop();
			String x=s.peek();
			s.pop();
			s.push(expre.charAt(i)+x+y);
		}
	   }
	   while(!s.isEmpty())
	   {
		   System.out.print(s.peek());
		   s.pop();
	   }
	}
	
	
	public static void main(String args[])
	{
		String s="ab+cd-*";
        convert(s);
	}
}