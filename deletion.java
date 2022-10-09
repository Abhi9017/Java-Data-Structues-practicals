public class deletion{
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
			head=tail=n;
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
	
	public void deletefirst(){
		if(head==null){
			System.out.println("unable tp delete beaccuse list is empty");
		}else{
			head=head.next;
			head.prev=null;
		}
	}
	public void deletelast(){
		if(head==null){
			System.out.println("unable tp delete beaccuse list is empty");
		}
		else{
		   tail.prev.next=null;
			tail=tail.prev;
		}
	}
	public  void deleteanyposition(int position){
		
		if(head==null){
			System.out.println("unable tp delete beaccuse list is empty");
		}
		else{
			int count=1;
			Node curr=head;
			while(count < position){
				curr=curr.next;
				count++;
			}curr.prev.next=curr.next;
			curr.next.prev=curr.prev;
			
		}
		
	}
	public static void main(String args[]){
		deletion dd=new deletion();
		dd.build(1);
		dd.build(2);
		dd.build(3);
		dd.build(4);
		dd.build(5);
		dd.build(6);
		dd.print();
		dd.deletelast();
		
        dd.print();
	}
	
}