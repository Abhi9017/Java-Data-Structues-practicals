import java.util.*;
public class binaryinsertion
{ 

  static Scanner sc=new Scanner(System.in);
  
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
	public static Node  insert()
	{
		Node root;
		System.out.println("Enter data:"+" ");
		int data=sc.nextInt();
		if(data==-1)
		{
			return null;
		}
		root=new Node(data);
		System.out.println("enter left node of "+" "+data);
		root.left=insert();
		System.out.println("enter right node of "+" "+data);
		root.right=insert();
		return root;
	}
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	public static Node search(Node root,int key)
	{
		if(root==null)
		{
			return null;
		}
		else if(root.data==key)
		{
			System.out.println("root found ");
			return root;
		}
		else if(key<root.data)
		{
			 return search(root.left,key);
			
		}else
		{
			return search(root.right,key);
		}
		
	}
	public static void main(String args[])
	{
		binaryinsertion b=new binaryinsertion();
		Node t=b.insert();
		  b.search(t,4);
		  b.preorder(t);
		
       
		
	}
}