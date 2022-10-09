public class overll{
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next =  null;
		}
	}
	public void insert(int data){
		Node n=new Node(data);
		if(head==null){
			head=n;
		}else{
			Node t=head;
			while(t.next !=null){
				t=t.next;
			}
			t.next=n;
		}
	}
	public void addfirst(int data){
		Node n=new Node(data);
		if(head==null){
			System.out.println("list is empty");
		}
		else{
			n.next=head;
			head=n;
			
		}
	}
	public void addlast(int data){
		Node n =new Node(data);
		if(head==null){
			System.out.println("list is empty");
		}
		else{
			Node t=head;
			while(t.next !=null){
				t=t.next;
			}
			t.next=n;
			n.next=null;
		}
	}
	public void deletefirst(){
		if(head==null){
			System.out.println("list is empty");
		}
		else{
			head=head.next;
		}
	}
	public void deletelast(){
	 if(head==null){
			System.out.println("list is empty");
		}
		else if(head.next == null){
			head=null;
             			
		}
		else{
			Node secondlast = head;
			Node lastnode = head.next;
			while(lastnode.next !=null){
				lastnode=lastnode.next;
				secondlast=secondlast.next;
			}
			secondlast.next=null;
			
		}
	}
	public void print(){
		Node t=head;
		int size=0;
		while(t !=null){
			System.out.print(t.data+"->");
			
			t=t.next;
			size++;
			}
			System.out.print("null");
			System.out.println("");
			System.out.println("size is"+size);
			
	}
	public static void main(String args[]){
		overll ll=new overll();
		ll.insert(9);
		ll.insert(55);
		ll.insert(87);
		ll.addfirst(90);
		ll.addlast(77);
		ll.addlast(89);
		ll.deletefirst();
		ll.deletelast();
		ll.print();
	}
	
	
	
	
	
}