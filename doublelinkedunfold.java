public class doublelinkedunfold{
	Node head;
	Node tail;
	public class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}
	public void build(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}
	public void print(){
		if(head==null){
			System.out.print("Null");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"<->");
				t=t.next;
			}
			System.out.print("Null");
		}
	}
	public Node findmiddle(Node  head){
		Node rabbit=head;
		Node turtle=head;
		while(rabbit.next !=null && rabbit.next.next !=null){
			rabbit=rabbit.next.next;
			turtle=turtle.next;
		}
		return turtle;
	}
	public Node reverse(Node mid){
		Node curr=mid.next;
		Node prev=null;
		while(curr !=null){
			Node nextnode=curr.next;
			curr.prev=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
		}
		return prev;
	}
	public void fold(){
		Node mid=findmiddle(head);
		Node reversehead=reverse(mid);
		Node t=head;
		while(reversehead.next !=null&&reversehead !=null){
			Node s1=t.next;
			Node s2=reversehead.next;
			t.next=reversehead;
			reversehead.prev=t;
			reversehead.next=s1;
			s1.prev=reversehead;
			t=s1;
			reversehead=s2;
		}
		
	}
	public Node unreverse(Node mid){
		Node curr=mid;
		Node prev=null;
		while(curr !=null){
			Node nextnode=curr.next;
			curr.prev=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
		}
		return prev;
	}
	public void unfold(){
		Node firsthalfheader=head;
		Node secondhalfhesder=head.next;
		Node t1=firsthalfheader;
		Node t2=secondhalfhesder;
		while(t2.next !=null && t2 !=null){
			Node f=t2.next;
			t1.next=f;
			f.prev=t1;
			t2.next=f.next;
			f.next.prev=t2;
			t1=t1.next;
			t2=t2.next;
		}
		t1.next=null;
		Node s=unreverse(secondhalfhesder);
		t1.next=s;
	}
	
	public static void  main(String args[]){
		doublelinkedunfold df = new doublelinkedunfold();
		df.build(1);
		df.build(2);
		df.build(3);
		df.build(4);
		df.build(5);
		df.build(6);
		df.print();
		
		df.fold();
		df.print();
		df.unfold();
		df.print();
		
	}
}