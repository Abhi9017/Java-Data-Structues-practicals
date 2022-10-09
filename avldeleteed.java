public class avldeleteed
{
	public static class Node
	{
		int data;
		Node right,left;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int h1=height(root.left);
		int h2=height(root.right);
		int my=Math.max(h1,h2) +1;
		return my;
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
	public static Node leftrotate(Node c)
	{
		Node b=c.right;
		Node a=b.left;
		b.left=c;
		c.right=a;
		return b;
	}
	public static Node rightrotate(Node c)
	{
		Node b=c.left;
		Node a=b.right;
		b.right=c;
		c.left=a;
		return b;
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
	public static Node delete(Node root,int key)
	{
		if(root==null)
		{
			return null;
		}
		else if(key<root.data)
		{
			root.left=delete(root.left,key);
		}
		else if(key>root.data)
		{
			root.right=delete(root.right,key);
		}
		else
		{
			if(root.left==null && root.right==null)
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
			Node is =inordersuccesor(root);
			root.data=is.data;
			root.right=delete(root.right,is.data);
			int bf=balancingfactor(root);
			int bl=balancingfactor(root.left);
			int br=balancingfactor(root.right);
			if(bf>1 && bl>=0)
			{
				return rightrotate(root);
			}
			if(bf>1 && bl<0)
			{
				root.left=leftrotate(root.left);
				return rightrotate(root);
			}
			if(bf<-1 && br>0)
			{
				root.right=rightrotate(root.right);
				return leftrotate(root);
			}
			if(bf<-1 && br<=0)
			{
				return leftrotate(root);
			}
		}
		return root;
	}
	public static  Node inordersuccesor(Node root)
	{
		root=root.right;
		while(root.left!=null)
		{
			root=root.left;
		}
		return root;
	}
	public static void display(Node root)
	{
		if(root==null)
		{
			return ;
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
	public static void main(String args[])
	{
		avldeleteed al=new avldeleteed();
		int arr[]={20,25,30,10,5,15,27,19,16};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
          display(root);
		  System.out.println("*******");
		    delete(root,10);
			display(root);
	}
}