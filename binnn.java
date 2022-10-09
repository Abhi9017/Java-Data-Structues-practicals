import java.util.*;
public class binnn
{ 
static Node root=null;
	
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
	public static Node insert(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else if(data<root.data)
		{
			root.right=insert(root.right,data);
		} 
		return root;
	}
	public static void inordder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		inordder(root.left);
		System.out.println(root.data);
		inordder(root.right);
	}
	public static void bfs(Node root)
	{
		
		Queue<Node>  q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node r=q.poll();
			System.out.println(r.data+" ");
			if(r.left!=null)
			{
				q.add(r.left);
			}
			if(r.right!=null)
			{
				q.add(r.right);
			}
		}
	}
	public static void main(String args[])
	{
		
		binnn b=new binnn();
		int arr[]={1,22,3,4,5,6,7,8};
	
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
		inordder(root);
		System.out.println("****");
		bfs(root);
	}
}