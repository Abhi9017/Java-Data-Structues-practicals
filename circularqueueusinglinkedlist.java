import java.util.*;
public class circularqueueusinglinkedlist
{
	static Node front;
	static Node rear;
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	
	public static void enque(int data)
	{
		Node n=new Node(data);
		if(front==null && rear==null)
		{
			front=rear=n;
			
			
		}
		rear.next=n;
		rear=n;
		rear.next=front;
	}
	public static int deque()
	{
	int f;
		if(front==null)
		{
			System.out.print("Null list retaed");
			return -1;
		}
		else if(front==rear)
		{
           front=rear=null;		
            return -1;		   
		}
		else
		{
			 f=front.data;
			front=front.next;
			rear.next=front;
		}
		return f;
	}
	
	public static int peek()
	{
		
		if(front==null)
		{
			System.out.print("Null list retaed");
			return -1;
		}
		
			 
			
			
		
		return front.data;
	}
	
	public static void main(String args[])
	{
		circularqueueusinglinkedlist c=new circularqueueusinglinkedlist();
		c.enque(1);
		c.enque(2);
		c.enque(3);
		c.enque(4);
		
		c.enque(5);
		c.enque(6);
		
		c.enque(7);
	   Node t=front;
	   while(t.next!=front)
	   {
		   
		   
			   System.out.println(c.peek());
			  
			  t=t.next;
			    c.deque();
			   
	   }
	   System.out.print(rear.data);
	
	}
}