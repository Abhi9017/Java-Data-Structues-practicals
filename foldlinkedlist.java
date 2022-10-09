public class foldlinkedlist{
	static Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public void buildll(int data){
		Node n=new Node(data);
		Node t=head;
		if(head==null){
			head=n;
		}else{
			
			while(t.next !=null){
				t=t.next;
			}
			t.next=n;
		}
		
	}
	public Node findmiddle(Node head){
		Node rabbit=head;
		Node turtle=head;
		while(rabbit.next !=null && rabbit.next.next !=null)
		{
			rabbit=rabbit.next.next;
			turtle=turtle.next;
		}
		System.out.println("mid value is"+" "+turtle.data);
		return turtle;
		
	}
	public Node  reversing(Node mid){
		Node prev=null;
		Node curr=mid.next;
		while(curr !=null){
			Node nextnode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
			
		}
		System.out.println("head of revesing list  value is"+" "+prev.data);

		return prev;
		
	}
	public void print(){
		Node t=head;
		while(t !=null){
			System.out.print(t.data+"->");
			t=t.next;
		}
		System.out.print("null");
	}
	public static void main(String args[]){
		foldlinkedlist ff=new foldlinkedlist();
		ff.buildll(1);
		ff.buildll(2);
		ff.buildll(3);
		ff.buildll(7);
		ff.buildll(2);
		ff.buildll(1);
		ff.findmiddle(head);
        ff.print();
	}
}z