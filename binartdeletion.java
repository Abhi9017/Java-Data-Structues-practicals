import java.util.*;
public class binartdeletion
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
	public static Node insertion(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else if(root.data>data)
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
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static Boolean search(Node root,int searchkey)
	{
		if(root==null)
		{
			return false;
		}
		else if(root.data==searchkey)
		{
			return true;
		}
		else if(searchkey<root.data)
		{
			return search(root.left,searchkey);
		}
		else
		{
			return search(root.right,searchkey);
		}
	}
	public static void main(String args[])
	{
		binartdeletion b=new binartdeletion();
		int arr[]={52,9,4,5,22,78,61,1000};
		for(int i=0;i<arr.length;i++)
		{
			root=insertion(root,arr[i]);
		}
		inorder(root);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search key");
		int sk=sc.nextInt();
		if(search(root,sk))
		{
			System.out.println(sk+" "+"is found");
		}
		else
		{
			System.out.print("Not found");
		}
	}
}