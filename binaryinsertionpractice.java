public class binaryinsertionpractice
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
			System.out.println("inserte"+data);
			root=new Node(data);
			return root;
		}
		else if(data<root.data)
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
		System.out.print(root.data);
		inorder(root.right);
	}
	
	public static void main(String args[])
	{
		binaryinsertionpractice b=new binaryinsertionpractice();
		int arr[]={5,1,3,4,2,7};
		for(int i=0;i<arr.length;i++)
		{
			root=insertion(root,arr[i]);
		}
		inorder(root);
		
	}
}