public class ownstack{
	static Node head;
	public static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static class stack{
		
		public static int push(int data){
			Node n=new Node(data);
			if(head==null){
				head=n;
				return head.data;
			}n.next=head;
			head=n;
			return head.data;
		}
		public static int pop(){
			if(head==null){
				System.out.print("Null list");
				return -1;
			}int top=head.data;
			head=head.next;
			return top;
		}
		public static int peek(){
			if(head==null){
				System.out.print("Null list");
				return -1;
			}int top=head.data;
			
			return top;
		}
}
	public static void main(String args[]){
		stack s=  new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		while(head!=null){
		System.out.println(s.peek());
		s.pop();
		
		}
		
	}
}