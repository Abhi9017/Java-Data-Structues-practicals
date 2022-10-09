import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class reversefirstNelementsinqueue
{
	static Stack<Integer>s=new Stack<>();
	static Queue<Integer>q=new LinkedList<Integer>();
	
	public static void reverseing(int size,int k)
	
	{
		if(q.isEmpty())
		{
			System.out.print("null list");
			return;
		}
		if(k>size)
		{
			System.out.print("k greater than size");
			return;
		}
		int i=0;
		while(i<k)
		{
			s.push(q.peek());
			q.remove();
			i++;
		}
       while(!s.isEmpty())
	   {
		   q.add(s.peek());
		   s.pop();
	   }
       int j=0;  
	   while(j<size-k)
	   {
		   q.add(q.peek());
		   q.remove();
		   j++;
	   }
		
		
		
		
		
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size of queue");
		
		int size=sc.nextInt();
	   System.out.println("enter number of elemenetd to reverse");
		int k=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the element "+""+i);
			int element=sc.nextInt();
			q.add(element);
		}
		reverseing(size,k);
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}

	}
}