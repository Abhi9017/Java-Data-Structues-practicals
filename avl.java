public class avl
{
	public static Node root;
	public static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			
		}
	} 
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int left=height(root.left);
	    int right=height(root.right);
		int myheight=Math.max(left,right) +1;
		
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
	public static Node rightrotate(Node c)
	{
		/*accesiing*/
		Node b=c.left;
		Node t3=b.right;
		
		/*rotation*/
		b.right=c;
		c.left=t3;
		/* accesing height*/
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
	public static Node insert(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else if(data<root.data)
		{
		     root.left=insert(root.left, data);
		}
		else if(data>root.data)
		{
		     root.right=insert(root.right, data);
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
		}
		else
		{
			str+=root.left.data;
		}
		str+= "=>" + root.data +"<=";
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
	public static void main(String args[])
	{
		avl a=new avl();
		int arr[]={20,25,30,10,5,15,27,19,16};
		
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
		display(root);
		System.out.println(height(root)+"Height");
		System.out.println("*******************");
				

		
	}
}