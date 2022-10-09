import java.util.*;
public class binarydeldeion
{
	static Node root;
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
		else
		{
			root.right=insert(root.right,data);
		}
		return root;
	}
	public static void inorser(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorser(root.left);
		System.out.println(root.data);
		inorser(root.right);
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
			if(root.right==null && root.left==null)
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
			Node is=inorersucessor(root);
			root.data=is.data;
			root.right=deletion(root.right,is.data);
		}
		return root;
	}
	
	public static Node inorersucessor(Node root)
	{
		root=root.right;
		while(root.left!=null)
		{
			root=root.left;
		}
		return root;
	}
	
	
	
	public static void main(String args[])
	{
		binarydeldeion b=new binarydeldeion();
		int arr[]={66,55,4,8,10,559,10000};
		for(int i=0;i<arr.length;i++)
		{
		 root=b.insert(root,arr[i]);
		}
		b.inorser(root);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search element");
		int sk=sc.nextInt();
		if(b.search(root,sk))
		{
			System.out.println(sk+" " +"is found");
		}
		else
		{
			System.out.println(sk+" "+"is not found");
		}
		System.out.println("enter deldetion element");
		int s=sc.nextInt();
	    Node r=b.deletion(root,s);
		b.inorser(r);
	}
}