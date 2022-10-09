public class linkedlist{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next=null;
		}
		
	}
	public static void main(String args[]){
		Node head=null;
		
		int [] arr={66,44,55,22,11,333,9};
		for(int i=0;i<arr.length-1;i++){
			Node n = new Node(arr[i]);
			if(head==null){
				head=n;
			}else{
				Node h = head;
				while(h.next !=null){
					h=h.next;
				}
				h.next=n;
			}
		}
		Node h= head;
	while(h !=null){
		System.out.print(h.data+"->");
		h=h.next;
	}
	System.out.print("null");
		
		
	
		
	}
}