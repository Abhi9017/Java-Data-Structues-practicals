import java.util.*;
public class binaryinsert
{ static Node root=null;
	public static class Node{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	public static void insert(int data)
	{
		root=insertnode(root,data);
	}
	public static Node insertnode(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else if(data<root.data)
		{
			root.left=insertnode(root.left,data);
		}
		else
		{
			root.right=insertnode(root.right,data);
		}
	return root;
		
	}
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		preorder(root.left);
		System.out.println(root.data);
		preorder(root.right);
		
	}
	public static void main(String args[])
	{
		binaryinsert b=new binaryinsert();
		b.insert(1);
		b.insert(2);
		b.insert(22);
		b.insert(99);
		b.insert(56);
		b.insert(6);
		b.insert(4);
		b.preorder(root);
	}
}