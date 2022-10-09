import java.util.*;
public class pii
{
	static Stack<String>s =new Stack<>();
	public static Boolean checkoperatand(char ch)
	{
		return (ch>='a' && ch<='z' || ch>='A' && ch<='Z');
	}
	public static void convert(String expre)
	{
		for(int i=0;i<expre.length();i++)
		{
			if(checkoperatand(expre.charAt(i)))
			{
				
				s.push(expre.charAt(i)+"");
			}
			else
			{
				String fpop=s.peek();
				s.pop();
				String spop=s.peek();
				s.pop();
				s.push("("+spop+expre.charAt(i)+fpop+")");
			}
		}
		System.out.print(s.pop());
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  epxpression of postix");
		String expression=sc.nextLine();
		convert(expression);
	}
}
