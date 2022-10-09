import java.util.*;
public class treeinorder
{
	public static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	public static void order(Node root)
	{
		if(root==null)
		{
			return;
		}
		Stack<Node> s=new Stack<>();
		while(root!=null)
		{
			s.push(root);
			root=root.left;
		}
		while(!s.isEmpty())
		{
			Node t=s.pop();
			System.out.println(t.data);
			if(t.right!=null)
			{
				Node temp=t.right;
				while(temp !=null)
				{
					s.push(temp);
					temp=temp.left;
				}
			}
		}
	}
	public static void main(String args[])
	{
		treeinorder t=new treeinorder();
		Node root=new Node(1);
		root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);	
        order(root);		
	}
}

