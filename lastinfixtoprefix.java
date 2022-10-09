import java.util.*;
public class lastinfixtoprefix{
	   static Stack<Character> s=new Stack<>();
	static	StringBuffer sb=new StringBuffer();
		
		public static Boolean checkoperand(char ch)
		{
			return (ch>='a' && ch<='z' || ch>='A' && ch<='Z');
		}
		public static int checkoperatorprecedence(char ch)
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
		public static void converttopostfix(String expre)
		{
			for(int i=0;i<expre.length();i++)
			{
				if(checkoperand(expre.charAt(i)))
				{
					sb.append(expre.charAt(i));
				}
				else if(expre.charAt(i)=='(')
				{
					s.push(expre.charAt(i));
				}
				else if(expre.charAt(i)==')')
				{
					while(!s.isEmpty() && s.peek()!='(')
					{
						sb.append(s.peek());
						s.pop();
					}
					if(!s.isEmpty() && s.peek()!='(')
					{
						return;
					}
					else{
						s.pop();
					}
				}
				else{
					while(!s.isEmpty()&&checkoperatorprecedence(expre.charAt(i)) <= checkoperatorprecedence(s.peek()))
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
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the expression to convert to postfix from infix");
		String expression=sc.nextLine();
		converttopostfix(expression);
	}
}