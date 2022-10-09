public class fold{
	static Node head;
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
	public void print(){
		if(head==null){
			System.out.print("Null list");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"->");
				t=t.next;
				
			}
			System.out.print("Null");
		}
	}
	public static  Node findmiddle(Node head){
		Node rabbit=head;
			Node turtle=head;
		
			
			while(rabbit.next !=null && rabbit.next.next !=null){
				rabbit=rabbit.next.next;
				turtle=turtle.next;
			}
		
		System.out.println(turtle.data+"mid is this");
		return turtle;
	}
	public Node reverse(Node mid){
		Node prev=null;
		Node curr=mid.next;
		while(curr !=null){
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		System.out.println(prev.data+"is the reverse stater");
		return prev;
	}
	public Node foldd(){
		Node middle=findmiddle(head);
			Node reversestater=reverse(middle);
			Node t=head;
		if(head==null){
			System.out.print("null");
		}else{
			
			while(reversestater.next !=null){
				Node s1=t.next;
				Node s2=reversestater.next;
				t.next=reversestater;
				reversestater.next=s1;
				t=s1;
				reversestater=s2;
				
			}
		}
		
		return t;
	}
	public void foldprint(){
		
		if(head==null){
		System.out.print("null llist");
		}else{
			Node r=head;
			while(r !=null){
				System.out.print(r.data+"->");
				r=r.next;
			}
			System.out.print("Null");
		}
	}
	public static void main(String args[]){
		fold f= new fold();
		f.build(1);
		f.build(2);
		f.build(3);
	
		f.build(5);
		f.build(6);
		f.build(7);
		f.print();
		f.foldd();
		f.foldprint();
		
		
	}
}