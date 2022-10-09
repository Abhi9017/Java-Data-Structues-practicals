public class avll
{
	public static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
		}
	}
	public static Node root;
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
		int bf=balancingfactor(root);
		if(bf>1 && data<root.left.data)
		{
			return rightrotate(root);
		}
		if(bf<-1 && data>root.right.data)
		{
			return leftrotate(root);
		}
		if(bf>1 && data>root.left.data)
		{
			 root.left=leftrotate(root.left);
			return rightrotate(root);
		}
		if(bf<-1 && data<root.right.data)
		{
			 root.right=rightrotate(root.right);
			return leftrotate(root);
		}
		return root;
	}
	public static boolean foladable(Node root)
	{
		if(root==null)
		{
			return true;
		}
		return checking(root.left,root.right);
	}
	public static boolean checking(Node left,Node right)
	{
		if(left==null && right==null)
		{
			return true;
		}
		if(left==null || right==null)
		{
			return false;
		}
		return checking(left.left,right.right)&&checking(left.right,right.left);
	}
	public static void display(Node root)
	{
		if(root==null)
		{
			return;
		}
		String str="";
		if(root.left==null)
		{
			str+=".";
		}else
		{
			str+=root.left.data;
		}
		str+="=>"+root.data+"<=";
		if(root.right==null)
		{
			str+=".";
		}
		else
		{
			str+=root.right.data;
		}
		System.out.println(str);
		display(root.left);
		display(root.right);
	
	}
	public static Node rightrotate(Node c)
	{
		/*accesiing*/
		Node b=c.left;
		Node t3=b.right;
		
	
		b.right=c;
		c.left=t3;
		
		height(c);
		height(b);
		
		return b;
	}
	public static Node leftrotate(Node c)
	{
	      Node b=c.right;
		  Node t3=b.left;
		  b.left=c;
		  c.right=t3;
		  height(c);
		  height(b);
		  return b;
}
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int h1=height(root.left);
		int h2=height(root.right);
		int myheight=Math.max(h1,h2)+1;
		return myheight;
	}
	public static int balancingfactor(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int h1=height(root.left);
		int h2=height(root.right);
		return (h1-h2);
	}
	public static void main(String args[])
	{
		avll a=new avll();
		int arr[]={20,25,30,10,5,15,27,19,16};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
          display(root);
		System.out.println(height(root));
		
		System.out.println(balancingfactor(root));
		if(foladable(root))
		{
			System.out.println("foldable");
		}
		else
		{
			System.out.println("not");
		}
	}
}