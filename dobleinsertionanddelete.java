public class dobleinsertionanddelete{
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
	public void insert(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			
			
				tail.next=n;
				n.prev=tail;
				tail=n;
				
			
		}
	}
	public void insertany(int data,int position){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
		}else{
			int count=1;
			Node t=head;
			while(count<position-1){
				count++;
				t=t.next;
			}
			n.next=t.next;
			n.prev=t;
			t.next=n;
			n.next.prev=n;
		}
	}
	public void deleteany(int position){
		if(head==null){
			System.out.println("list is empty");
		}else{
			int count=1;
			Node t=head;
			while(count < position){
				count++;
				t=t.next;
			}
			t.prev.next=t.next;
			t.next.prev=t.prev;
		}
	}
	public void print(){
		if(head==null){
			System.out.print("list emty");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"<->");
				t=t.next;
			}
			System.out.print("null");
			System.out.println("  ");
		}
		
	}
	public void reverse(){
		if(head==null){
			System.out.print("listempty uabe to reverrse");
		}else{
			Node curr=head;
			Node prev=null;
			while(curr !=null){
				Node nextnode=curr.next;
				 curr.next=prev;
				 curr.prev=nextnode;
				 prev=curr;
				 curr=nextnode;
				
			}
			prev=head;
			head=tail;
			tail=curr;
			
			
		}
	}
	
	
	
	public static  void main(String args[]){
		dobleinsertionanddelete dd=new dobleinsertionanddelete();
		dd.insert(1);
		dd.insert(2);
		dd.insert(3);
		dd.insert(4);
		dd.insert(5);
		dd.insert(6);
		dd.insert(7);
		dd.print();
		dd.insertany(100,3);
		dd.print();
		dd.deleteany(3);
		dd.print();
		dd.reverse();
		
		dd.print();
	}
}