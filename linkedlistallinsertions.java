public class linkedlistallinsertions{
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public  void buildll(int data){
		Node n=new Node(data);
		if(head == null){
			head =n;
		}else{
			Node t=head;
				while(t.next !=null){
					
					t=t.next;
				}
				t.next=n;
			
		}
	}
	public void insertatparticularnode(int data,int position){
		Node n=new Node(data);
		int size=1;
		Node t=head;
		while(t !=null){
			size++;
			t=t.next;
			
		}
		System.out.println("size is "+size);
		
		if(position > size){
			System.out.println("invalid position");
		}
		else{
			Node h=head;
			int i=0;
			Node previous =null;
			while(i<=position){
				previous=previous.next;
				h=h.next;
				
			}
			previous.next=h.next;
			
		}
		
	}
	
	public  void print(){
		Node t=head;
		while(t !=null){
			System.out.print(t.data+"-->");
			t=t.next;
		}
		
            System.out.print("null");
	}


	public static void main(String args[]){
		linkedlistallinsertions ll=new linkedlistallinsertions();
		ll.buildll(9);
		ll.buildll(7);
		ll.buildll(88);
		ll.buildll(54);
		ll.insertatparticularnode(100,1);
		ll.print();
		
	}
}