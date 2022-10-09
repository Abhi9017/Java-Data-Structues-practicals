import java.util.*;
public class beststackusinglinked{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static class stack{
		static Node head;
		public static Boolean isEmpty(){
			return head==null;
		}
		public static int push(){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter elemenet to push");
			int data=sc.nextInt();
			Node n=new Node(data);
			if(isEmpty()){
				head=n;
				return head.data;
			}n.next=head;
			head=n;
			return head.data;
		}
		public static int pop(){
			if(isEmpty()){
				System.out.print("Null list created");
				return -1;
			}int data=head.data;
			head=head.next;
			System.out.println("Poped element is"+data);
			return data;
		} 
		public static void  peek(){
			int data=head.data;
			
			System.out.println("Peeked element element is"+data);
			
		}
		public static void display(){
			while(head !=null){
				System.out.println(head.data);
				head=head.next;
			}
			
		}
	}
	public static void main(String args[]){
		stack s=new stack();
		Scanner sc=new Scanner(System.in);
			System.out.println("enter size of linked ist");
			int size=sc.nextInt();
			for(int i=0;i<size;i++){
				s.push();
			}
			s.pop();
			s.peek();
			s.display();
	      
	}
		
	
}