import java.util.*;
public class sumatknodesinbinary
{
	public static Node root;
    public static 	 class Node
	{
		int data;
		Node right,left;
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
		else if(data < root.data)
		{
			root.left=insert(root.left,data);
		} else
		{
			root.right=insert(root.right,data);
		}
		return root;
	}
	public static void bsf(Node root)
	{
	if(root==null)
	{
		return ;
	}
	Queue<Node> q=new LinkedList<Node>();
	q.add(root);
	q.add(null);
	while(!q.isEmpty())
	{
	Node r=	q.poll();
	
		if(r==null)
		{
			System.out.println();
			if(q.isEmpty())
			{
				break;
			}
			else
			{
				q.add(null);
			}
		}
		else
		{
			System.out.print(r.data+"  ");
			if(r.left!=null)
			{
				q.add(r.left);
			}
			if(r.right!=null)
			{
				q.add(r.right);
			}
		}
		
	}
	}
	public static int sumatknodes(Node root,int k)
	{
		int level=0;
		 int sum=0;
		if(root==null)
		{
			return 0;
		}
		Queue<Node> q=new LinkedList<Node>();
         q.add(root);
		 q.add(null);
		 while(!q.isEmpty())
		 {
			 Node r=q.poll();
			if(r!=null)
			{
				if(level==k)
				{
					sum=sum+r.data;
				}
				
					if(r.left!=null)
					{
						q.add(r.left);
					}
					if(r.right!=null)
					{
						q.add(r.right);
					}
				
			}
			else if(!q.isEmpty())
			{
				q.add(null);
				level++;
			} 
		 }

  return sum;

	}
	public static  int count(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int l=count(root.left);
		int r=count(root.right);
		return l+r+1;
	}
	public static  int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int l=height(root.left);
		int r=height(root.right);
		int h=Math.max(l,r)+1;
		return h;
	}
	public static int diameter(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int l=diameter(root.left);
		int r=diameter(root.right);
		int rl=height(root.left)+height(root.right)+1;
		return Math.max(rl,Math.max(l,r));
	}
	
	
	
	public static void main(String args[])
	{
		sumatknodesinbinary s=new sumatknodesinbinary();
		int arr[]={5,6,3,4,2,11,55,99};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
		bsf(root);
		System.out.println("*****");
		System.out.println(sumatknodes(root,2));
		System.out.println("*****");
		System.out.println(count(root));
		System.out.println("*****");
		System.out.println(height(root));
		System.out.println("*****");
		System.out.println(diameter(root));
				System.out.println("*****");
		
	}
}