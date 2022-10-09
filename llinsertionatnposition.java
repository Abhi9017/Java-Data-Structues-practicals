public class llinsertionatnposition{
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	//build ll
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
	//size of ll
	public void  size(){
		
		Node t=head;
		int size=0;
	   while(t !=null){
         
		   t=t.next;
		     size++;
	   }	
	   System.out.println("size is"+size);
   
	}
	
	//print ll
	public void print(){
		Node h=head;
		while(h!=null){
			System.out.print(h.data+"->");
			h=h.next;
		}
		
		System.out.print("null");
		System.out.println("");
	}
	
	//insert at any ll
	public void  insertatanyposition(int data,int position){
		Node n=new Node(data);
	    Node t=head;
		
		int size=0;
	   while(t !=null){
         
		   t=t.next;
		     size++;
 	   }
           if(position>size){
			   System.out.println("invalid position");
		   }else{
			   Node h=head;
			   int count=1;
			   while(count < position){
				   h=head.next;
				   count++;
				   
			   }n.next=h.next;
			    h.next=n;
		   }
 

	
	}
	
	public static void main(String args[]){
		llinsertionatnposition ll = new llinsertionatnposition();
		ll.build(9);
		ll.build(8);
		ll.build(9);
		ll.insertatanyposition(7,2);
		ll.print();
		ll.size();
	}
}