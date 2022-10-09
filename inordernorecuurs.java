import java.util.*;
public class inordernorecuurs
{
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
	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		postorder(root.left);
		System.out.print(root.data);
		postorder(root.right);
		
		
	}
	public static void main(String  args[])
	{
	inordernorecuurs p=new  inordernorecuurs();
		Node n=new Node(1);
		n.left=new Node(2);
			n.left.left=new Node(4);
				n.left.right=new Node(5);
		n.right=new Node(3);
		inorder(n);
		
	}
}