import java.util.*;
public class j
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
	public static Node root;
	public static void display(Node root)
	{
		if(root==null)
		{
			return;
		}
		String str="";
		if(root.left==null)
		{
			str+=".";
		}
		else
		{
			str+=root.left.data;
		}
		str+="=>"+root.data+"<=";
		if(root.right==null)
		{
			str+=".";
		}
		else
		{
			str+=root.right.data;
		}
		System.out.println(str);
		display(root.left);
		display(root.right);
	}
	public static Node insert(Node root,int data)
	{
		if(root==null){
			root=new Node(data);
		}
		else if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else
		{
			root.right=insert(root.right,data);
		}
		
		return root;
	}
	public static void sprial(Node root)
	{
		if(root==null)
		{
			return;
		}
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
	      s1.push(root);
		  while(!s1.isEmpty() || !s2.isEmpty())
		  {
			  while(!s1.isEmpty())
			  {
				  Node x=s1.pop();
				  System.out.println(x.data);
				  if(x.left!=null)
				  {
					  s2.push(x.left);
				  }
				  if(x.right!=null)
				  {
					  s2.push(x.right);
				  }
			  }
			  while(!s2.isEmpty())
			  {
				  Node y=s2.pop();
				  System.out.println(y.data);
				  if(y.right!=null)
				  {
					  s1.push(y.right);
				  }
				  if(y.left!=null)
				  {
					  s1.push(y.left);
				  }
			  }
		  }
	}
	
	public static void main(String args[])
	{
		j b=new j();
		int arr[]={2,7,5,9,6,12,11,4,0,1};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
		display(root);
		sprial(root);
	}
}