import  java.util.*;
public class itop
{  
  static Stack<Character> s=new Stack<>();
  static StringBuffer sb=new StringBuffer();
  public static Boolean checkoopernad(char ch)
  {
	  return (ch>='a' && ch<='z' || ch>='A' && ch<='Z');
  }
  public static int precendence(char ch)
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
  public static void convert(String expre)
  {
	  for(int i=expre.length()-1;i>=0;i--)
	  {
		  if(checkoopernad(expre.charAt(i)))
		  {
			  sb.append(expre.charAt(i));
		  }
		  else if(expre.charAt(i)==')')
		  {
			  s.push(expre.charAt(i));
		  }
		  else if(expre.charAt(i)=='(')
		  {
			  while(!s.isEmpty() && s.peek()!=')')
			  {
				  sb.append(s.peek());
				  s.pop();
			  }
			  if(!s.isEmpty() && s.peek()!=')')
			  {
				  return ;
			  }else
			  {
				  s.pop();
			  }
		  }
		  else
		    {
				while(!s.isEmpty() && precendence(expre.charAt(i))<precendence(s.peek()))
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
	  System.out.print(sb.reverse());
	  
  }
	public static void main(String args[]){
		String s="a+b";
		convert(s);
	}
}
