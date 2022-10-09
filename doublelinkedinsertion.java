public class doublelinkedinsertion{
	Node head;
	Node tail;
	public class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			prev=null;
			next=null;
		}
	}
	
	public  void build(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail= n;
		}else{
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}
	
	public void print(){
		if(head==null){
			System.out.println("list empty");
		}
		else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"<->");
				t=t.next;
			}
		}
		System.out.print("Null");
				System.out.println("");

	}
	public void insertfirst(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}
		else{
			head.prev=n;
			n.next=head;
			head=n;
		}
	}
	
	public void insertatend(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}
	public void insertatparticular(int data,int position){
		Node newnode=new Node(data);
		if(head==null){
			head=tail=newnode;
		}else{
			Node currnode=head;
			int count=1;
			while(count < position-1){
				currnode=currnode.next;
				count++;
			}
			newnode.next=currnode.next;
			currnode.next=newnode;
			newnode.prev=currnode;
			newnode.next.prev=newnode;
			
		}
		
		
	}
	
	public static void main(String args[]){
		doublelinkedinsertion dd=new doublelinkedinsertion();
		dd.build(1);
		dd.build(2);
		dd.build(3);
		dd.build(4);
		dd.build(5);
		dd.build(6);
		dd.print();
		dd.insertfirst(100);
		dd.insertatend(8568);
		dd.insertatparticular(33,3);
		dd.print();
	}
	
}