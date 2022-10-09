public class palindromell{
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
			Node t=head;
			while(t.next !=null){
				t=t.next;
			}
			t.next=n;
		}
	}
	public void print(){
		if(head==null){
			System.out.println("empty");
		}else{
			Node t=head;
			while(t !=null){
				
				System.out.print(t.data+"->");
				t=t.next;
			}
			System.out.print("null");
		}
	}
	
	public Node findmiddle(Node head){
		Node turtle=head;
		Node rabbit=head;
		while(rabbit.next !=null && rabbit.next.next !=null){
			rabbit=rabbit.next.next;
			turtle=turtle.next;
		}
		return turtle;
    }
	public Node reverse(Node mid){
		Node prev=null;
		Node curr=mid;
		while(curr !=null){
			Node nextnode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextnode;
		}
		return prev;
    }
	public boolean palindrome(){
		Node midd=findmiddle(head);
		Node secondhalfstarting=reverse( midd);
		Node firsthalfstarting=head;
		
		while(secondhalfstarting !=null){
			if(firsthalfstarting.data !=secondhalfstarting.data)
			{
				System.out.println("not palinndrome");
				return false;
				
			}
			secondhalfstarting=secondhalfstarting.next;
			firsthalfstarting=firsthalfstarting.next;
			
		}
		System.out.println("palindrome");
		return true;
		
		
		
	}
	
	public static void main(String args[]){
		palindromell pp=new palindromell();
		pp.build(9);
		pp.build(10);
		pp.build(33);
		pp.build(88);
		pp.build(5);
		pp.build(6);
		pp.build(6);
		pp.build(5);
		pp.build(88);
		pp.build(33);
		pp.build(10);
		pp.build(9);
		pp.palindrome();
		
		pp.print();
		
	}
}