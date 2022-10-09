import java.util.*;
public class inordernorecurrsion
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
	   Stack<Node> s=new Stack<>();
	   
	   while(root!=null)
	   {
		   s.push(root);
		   root=root.left;
	   }
	   while(!s.isEmpty())
	   {
		   Node t=s.pop();
		   System.out.print(t.data);
		   if(t.right !=null)
		   {
			   Node temp=t.right;
			   while(temp !=null)
			   {
				   s.push(temp);
				   temp=temp.left;
			   }
		   }
	   }
   }
	public static void main(String args[])
	{
		inordernorecurrsion i=new inordernorecurrsion();
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		i.inorder(root);
	}
}