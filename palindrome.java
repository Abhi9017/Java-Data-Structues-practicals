public class sortingll{
	Node head;
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
		Node t=head;
		if(head==null){
			head=n;
		}else{
			while(t.next !=null){
				t=t.next;
			}t.next=n;
		}
		
	}
	public void print(){
		Node t=head;
		if(head==null){
			System.out.println("empty list");
		}else{
			while(t !=null){
				System.out.print(t.data+"-->");
				t=t.next;
			}System.out.print("null");
			
		}
	}
	
	public static void main(String args[]){
		sortingll ll=new sortingll();
		ll.build(8);
		ll.build(300);
		ll.build(4);
		ll.build(1);
		ll.build(3);
		ll.build(100);
		
		ll.print();
		
	}
}