public class p{
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
			Node t=head;
			while(t.next !=null){
				t=t.next;
			}
			t.next=n;
		}
	}
	public Node findmiddle(Node startingelement){
	    Node rabbit=startingelement;
		    Node turtle=startingelement;
		if(startingelement==null){
			System.out.println("null list cerats");
		}
		else{
			
			while(rabbit.next !=null && rabbit.next.next !=null){
				rabbit=rabbit.next.next;
				turtle=turtle.next;
			}
			
			
		}
		return turtle;
	}
	
	public Node reversing(Node mid){
		Node curr=mid.next;
		Node prev=null;
		while(curr !=null){
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		return prev;
		
	}
	public boolean ispalindrome(){
		Node t=head;
		Node middle=findmiddle(head);
		Node reversestater=reversing(middle);
		while(reversestater !=null){
			if(t.data !=reversestater.data){
				System.out.println("not paindrome");
				return false;
			}
		      t=t.next;
			  reversestater=reversestater.next;
			
		}
		
		System.out.println("palindrome");
		return true;
		
	}
	public void  print(){
		if(head==null){
			System.out.println("null list");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print("null");
						System.out.println("");

			
		}
	}
	public static void main(String args[]){
		p d=new p();
		d.build(1);
		d.build(2);
		d.build(3);
		d.build(3);
		d.build(2);
		d.build(1);
		d.print();
		d.ispalindrome();
		
	}
}