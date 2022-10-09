public class lldeletionatanyposition{
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
		}
		
		System.out.print("null");
		System.out.println("");
	}
	public void deleteany(int position){
		int count =0;
		Node t=head;
		Node secondlast=null;
		Node lastnode=null;
		while(count<position-1){
			count++;
			secondlast=t;
			lastnode=t.next;
			t=t.next;
		}
		secondlast.next=lastnode.next;
		
	}
	
	public static void main(String args[]){
		lldeletionatanyposition ll = new lldeletionatanyposition();
		ll.build(1);
		ll.build(2);
		ll.build(3);
		ll.build(4);
		ll.build(5);
		ll.print();
		ll.deleteany(3);
		ll.print();
	}
}