public class splitcircular{
	  static Node head;
	  Node tail;
	  Node head2;
	  Node tail2;
	  int midpos=1;
	 static int size;
	   public class Node {
		   int data;
		   Node next;
		   Node prev;
		   
		   Node(int data){
			   this.data=data;
			   next=null;
			   prev=null;
			   size++;
		   }
	   }
	
	public void build(int data){
		Node n=new Node(data);
		if(head==null){
			head=tail=n;
			tail.next=head;
			
		}else{
			tail.next=n;
			tail=n;
			tail.next=head;
			
		}
	}
	public void print(){
		if(head==null){
			System.out.print("Null list");
		}else{
			Node t=head;
			while(t.next !=head){
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print(t.data+"->");
			System.out.print("Head");
		}
	}
	public void print2(){
		if(head==null){
			System.out.print("Null list");
		}else{
			Node t=head2;
			while(t.next !=head2){
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print(t.data+"->");
			System.out.print("Head");
		}
	}
	public Node middle(Node head){
		Node rabbit=head;
		Node turtle=head;
		
		while(rabbit.next !=head && rabbit.next.next !=head){
			rabbit=rabbit.next.next;
			turtle=turtle.next;
			midpos++;
		}
		System.out.print(turtle.data+" "+midpos+"is the middle");
		return turtle;
	}
	public void split(){
		Node firsthalfupperbound=middle(head);
	    head2=firsthalfupperbound.next;
		Node t=head;
		int count=1;
		while(count < midpos){
			count++;
			t=t.next;
		}
		t.next=head;
		t=tail2;
	    tail.next=head2;
		 
		 
      
		}
	public static void main(String args[]){
		splitcircular sc =new splitcircular();
		sc.build(1);
		sc.build(2);
		sc.build(3);
		sc.build(4);
		sc.build(5);
		sc.build(6);
		sc.build(7);
		System.out.println(size+"is the size");
		System.out.println(" ");
		sc.split();
		System.out.println(" ");
		sc.print();
		System.out.println(" ");
		sc.print2();
	}

}