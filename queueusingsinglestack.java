import java.util.*;
public class queueusingsinglestack
{
	static Stack<Integer> s1=new Stack<>();
	public static void enqu(Stack se,int data)
	{
		if(s1.isEmpty())
		{
			s1.push(data);
			return ;
		}
		int x=s1.pop();
		enqu(se,data);
		s1.push(x);
		
	}
	 public static int dequ()
	 {
		 if(s1.isEmpty())
		 {
			 return -1;
		 }
		return  s1.pop();
		 
	 }
	 public static int peek()
	 {
		  if(s1.isEmpty())
		 {
			 return -1;
		 }
		 return s1.peek();
	 }
	public static void main(String args[])
	{
	    
		queueusingsinglestack ss=new queueusingsinglestack();
		ss.enqu(s1,1);
		ss.enqu(s1,2);
		ss.enqu(s1,3);
		ss.enqu(s1,4);
		ss.enqu(s1,5);
		ss.enqu(s1,6);
		ss.enqu(s1,8);
		ss.dequ();
		while(!s1.isEmpty())
		{
			System.out.print(s1.peek());
			s1.pop();
		}
		
	}
}