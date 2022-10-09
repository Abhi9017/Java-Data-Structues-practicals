public class circularinseronndeletion{
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
	public void insertbeg(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			n.next=head;
			head=n;
			tail.next=head;
		}
		
	}
	public void insertpar(int data,int position){
		
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
	public void insertend(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			Node t=head;
			while(t.next !=head){
				t=t.next;
				
			}
			t.next=n;
			tail=n;
			tail.next=head;
		}
		
	}
	public  void deletefirst(){
	
		if(head==null){
			
			System.out.print("null isted");
		}else{
			head=head.next;
			tail.next=head;
		}
		
	}
	public void deletelast(){
		if(head==null){
			
			System.out.print("null isted");
		}else{
			Node secondlast=head;
			Node lastnode=head.next;
			Node t=head;
			while(lastnode.next !=head){
			lastnode=lastnode.next;
			secondlast=secondlast.next;
			}
			
			secondlast.next=head;
			tail=secondlast;
			
		}
		
	}
	public void deletepos(int  position){
		if(head==null){
			
			System.out.print("null isted");
		}else{
			int count=1;
			Node secondlast=head;
			Node lastnode=head.next;
			
			while(count < position-1){
				count++;
				secondlast=secondlast.next;
				lastnode=lastnode.next;
			}
			secondlast.next=lastnode.next;
			
		}
		
	}
	public static void main(String args[]){
		circularinseronndeletion cl =new circularinseronndeletion();
		cl.build(1);
		cl.build(2);
		cl.build(3);
		cl.build(4);
		cl.build(5);
		cl.build(6);
		
		
		cl.print();
	}
}