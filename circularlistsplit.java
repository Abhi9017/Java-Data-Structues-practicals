public  class  circularlistsplit{
	static Node head;
	Node tail;
	Node tail2;
	Node head2;
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
				 System.out.print("Null liste  cretaed");
			 }else{
				 Node t=head;
				 while(t.next !=head){
					 System.out.print(t.data+"->");
					 t=t.next;
				 }
				 System.out.print(t.data+"->head");
			 }
			 
		 }
		 public void print2(){
			 if(head2==null){
				 System.out.print("Null liste  cretaed");
			 }else{
				 Node t=head2;
				 while(t.next !=head2){
					 System.out.print(t.data+"->");
					 t=t.next;
				 }
				 System.out.print(t.data+"->head");
			 }
			 
		 }
		 public Node findmiddle(Node head){
			 Node rabbit=head;
			 Node turtle=head;
			 while(rabbit.next !=head && rabbit.next.next !=head){
				 rabbit=rabbit.next.next;
				 turtle=turtle.next;
			 }
			 return turtle;
		 }
		 public  void split(){
			  tail2=findmiddle(head);
			 head2=tail2.next;
			Node t=head;
			while(t !=tail2){
				t=t.next;
				
			}
			tail2.next=head;
			tail.next=head2;
			 
		 }
		 public static void main(String args[]){
			 circularlistsplit c=new circularlistsplit();
			 c.build(6);
			  c.build(1);
			   c.build(2); c.build(10);
			    c.build(3);
				 c.build(4);
				 c.findmiddle(head);
			 c.print();
			 c.split();
			 c.print();
			 c.print2();
		 }
		 
}