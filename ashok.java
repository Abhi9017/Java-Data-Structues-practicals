import java.util.*;
public class ashok{
	
		
		public static Boolean isoperand(char ch)
		{
		   return (ch >='a'&& ch <='z') || (ch >='A' && ch >='Z');	
		}
		public static String getinfix(String expre)
		{
			 Stack<String> s=new Stack<>();
			for(int i=0; i<expre.length(); i++)
			{
				if(isoperand(expre.charAt(i)))
				{
					s.push(expre.charAt(i)+"");
					
				}
				else
				{
					String s1=s.peek();
					s.pop();
					String s2=s.peek();
					s.pop();
					s.push(s2+ expre.charAt(i)+s2);
				}
			}
			
			return s.pop();
		}
		
		public static void main(String args[])
	{
		String  expression="ab+";
		System.out.print(getinfix(expression));
	}
}