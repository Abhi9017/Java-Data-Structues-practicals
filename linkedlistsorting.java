public class linkedlistsorting{
	Node head;
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
		Node h=head;
		if(head==null){
			head=n;
		}else{
		
			while(h.next !=null){
				h=h.next;
			}
			h.next=n;
		}
		
		//size
		
		public void sorting(int data){
		int size=0;
		Node h=head;
		Node n=new Node(data);
		while(h !=null){
			size++;
			h=h.next;
		}
		
		for(int i=0;i<=size;i++){
			for(int j=0;j<=size-1;j++){
				
				
			}
		}
		
		int i=0;
		while(h!=null){
			System.out.println(h.data);
			h=h.next;
		}
		
		}
	}
	public void print(){
		Node h=head;
		while(h!=null){
			System.out.print(h.data+"->");
			h=h.next;
		}
		
		System.out.print("null");
		System.out.println("");
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public static void main(String args[]){
		linkedlistsorting ll = new linkedlistsorting();
		ll.build(1);
		ll.build(2);
		ll.build(3);
		ll.build(4);
		ll.build(5);
		ll.sorting(7);
		ll.print();
		
		
	}
}