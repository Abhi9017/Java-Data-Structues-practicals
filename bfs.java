import java.util.*;
public class bfs
{
	public static Node root;
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
	public static void print(Node root)
	{
		if(root==null)
		{
			return ;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}
	public static void bff(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty())
		{
			Node r=q.poll();
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
				System.out.print(r.data+" ");
			
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
	public static int countnodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=countnodes(root.left);
		int rightnodes=countnodes(root.right);
		return leftnodes+rightnodes+1;
	}
	public static int sumcountnodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodessum=sumcountnodes(root.left);
		int rightnodessum=sumcountnodes(root.right);
		return leftnodessum+rightnodessum+root.data;
	}
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		int myheight=Math.max(leftheight,rightheight) +1;
		return myheight;
	}
	public static int diameter(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int  dia1=diameter(root.left);
		int  dia2=diameter(root.right);
		int dia3=height(root.left) + height(root.right) + 1;
		
		return Math.max(dia3,Math.max(dia2,dia1));
	}
	public static int sumatklevel(Node root,int k)
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
	public static void main(String args[])
	{
		bfs b=new bfs();
           int arr[]={6,5,7,8,9,4,2,77,8};
		   for(int i=0;i<arr.length;i++)
		   {
			  root= insert(root,arr[i]);
		   }
		   print(root);
		   System.out.println("***");
		   bff(root);
		    System.out.println("***");
		  System.out.println( countnodes(root));
		   System.out.println("***");
		  System.out.println( sumcountnodes(root));
		   System.out.println("***");
		  System.out.println( height(root));
		  System.out.println("***");
		  System.out.println( diameter(root));
		  System.out.println("***");
		  System.out.println( sumatklevel(root,1)+"summa at k level");
	}
}