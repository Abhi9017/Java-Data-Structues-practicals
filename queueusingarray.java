public class queueusingarray
{
	static int size=5;
	static int arr[]=new int[size];
	
	static int rear=-1;
	
	
	public static Boolean isEmpty()
	{
		return rear==-1;
	}
	public static void enque(int data)
	{
		if(rear==size-1)
		{
			System.out.print("full queuqe");
			return;
		}
		rear++;
	    arr[rear]=data;
	
		
	}
	public static int deque()
	{
		if(isEmpty())
		{
			System.out.print("no elements to delete");
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
        public static  int display()
		{
			if(isEmpty())
			{
				return -1;
			}
			return arr[0];
		}	
	
	
	public static void main(String args[])
	{
		queueusingarray q=new queueusingarray();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.deque();
		q.display();
		while(!q.isEmpty())
		{
			System.out.print(q.display());
			q.deque();
		}
		
	}
}
