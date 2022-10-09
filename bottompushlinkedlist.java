public class bottompushlinkedlist{
	 static Node head;
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static class stack{
		
		public static Boolean isEmpty()
		{
			return head==null;
		}
			public static Node push(int data){
		    Node n=new Node(data);
			if(isEmpty()){
				head=n;
				return head;
			}n.next=head;
			head=n;
		  return head;
		
		}
		public  static Node pop(){
			if(isEmpty()){
				System.out.println("underflow ");
				return head;
			}
			Node pped=head;
			head=head.next;
			System.out.println("popped is"+pped.data);
			return pped;
		}
		public void display(){
			if(isEmpty()){
				System.out.println("no element");
				return;
			}
			 while(head!=null){
				 System.out.println("dispalying element"+head.data);
				 head=head.next;
			 }
		}
		public static void pushbottom(stack s,int data){
			 
			if(head==null){
				s.push(data);
				return;
			}
			Node r=s.pop();
			int cc=r.data;
			pushbottom(s,data);
			s.push(cc);
		}
		
	}
	
		public static void main(String args[]){
			stack s=new stack();
			int position;
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			s.push(5);
			s.push(6);
			s.pop();
			s.display();
			s.pushbottom(s,1000);
			
			s.display();
			
			
		}
	
}