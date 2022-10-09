import java.util.*;
public class priorityqueuea
{
	
	public static void main(String  args[])
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		while(!pq.isEmpty())
		{
		System.out.println(pq.peek());
		pq.poll();
		}
		
	}
}