import java.util.Scanner;
public class binary
{
	static Scanner sc=new Scanner(System.in);
	public static class Node
	{
		int  data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	public static Node create()
	{
		Node root;
		System.out.println("enter data :");
		int data=sc.nextInt();
		
		if(data==-1)
		{
			return null;
	 	}
	    root=new Node(data);
		System.out.println("enter left node for :"+" "+data);
		root.left=create();
		System.out.println("enter right node for :"+" "+data);
		root.right=create();
		
		
		return root;
	}
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return ;
		}
			System.out.print(root.data);
		preorder(root.left);
		preorder(root.right);
	
	}
	public static void main(String args[])
	{
		binary b=new binary();
		
		Node n=b.create();
		b.preorder(n);
		
	}
}