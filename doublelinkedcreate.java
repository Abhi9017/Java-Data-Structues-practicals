public class doublelinkedcreate{
	Node head;
	Node tail;
	public int size;
	public class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
			size++;
		}
	}
	public void build(int data){
		Node n=new Node(data);
		
		if(head==null){
			head=n;
			tail=n;
			
		}else{
			tail.next=n;
			n.prev=tail;
			tail=n;
			
		}
		size++;
	}
	
	public void print(){
		if(head==null){
			System.out.println("null list ");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.println("null");
			
		}
					System.out.println(size);

	}
	
public static void main(String  args[]){
	doublelinkedcreate dd=new doublelinkedcreate();
	dd.build(77);
	dd.build(79);
	dd.build(78);
	dd.build(80);
	dd.build(80);
	dd.build(7);
	dd.print();
	
	
}
}