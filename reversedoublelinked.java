public class reversedoublelinked{
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
	public void reverse(){
		if(head==null){
				System.out.println("nnull  list creared");

		}else{
			Node prev=null;
			Node curr=head;
			while(curr !=null){
				Node newnode=curr.next;
				curr.next=prev;
				curr.prev=newnode;
				prev=curr;
				curr=newnode;
			}
			Node temp=head;
			head=tail;
			tail=temp;
		}
	}
	public void print(){
		if(head==null){
			System.out.println("nnull  list creared");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"<->");
				t=t.next;
			}
			System.out.print("null");
			System.out.println("");
		}
	}
	public static void main(String args[]){
		 reversedoublelinked dd= new  reversedoublelinked();
		 dd.build(1);
		 dd.build(2);
		 dd.build(3);
		 dd.build(4);
		 dd.build(5);
		 dd.build(6);
		 dd.print();
		 dd.reverse();
		 dd.print();
	}
}