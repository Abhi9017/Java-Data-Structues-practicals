public class palindromedoublelinked{
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
	
	public Node  reverse(Node middle){
		Node prev=null;
		if(head==null){
			System.out.println("nnull  list creared");
		}else{
			
			Node t=middle.next;
			while(t !=null){
				Node newnode=t.next;
				t.next=prev;
				t.prev=newnode;
				prev=t;
				t=newnode;
			}
			Node temp=head;
			head=tail;
			tail=temp;
		}
		
		return prev;
		
	}
	public Node finddmiddle(Node head){
		Node rabbit=head;
		Node turtle=head;
		while(rabbit.next !=null && rabbit.next.next !=null){
			rabbit=rabbit.next.next;
			turtle=turtle.next;
		}
		
		return turtle;
	}
	public boolean ispalindrome(){
		Node t=head;
		Node middle=finddmiddle(head);
		Node secondhalfstarter=reverse(middle);
		
			while(secondhalfstarter !=null){
				if(t.data !=secondhalfstarter.data){
					System.out.println("Not Palindrome");
					return false;
				}
				t=t.next;
				secondhalfstarter=secondhalfstarter.next;
			}
			
			
		
		System.out.println("it is a Palindrome");
		return true;
	}
	public void print(){
		if(head==null){
			System.out.println("nnull  list creared");
		}else{
			Node t=head;
			while(t !=null){
				System.out.print(t.data+"<->");
				t=t.next;
			}
			System.out.print("null");
			System.out.println("");
		}
	}
	
	public static void main(String args[]){
		 palindromedoublelinked dd= new  palindromedoublelinked();
		 dd.build(1);
		 dd.build(2);
		 dd.build(3);
		 dd.build(3);
		 dd.build(2);
		 dd.build(1);
		 
	     dd.print();
		 dd.ispalindrome();
        
	}
}