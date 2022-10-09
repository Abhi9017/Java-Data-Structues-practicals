import java.util.*;
public class binarypract
{
	static Node root;
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
	public static Node insertion(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else if(data < root.data)
		{
			root.left=insertion(root.left,data);
		}
		else
		{
			root.right=insertion(root.right,data);
		}
		return root;
	}
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		inorder(root.left);
		
		inorder(root.right);
	}
	public static void main(String args[])
	{
		binarypract b=new binarypract();
		int arr[]={30,50,55,45,10,5,15,12};
		for(int i=0;i<arr.length;i++)
		{
			root=insertion(root,arr[i]);
		}
		inorder(root);
		
	}
}