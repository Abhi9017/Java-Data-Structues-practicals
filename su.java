public class su{
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static class stack{
		public static Node head=null;
		public static Boolean isEmpty(){
			return head==null;
		}
		public static void push(int data){
			Node newnode =new Node(data);
			if(isEmpty()){
				head=newnode;
			}newnode.next=head;
			head=newnode;
		}
		
		public static int pop(){
			if(isEmpty()){
				return -1;
			}
			int top=head.data;
			head=head.next;
			System.out.print("Top element is"+top);
			return top;
		}
		public static int peek(){
			if(isEmpty()){
				return -1;
			}
			int top=head.data;
			
			System.out.print("Top element is"+top);
			return top;
			
		}
	}
	public static void main(String args[]){
		stack s=new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		while(!s.isEmpty()){
		
		System.out.println(s.peek());
		s.pop();
		}
		
		
		
	}
}