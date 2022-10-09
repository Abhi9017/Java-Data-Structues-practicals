import java.util.*;
public class treeisidentical
{
	public static Node root,rot;
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
	public static boolean checking(Node left,Node right)
	{
		if(left==null&&right==null)
		{
			return true;
		}
		if(left==null || right==null)
		{
			return false;
		}
		return checking(left.left,right.right) && checking(left.right,right.left);
		
	}
	public static boolean foldable(Node root)
	{
		if(root==null)
		{
			return true;
		}
		return checking(root.left,root.right);
	}
	public static void print(Node root)
	{
		if(root==null)
		{
			
			return;
		}
		
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}
	public static boolean isidentical(Node root1,Node root2)
	{
		if(root1==null && root2==null)
		{
			return true;
		}
		if(root1==null || root2==null)
		{
			return false;
		}
		if(root1.data!=root2.data)
		
		{
			return false;
		}
		if(root1.data==root2.data)
		
		{
			return true;
		}
		
		return (isidentical(root1.left,root2.left)&&isidentical(root2.left,root2.right));
	}
	public static void main(String args[])
	{
		 treeisidentical f=new  treeisidentical();
		int arr[]={2,1,3};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
		int brr[]={2,1,3};
		for(int i=0;i<brr.length;i++)
		{
			rot=insert(rot,arr[i]);
		}
		print(root);
		System.out.println("***********************");
		print(rot);
		if(foldable(root))
		{
			System.out.println("folbagle");
		}
		else
		{
			System.out.println("not ");
		}
		
		if(isidentical(root,rot))
		{
			System.out.println("yes,identical");
		}
		else
		{
			System.out.println("not identivcal");
		}
		
	}
}
