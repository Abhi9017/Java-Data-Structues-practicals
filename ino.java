public class ino{
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
	
	public static void inorder(Node rooter)
	{
		if(rooter==null)
		{
			return;
		}
		inorder(rooter.left);
		System.out.print(rooter.data+" ");
		inorder(rooter.right);
		
	}
	public static void preorder(Node rooter)
	{
		if(rooter==null)
		{
			return;
		}
		System.out.print(rooter.data+" ");
		preorder(rooter.left);
		preorder(rooter.right);
		
		
		
	}
	public static  void  postorder(Node rooter)
	{
		if(rooter==null)
		{
			return;
		}
		postorder(rooter.left);
		postorder(rooter.right);
		System.out.print(rooter.data+" ");
	}
	

    
	
	public static void main(String args[])
	{
		ino i=new ino();
		
		i.root=new Node(1);
		i.root.left=new Node(2);
		i.root.right=new Node(3);
		i.root.left.left=new Node(4);
		i.root.left.right=new Node(5);
		i.inorder(root);
		System.out.println("");
		i.preorder(root);
		System.out.println("");
        i.postorder(root);
		
		
		
	}
}