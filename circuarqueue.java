import java.util.*;
public class circuarqueue
{
	static int size=5;
	static int arr[]=new int[size];
	static int rear=-1;
    static int front=-1;	
	public static Boolean isEmpty()
	{
		return (rear==-1 && front==-1);
	}
	public static Boolean isFull()
	{
		return (rear+1)%size==front;
	}
	public static void enque(int data)
	{
		if(isFull())
		{
			System.out.print("Null list cretaed");
		}
		if(front==-1)
		{
			front=0;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
	}
	public static int dequeue()
	{
		if(isEmpty())
		{
			System.out.print("null list ");
			return -1;
		}
		if(front==rear)
		{
			front=rear=-1;
		}else{
		int a=arr[front];
		front=(front+1)%size;
		
		}
		return front;
	}
	public static int peek()
	{
		if(isEmpty())
		{
			System.out.print("null list ");
			return -1;
		}
		
		int a=arr[front];
		
		return a;
		
	}
	
	public static void main(String args[])
	{
		circuarqueue c=new circuarqueue();
		c.enque(1);
		c.enque(2);
		c.enque(3);
		c.enque(4);
		c.enque(5);
		c.dequeue();
		c.enque(1);
		
		while(!c.isEmpty())
		{
			System.out.println(c.peek());
			c.dequeue();
		}
		
	}
}