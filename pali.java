public class pali{
	public   Node head;
	public  Node mid;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void  build(int data){
		Node n=new Node(data);
		Node t=head;
		if(head==null){
			head=n;
		}else{
			while(t.next !=null){
				t=t.next;
			}t.next=n;
		}
		
	}
	public static  Node findmiddle(Node head){
		Node rabbit=head;
		Node turtle=head;
		while(rabbit.next.next !=null && rabbit.next !=null){
			rabbit=rabbit.next.next;
			turtle=turtle.next;
		}
		return turtle;
		
	}
	
     public static Node reverse(Node mid){
		Node prev=null;
		Node curr=mid.next;
		while(curr !=null){
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		
		return prev;
	}
	
	public void print(){
		Node h=head;
		while(h!=null){
			System.out.print(h.data+"->");
			h=h.next;
		}
		
		System.out.print("null");
		System.out.println("");
	}
	public void reverseprint(){
		Node midd=findmiddle(head);
		Node secondhalfstarter=reverse(midd);
		while(secondhalfstarter !=null){
			System.out.print(secondhalfstarter.data+"->");
			secondhalfstarter=secondhalfstarter.next;
		}
		
		System.out.print("null");
		System.out.println("");
	}
	public boolean Palindrometeller(){
		if(head==null){
			return true;
		}
			Node midd=findmiddle(head);
			Node secondhalfstarter=reverse(midd);
			Node curr=head;
			while(secondhalfstarter !=null){
				if(secondhalfstarter.data!=curr.data)
				{
					return false;
				}
				secondhalfstarter=secondhalfstarter.next;
				curr=curr.next;
			}
			
			System.out.println("palindrome");
			return true;
		}
		
	
		
		
		
		
		
		
	
     public static void main(String args[]){
		pali ll= new pali();
		ll.build(1);
		ll.build(2);
		ll.build(6);
		ll.build(0);
		ll.build(0);
		ll.build(1);
        ll.print();
		ll.reverseprint();
		ll.Palindrometeller();
		
		
		
	}
}
