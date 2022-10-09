public class stackclass{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	 static class Stackj{
		 public  static Node head;
		public static Boolean isEmpty(){
			return head==null;
		}
		public static void push(int data){
			Node newnode = new Node(data);
			if(isEmpty()){
				head=newnode;
			}newnode.next=head;
			head=newnode;
		}
		public static void pop(){
			if(isEmpty()){
				System.out.print("Unable to cretadlist");
			}
			int top=head.data;
			head=head.next;
			System.out.print("poprd lelemen  is"+top);
		}
		public static void peek(){
			if(isEmpty()){
				System.out.println("Unable to cretadlist");
			}
			int top=head.data;
			
			System.out.println("TOP lelemen  is"+top);
			
		}
	}
	
	public static void main(String args[]){
		Stackj s=new Stackj();
		s.push(8);
		s.push(5);
		s.push(7);
		while(!s.isEmpty()){
			s.peek();
		s.pop();
		
		
	}}
}