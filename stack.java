public class stack{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	 static class stacckk{
	public	static Node head;
		public static Boolean isEmpty(){
			return head==null;
		}
		public static void push(int data){
			Node newnode =new Node(data);
			if(isEmpty()){
				head=newnode;
			}
			newnode.next=head;
			head=newnode;
		
	}
	public static void pop(){
		if(isEmpty()){
			System.out.print("Null list creatd");
		}
		int data=head.data;
		head=head.next;
		System.out.print("list  is deldeted "+data);
	}
	public static void peek(){
		if(isEmpty()){
			System.out.print("Null list creatd");
		}
		int data=head.data;
		System.out.print("List is peeked"+data);
	}
	
	
	public static void main(String args[]){
		stacckk s=new stacckk();
		s.push(8);
		s.push(8);
		s.pop();
		s.peek();
		
	}
}
}