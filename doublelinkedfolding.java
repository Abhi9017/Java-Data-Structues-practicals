public class  doublelinkedfolding{
	static Node head;
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
	public void build(int data){
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
			System.out.print("Nullnode creaed");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"<->");
				t=t.next;
			}
			System.out.print("Null");
			
		}
	}
	public static Node findmiddle(Node head){
		Node rabbit=head;
		Node turtle=head;
		while(rabbit.next !=null && rabbit.next.next !=null){
			rabbit=rabbit.next.next;
			turtle=turtle.next;
		}
	
		return turtle;
		
	}
	public  Node reverse(Node mid){
		Node curr=mid.next;
		Node prev=null;
		while(curr !=null){
			Node nextnode=curr.next;
			curr.prev=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
		}
		
		return prev;
	}
	
	public void fold(){
		Node m=findmiddle(head);
	   Node seconghlafstater=reverse(m);
	   Node firsthalfstater=head;
	   while(seconghlafstater.next !=null){
		   Node s1=firsthalfstater.next;
		   Node s2=seconghlafstater.next;
		   firsthalfstater.next=seconghlafstater;
		   seconghlafstater.prev=firsthalfstater;
		   seconghlafstater.next=s1;
		   s1.prev=seconghlafstater;
		   firsthalfstater=s1;
		   seconghlafstater=s2;
		   
	   }
	   
		 
		  
		
	}
	public static void main(String args[]){
		 doublelinkedfolding df = new  doublelinkedfolding();
		 df.build(1);
		 df.build(2);
		 df.build(3);
		 df.build(4);
		 df.build(5);
		 df.build(6);
		  df.print();
		df.fold();
		
		 df.print();
		 
		 
	}
}