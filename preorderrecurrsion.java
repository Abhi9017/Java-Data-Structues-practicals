import java.util.*;
public class preorderrecurrsion
{
    public static class Node
    {
		int data;
		Node right;
		Node left;
		Node(int data)
		{
			this.data=data;
			right=left=null;
		}
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
		preorderrecurrsion p=new preorderrecurrsion();
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		preorder(n);
	}
}