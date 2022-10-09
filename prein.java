import java.util.*;
public class prein{
	static StringBuffer  sb=new StringBuffer();
	  static Stack<String> s=new Stack<>();
	public static Boolean checkoperand(char ch)
	{
		return (ch>='a' && ch<='z' || ch>='A' && ch<='Z');
	}
	public static void convert(String expre)
	{
		for(int i=expre.length()-1;i>=0;i--)
		{
			if(checkoperand(expre.charAt(i)))
			{
				s.push(expre.charAt(i)+"");
			}
			else
			{
				String y=s.pop();
				String x=s.pop();
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
		while(!s.isEmpty())
		{
			sb.append(s.peek());
			s.pop();
		}
		System.out.print(sb.reverse());
	}
public static void  main(String args[]){
	String s="+ab";
	convert(s);
}
}
