public class ownstacksecond{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public  static class stack{
		public static Node head;
		public static Boolean isEmpty(){
			return head==null;
		}
		public static int push(int data){
			Node n=new Node(data);
			if(isEmpty()){
				head=n;
				return head.data;
			}n.next=head;
			 head=n;
			 return head.data;
		}
		public static  int pop(){
			if(isEmpty()){
				System.out.print("Null list");
				return -1;
			}int top=head.data;
			head=head.next;
			
			return top;
		}
		public static int peek(){
			if(isEmpty()){
				System.out.print("null LIST");
				return -1;
			}
			int top=head.data;
			
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
			  System.out.println("peek element"+" "+s.peek());
			  s.pop();
		  }
	}
}