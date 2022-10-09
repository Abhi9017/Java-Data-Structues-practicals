import java.util.*;
public class pe{
	static Stack<Integer> s=new Stack<>();
	public static Boolean checkoperand(char ch)
	{
		return (ch>=0 && ch<=9);
	}
	public static int  convert(String expre)
	{
		for(int i=0;i<expre.length();i++)
		{
			 char c=expre.charAt(i);
			if(Character.isDigit(c))
			{
				
				s.push(c-'0' );
			}
			else
			{
				int y=s.peek();
				s.pop();
				int x=s.peek();
				s.pop();
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
		System.out.print(s.peek());
		return s.peek();
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  epxpression of postix");
		String expression=sc.nextLine();
		convert(expression);
	}
}