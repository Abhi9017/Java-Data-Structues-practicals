import java.util.*;
public class queueusing2stacks{
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	public static void enqueue(int data)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	public static int deueue()
	{
		if(s1.isEmpty()){
			return -1;
		}
		return s1.pop();
		
	}
	public static int display()
	{
		if(s1.isEmpty()){
			return -1;
		}
		return s1.peek();
		
	}
	
	
	
	public static void main(String args[])
	{
		queueusing2stacks q=new queueusing2stacks();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		
		while(!s1.isEmpty())
		{
			System.out.print(s1.peek()+"->");
			s1.pop();
		}
}
}