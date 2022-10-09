import java.util.*;
public class javausingsinglestackown{
	 static Stack<Object> s=new Stack<>();
	 public static void enqueue(Stack s,Object data)
	 {
		 if(s.isEmpty())
		 {
			 s.push(data);
			 return;
		 }
		 
		  Object a=s.peek();
		 enqueue(s,data);
		 s.push(a);
		  
		 
		 
	 }
	 public static void dequeue()
	 {
		 System.out.print(s.peek()+"deleted");
		 s.pop();
	 }
	public static void print()
	{
		while(!s.isEmpty())
		{
			System.out.print(s.peek());
			s.pop();
		}
	}
	
	public static void main(String  args[])
	{
		javausingsinglestackown q=new javausingsinglestackown();
		q.enqueue(s,1);
		q.enqueue(s,2);
		q.enqueue(s,3);
		q.enqueue(s,4);
		q.enqueue(s,5);
		q.print();
		q.dequeue();
		q.print();
		q.enqueue(s,100);
		q.print();
		
	}
}
