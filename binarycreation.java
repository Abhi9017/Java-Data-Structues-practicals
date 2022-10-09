import java.util.*;
public class binarycreation
{
	static Scanner sc=new Scanner(System.in);
	public static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	public static Node createtree()
	{
		Node root;
		System.out.println("enter data:");
		int data=sc.nextInt();
		if(data==-1)
		{
			return null;
		}
		root=new Node(data);
		System.out.println("enter left Node for"+
		""+data);
		root.left=createtree();
		System.out.println("enter right Node for"+
		""+data);
		root.right=createtree();
		
		return root;
	}
	public static void postorder(Node root)
	{
		if(root==null)
		{
			return ;
		
		}
		
		postorder(root.left);
		System.out.println(root.data);
		postorder(root.right);
	}
	public static void main(String args[])
	{
		binarycreation b=new binarycreation();
		postorder(b.createtree());
	}
}