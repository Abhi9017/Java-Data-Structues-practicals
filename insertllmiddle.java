public class insertllmiddle{
	Node head;
	int size=0;
	int mid;
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
		
		if(head==null){
			head=n;
		}else{
			Node h=head;
			while(h.next !=null){
				h=h.next;
			}
			h.next=n;
		}
		
	}
	public void print(){
		Node h=head;
		while(h!=null){
			System.out.print(h.data+"->");
			h=h.next;
			size++;
		}
		
		System.out.print("null");
		System.out.println("");
		System.out.println("size is"+" "+size);
		System.out.println("");
	}
	public void insertmiddle(int data){

		
		Node n=new Node(data);
		if(size%2==0){
			mid = size/2;
			
		}else{
			mid=(size+1)/2;
		}
		
       System.out.println("middle"+mid);
		
		
		
		if(size<mid){
			System.out.println("cant do that mid is too small");
		}else{
			int count=1;
			Node t=head;
			while(count < mid-1){
				count++;
				t=t.next;
			}
			n.next=t.next;
			t.next=n;
		}
		
		
		
		
	}
	
	
	public static void main(String args[]){
		insertllmiddle ll=new insertllmiddle();
		ll.build(44);
		ll.build(44);
		ll.build(47);
		ll.build(48);
		ll.build(40);
	    ll.print();
	   ll.insertmiddle(10);
	   ll.print(); //updating 2 times size dont worry easy
	}
}