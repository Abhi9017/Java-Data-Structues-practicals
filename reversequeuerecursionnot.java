import java.util.*;
public class reversequeuerecursionnot
{
	static queue q=new queue();
	public static class queue
	{
		static int rear=-1;
		static int size=5;
		static int arr[]=new int[size];
         public static Boolean isEmpty()
		{
			return rear==-1;
		}
		public static Boolean isFull()
		{
			return rear==size-1;
		}
		public static void enqueue(int data)
		{
			if(isFull())

			{
			   System.out.print("full queue");	
			}
			rear++;
			arr[rear]=data;
		}
		public static int dequeue()
		{
			if(isEmpty())
			{
				System.out.print("empty queue unable to dequeue");
				return -1;
			}
			int front=arr[0];
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
		}
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.print("empty queue unable to dequeue");
				return -1;
			}
			int front=arr[0];
			
			return front;
		}
		

		
	}
	public static void display()
	{
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.dequeue();
		}
	}
	public static void reverse(queue t)
	{
		Stack<Integer> s=new Stack<>();
		while(!t.isEmpty())
		{
			
		s.push(t.peek());
		t.dequeue();
		
		}
		while(!s.isEmpty())
		{
			
			t.enqueue(s.peek());
			s.pop();
		}
		
		
	}
	
	
	
	public static void main(String args[])
	{
		reversequeuerecursionnot  rr=new reversequeuerecursionnot();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
	
		rr.reverse(q);
		rr.display();
		
		
		
	}
}