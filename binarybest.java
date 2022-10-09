public class binarybest
{
	static Node root=null;
	public static class  Node
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
			return root;
		}
		else if(data < root.data)
		{
			root.left=insert(root.left,data);
		}
		else
		{
			root.right=insert(root.right,data);
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
	public static void main(String args[])
	{
		binarybest k=new binarybest();
		int arr[]={5,1,3,4,2,7};
		for(int i=0;i<arr.length;i++)
		{
			root=insert(root,arr[i]);
		}
		inorder(root);
		
	}
}