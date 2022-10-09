import java.util.*;
public class binarydel2
{
	static Node root;
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
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static Node deletion(Node root,int data)
	{
		if(data<root.data)
		{
			root.left=deletion(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=deletion(root.right,data);
		}
		else
		{
			if(root.left==null && root.right==null)
			{
				return null;
			}
			else if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
		
				
				Node is=ioorderseuuco(root);
				root.data=is.data;
				root.right=deletion(root.right,is.data);
		}
			return root;
		
	}
	public static Node ioorderseuuco(Node root){
		root=root.right;
		while(root.left!=null)
		{
			root=root.left;
		}
		return root;
	}
	public sttic void
	public static void main(String args[])
	{
		binarydel2  b=new binarydel2();
		int arr[]={4,3,5,7,11,4,6,0,8,99999};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
		b.inorder(root);
		b.deletion(root,11);
		b.inorder(root);
	}
}
