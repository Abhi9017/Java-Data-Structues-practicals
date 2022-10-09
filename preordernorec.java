import java.util.*;
public class preordernorec
{
	public static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Stack<Node> s=new Stack<>();
		s.push(root);
		while(!s.isEmpty())
		{
			  Node t=s.pop();
			System.out.println(t.data);
			if(t.right !=null)
			{
				s.push(t.right);
			}
			if(t.left !=null)
			{
				s.push(t.left);
			}
		}
	}
	public static void main(String args[])
	{
		preordernorec p=new preordernorec();
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		preorder(root);
	}
}