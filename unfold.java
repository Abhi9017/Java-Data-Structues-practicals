public class unfold{
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
			while(t.next !=null ){
				t=t.next;
			}
			t.next=n;
		}
	}
	public void print(){
		if(head==null){
			System.out.print("Null list cretaed");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print("null");
		}
	}
	public Node findmiddle(Node head){
		Node rabbit=head;
		Node turtle=head;
		while(rabbit.next !=null && rabbit.next.next !=null){
			rabbit=rabbit.next.next;
			turtle=turtle.next;
		}
		return turtle;
	}
	public Node reverse(Node mid){
		Node prev=null;
		Node curr=mid.next;
		while(curr !=null){
			Node nextnode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
			
		}
		return prev;
	}
	public Node unreverse(Node mid){
		Node prev=null;
		Node curr=mid;
		while(curr !=null){
			Node nextnode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
			
		}
		return prev;
	}
	public void fold(){
		Node midder=findmiddle(head);
		Node secondhalfstater=reverse(midder);
		Node firsthalfstater=head;
		while(secondhalfstater !=null && secondhalfstater.next !=null){
			Node s1=firsthalfstater.next;
			Node s2=secondhalfstater.next;
			firsthalfstater.next=secondhalfstater;
			secondhalfstater.next=s1;
			firsthalfstater=s1;
			secondhalfstater=s2;
		}
		
	}
	public void unfold(){
		Node firsthalfstater=head;
		Node secondhalfstater=head.next;
		Node t1=firsthalfstater;
		Node t2=secondhalfstater;
		while(t2 !=null && t2.next !=null){
			Node f=t2.next;
			t1.next=f;
			t2.next=f.next;
			t1=t1.next;
			t2=t2.next;
			
		}
		t1.next=null;
		Node m=unreverse(secondhalfstater);
		t1.next=m;
		
	}
	public static void main(String args[]){
		unfold f=new unfold();
		f.build(1);
		f.build(2);
		f.build(3);
		f.build(4);
		f.build(5);
		f.build(6);
		f.build(7);
		f.build(8);
		f.print();
		f.fold();
		f.print();
		f.unfold();
		System.out.println("");
		f.print();
	}
}