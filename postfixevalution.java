import  java.util.*;
public class postfixevalution
{
	
	static Stack<Integer> s=new Stack<Integer>();
	static int x=0;
	static int y=0;
	public static int post(String expre)
	{
		for(int k=0;k<expre.length();k++)
		{
			char ch=expre.charAt(k);
		if(Character.isDigit(ch)){
			s.push(ch - '0');
		}
		
		else
		{
			y=s.pop();
			x=s.pop();
			switch(expre.charAt(k))
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
	System.out.println(s.peek());
		return s.pop();
	}
	
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("enter expresion");
	   String s=sc.nextLine();
	   post(s);
   }	
}