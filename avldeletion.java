public class avldeletion
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
	public static Node root;
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int hl=height(root.left);
		int h2=height(root.right);
		int muh=Math.max(hl,h2) +1;
		return muh;
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
	public static Node leftrotate(Node a)
	{
		if(root==null)
		{
			return null;
		}
		Node b=a.right;
		Node c=b.left;
		b.left=a;
		a.right=c;
		int h=height(b);
		return b;
	}
	public static Node rightrotate(Node a)
	{
		if(root==null)
		{
			return null;
		}
		Node b=a.left;
		Node c=b.right;
		b.right=a;
		a.left=c;
		int h=height(b);
		return b;
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
	public static Node deletion(Node root,int data)
	{
		if(root==null)
		{
			return null;
		}
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
			Node is=inodersuccessor(root);
			root.data=is.data;
			root.right=deletion(root.right,is.data);
		}
		
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
		if(bf<-1  && br<=0)
		{
			return leftrotate(root);
		}
		if(bf<-1 && br>0)
		{
			root.right=rightrotate(root.right);
			return leftrotate(root);
		}
		return root;
	}
	public static Node inodersuccessor(Node root)
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
		avldeletion b=new avldeletion();
		
		int arr[]={20,25,30,10,5,15,27,19,16};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
          display(root);
		  System.out.println(height(root)+"height");
		  		  System.out.println(balancingfactor(root)+"balacing root factor");
         deletion(root,30);
		 System.out.println("deletion ");
		 display(root);
	}
}