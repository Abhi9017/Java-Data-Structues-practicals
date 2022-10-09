import java.util.*;
public class binarinsertionpract
{ 
	static Scanner sc=new Scanner(System.in);
	public static class Node
	{
		int data;
		Node left,right;
		Node(int  data)
		
		{
			this.data=data;
			left=right=null;
		}
	}
	public static Node insertion()
	{
		Node root;
		System.out.println("Enter data:");
		int data=sc.nextInt();
		if(data==-1)
		{
			return null;
		}
			root=new Node(data);
			
		
		System.out.println("enter left node of the"+" " +data);
	      root.left= insertion();
		System.out.println("enter right node of the"+" "+data);
		root.right=insertion();
		
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
	public static void main(String args[])
	{
		binarinsertionpract  b=new binarinsertionpract();
		System.out.println("enter -1 to to no node at that place");
		Node r=b.insertion();
		inorder(r);
		
	}
}