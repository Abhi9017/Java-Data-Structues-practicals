public class insertionanddelertioninpriorityqueue
{
	
	static Node head;
	public static class Node
	{
		int data;
		int pritotity;
		Node next;
		Node(int data,int pritotity)
		{
			this.data=data;
			this.pritotity=pritotity;
			next=null;
		}
	}
	
	public static void insert(int data,int priorty)
	{
		Node n=new Node(data,priorty);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=n;
		}
	}
	public static void sorting()
	{
	   Node t1,t2;
	   for(t1=head;t1.next!=null;t1=t1.next)
	   {
		   for(t2=head;t2.next!=null;t2=t2.next){
			   if(t2.pritotity>t2.next.pritotity)
			   {
				   int tdata=t2.data;
				   int tpri=t2.pritotity;
				   t2.data=t2.next.data;
				   t2.pritotity=t2.next.pritotity;
				   t2.next.data=tdata;
				   t2.next.pritotity=tpri;
			   }
		   }
	   }
	}
	public static void print()
	{
		Node t=head;
		while(t!=null)
		{
			System.out.print(t.data+","+t.pritotity+"--->");
			t=t.next;
		}
		System.out.print("NULL");
	}
   
   
   public static void add(int d,int p)
   {
	   Node s;
	   Node n=new Node(d,p);
	   Node t=head;
	   while(t.pritotity>n.pritotity)
	   {
		   t=t.next;
	   }
	   n.next=t.next;
	   t.next=n;
   }

  public static void poll()
  {
	  Node t=head;
	 Node secondlast=t;
	 Node lastnode=t.next;
	  while(lastnode.next!=null)
	  {
		  secondlast=secondlast.next;
		  lastnode=lastnode.next;
	  }
	  secondlast.next=null;
  }

public static void main(String args[])
 {
  insertionanddelertioninpriorityqueue q=new insertionanddelertioninpriorityqueue();
  
		q.insert(1,100);
		q.insert(2,55);
		q.insert(3,69);
		q.insert(4,1);
		q.insert(5,100000);
		System.out.println("Before sorting");
		q.print();
		q.sorting();
		System.out.println();
		System.out.println("After sorting");
		System.out.println();
		q.print();
		q.add(2,33);
		q.print();
		q.poll();
		q.print();
 }
}