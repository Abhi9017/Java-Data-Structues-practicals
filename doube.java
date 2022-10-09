public class doube{
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
	}
	
	
	
	public static void main(String args[]){
		doube dd=new doube();
		dd.build(1);
		dd.build(2);
		dd.build(3);
		dd.build(4);
		dd.build(5);
		dd.build(6);
		dd.print();
	}
	
}