public class reversedll{
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public void build(int data){
		Node n=new Node(data);
		
		if(head==null){
			head=n;
		}else{
			Node h=head;
			while(h.next !=null){
				h=h.next;
			}
			h.next=n;
		}
		
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
	
public void reverse(){
		
		Node prev=null;
		Node curr=head;
		while(curr !=null){
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		
		
	}
		public static void main(String args[]){
		reversedll ll = new reversedll();
		ll.build(1);
		ll.build(2);
		ll.build(3);
		ll.build(4);
		ll.build(5);
			ll.print();
		
		ll.reverse();
		ll.print();
		
		
	}
}