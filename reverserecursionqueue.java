public  class reverserecursionqueue
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
		
		
		public static void reverese(reverserecursionqueue e)
		{
			if(e.isEmpty())
			
			{
								

				return;
			}
			int t=e.peek();
			e.dequeue();
			reverese(e);
			e.enqueue(t);
							

		}
		
		public static void main(String args[])
		{
			 reverserecursionqueue w=new  reverserecursionqueue();
			 w.enqueue(1);
			 w.enqueue(2);
			 w.enqueue(3);
			 w.enqueue(4);
			 w.enqueue(5);
			 w.reverese(w);
			 while(!w.isEmpty())
			 {
				 System.out.println(w.peek());
				 w.dequeue();
			 }
			 
			 
			 
		}
	}

		