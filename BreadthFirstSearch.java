import java.util.*;
//Representing a Node of a Binary tree
class Node{
    int value;
    Node left,right;
    //constructor
    Node(int value)
    {
        this.value=value;
        left=right=null;
    } 
}
class BreadthFirstSearch
{
    Node root;  //Root of the Binary tree
    BreadthFirstSearch()
   {
       root=null;
   }
    /*level order traversal of a binary tree */  
    public void levelOrder(Node ptr)    
    {
        if(ptr==null)
        return ;
        //Creating a Queue Object
        Queue queue=new LinkedList();
        queue.add(ptr);  //adding an element to queue
        while(!queue.isEmpty())
        {
            Node node=queue.poll();  //removing an element from queue
            System.out.print(node.value+" ");
            if(node.left!=null)
            queue.add(node.left);  //adding an element to queue
            if(node.right!=null)
            queue.add(node.right); //adding an element to queue
        }
    }
   public static void main(String[] args)
    {
        BreadthFirstSearch bst=new BreadthFirstSearch();
        //creating the nodes of binarytree
        bst.root=new Node(50);
        bst.root.left=new Node(30);
        bst.root.right=new Node(70);
        bst.root.left.left=new Node(10);
        bst.root.left.right=new Node(40);
        bst.root.right.left=new Node(60);
        bst.root.right.right=new Node(90);
        bst.levelOrder(bst.root);
 }
}