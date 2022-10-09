public class queuelinkedlist{
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
	public static void enqueue(int data)
	{
		Node newnode=new Node(data);
		if(front==null && rear==null)
		{
			front=rear=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
	}
	public static void display()
	{
		
		if(front==null && rear==null)
		{
			System.out.print("Null queue crated");
		}
		else
		{
			System.out.print("front"+"->");
			Node t=front;
			while(t !=null)
			{
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print("rear");
		}
	}
	public static void dequeue()
	{
		if(front==null && rear==null)
		{
			System.out.print("null Queue created");
		}
		else
		{
			Node t=front;
			front=front.next;
			System.out.println(t.data+""+"is deleted");
		}
	}
	public static void peek()
	{
		
		if(front==null && rear==null)
		{
			System.out.print("null Queue created");
		}
		else
		{
			System.out.println(front.data);
		}
	}
	
	public static void main(String args[])
	{
	  queuelinkedlist q=new queuelinkedlist();
      q.enqueue(1);
	  q.enqueue(7);
	  q.enqueue(2);
	  q.display();
	  q.dequeue();
	  q.display();
	  q.peek();
	}
}