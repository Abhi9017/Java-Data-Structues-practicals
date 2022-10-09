public class stackspracticenodes{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static class stack{
		public static Node head;
		public static Boolean isEmpty(){
			return head==null;
		}
		public static void push(int data){
			Node n=new Node(data);
			if(isEmpty()){
				head=n;
				return;
			}n.next=head;
			head=n;
		}
		public static int pop(){
			if(isEmpty()){
				
				return -1;
				
			}int data=head.data;
			head=head.next;
			return data;
		}
		public static  int peek(){
			if(isEmpty()){
				return -1;
			}
			int data=head.data;
			
			return data;
		}
	}

	public static void main(String args[]){
		stack s=new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
		
}
}
