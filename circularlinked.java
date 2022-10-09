public class circularlinked{
	Node head;
	Node tail;
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
			head=tail=n;
		}else{
			tail.next=n;
			tail=n;
			tail.next=head;
		}
	}
	public void insertatbeg(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
			tail.next=head;
		}else{
			n.next=head;
			head=n;
			tail.next=head;
		}
	}
	public void insertatanny(int data,int position){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			Node t=head;
			int count=1;
			while(count<position-1){
				count++;
				t=t.next;
			}
			n.next=t.next;
			t.next=n;
		}
	}
	public void insertatend(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			tail.next=n;
			tail=n;
			tail.next=head;
		}
		
	}
	
	
public void print(){
	if(head==null){
		System.out.print("Null");
	}else{
		Node t=head;
		while(t.next !=head){
			System.out.print(t.data+"->");
			t=t.next;
		}
		System.out.print(t.data+"->");
		System.out.print("NULL");
	}
}
public static void main(String args[]){
	circularlinked cl=new circularlinked();
	cl.build(1);
	cl.build(2);
	cl.build(3);
	cl.build(4);
	cl.build(5);
	cl.insertatbeg(0);
	cl.insertatanny(3,4);
	cl.insertatend(99999);
	cl.print();
}	
}