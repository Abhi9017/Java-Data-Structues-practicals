public class circularreversed{
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
	public void  build(int data){
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
			System.out.print("Null list creted");
		}else{
			Node t=head;
			while(t.next !=head){
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print(t.data);
			System.out.print("->head");
		}
		
	}
	public void  reverse(){
		if(head==null){
			System.out.print("Null list creted");
		}
		else{
			Node prev=null;
			Node curr=head;
			do{
				Node nextnode=curr.next;
				curr.next=prev;
				prev=curr;
				curr=nextnode;
             }
			while(curr !=head);
				head.next=prev;
				Node temp=head;
				head=tail;
				tail=temp;
				
			
			
		}
		
	}
	public static void main(String args[]){
		circularreversed cl =new circularreversed();
		cl.build(1);
		cl.build(2);
		cl.build(3);
		cl.build(4);
		cl.build(5);
		cl.build(6);
		
		cl.reverse();
		cl.print();
	}
}