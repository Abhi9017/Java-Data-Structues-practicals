public class linkedlistoperations{
	public  Node head;
	int size;
	 class Node{
		 int data;
		 Node next;
		 Node(int data){
			 this.data=data;
			 this.next=null;
		 }
	   }
	   //add
	  public  void addfirst(int data){
		  Node n= new Node(data);
		  if(head==null){
			  head=n;
		  }
		  else{
			  n.next=head;
			  head=n;
		  }
	  }
	  //addlast
	  public  void addlast(int data){
		  Node n=new Node(data);
		  if(head==null){
			  System.out.println("list is empty");
			  
		  }else{   //head nunchi travel cheyali to get last 
			  Node currnode = head;
			  while(currnode.next!=null){
				  currnode=currnode.next;
				  
			  }currnode.next=n;   //null dorikindi so daani next ki neww value update chesam
		  }
	  }
	  
	  //printlist
	  
	  public void print(){
		 
		  if(head == null){
			  System.out.println("list is empty");
		  }
		  else{
		      Node t= head;
			  size=1;
			  while(t !=null ){
				  System.out.print(t.data+"-->");
				  t=t.next;
				  size++;
			  }
			  System.out.print("NULL");
			  System.out.println();
			  System.out.println("size is " + (size-1));
		  
	  }
	  
 }
 //deletefirst
 public void  deletefirst(){
	if(head==null){
		System.out.println("list is null");
	}
	else{
		head=head.next;
		
	}
 }
 //deletelast
 public void deletelast(){
	 if(head==null){
		System.out.println("list is null");
	}
    if(head.next==null){
		head=null;
	}
	else{
		Node secondlast=head;
		Node lastnode=head.next;
		while(lastnode.next!= null){
			lastnode = lastnode.next;
			secondlast = secondlast.next;
		}
		secondlast.next = null;
	}	
	
	
 }
 
	   
	   
	   
	public static void main(String args[]){
		
		linkedlistoperations ll=new linkedlistoperations();
		ll.addfirst(6);
		ll.addfirst(9);
		ll.addlast(30);
		ll.addfirst(99);
		ll.addfirst(90);
		ll.addfirst(89);
		ll.addfirst(5);
	    ll.deletelast();
	    ll.print();
		//LinkedList<int> list = new LinkedList<int>();
		//list.addfirst(8);
		//inbuilt datatype linkliest//list.print();  in util poackage
		
	}
}