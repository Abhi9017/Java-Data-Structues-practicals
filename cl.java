public class circularinsertiondeletion{
	Node head;
	Node tail;
	public class Node {
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
	public void insertbeg(int data){
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
	public void insertatend(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
			tail.next=head;
		}else{
			tail.next=n;
			tail=n;
			tail.next=head;
		}
	}
	public void insertatposition(int data,int position){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
        int count=1;
		Node t=head;
		while(count < position-1){
			t=t.next;
			count++;
			
		}
	    n.next=t.next;
		t.next=n;
		
		
		
		}
	}
	
	public void deletefirst(){
		if(head==null){
			System.out.print("list is empty unabeto delete");
		}else{
			head=head.next;
			tail.next=head;
		}
	}
	public void deletelast(){
		if(head==null){
			System.out.print("null list created");
		}else{
			Node secondlast=head;
			Node lastnode=head.next;
			while(lastnode.next !=head){
				lastnode=lastnode.next;
				secondlast=secondlast.next;
			}
			  secondlast.next=head;
			
		}
		
	}
	public void deleteany(int position){
		
		if(head==null){
			System.out.print("null list created");
		}else{
			Node secondlast=head;
			Node lastnode=head.next;
			int count=1;
			while(count<position-1){
				count++;
				secondlast=secondlast.next;
				lastnode=lastnode.next;
				
			}
			secondlast.next=lastnode.next;
			
			
		}
	}
	public void print(){
		if(head==null){
			System.out.print("null list created");
		}else{
			Node t=head;
			while(t.next !=head){
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print(t.data+"->");
			System.out.print("Null");
		}
	}
	
	public static void main(String args[]){
		circularinsertiondeletion c =new circularinsertiondeletion();
		c.build(1);
		c.build(2);
		c.build(3);
		c.build(4);
		c.build(5);
		c.build(6);
		c.insertbeg(1000);
		c.insertatend(8000);
		c.insertatposition(2,3);
		c.deletefirst();
		c.deletelast();
		c.deleteany(3);
		c.print();
	}
}