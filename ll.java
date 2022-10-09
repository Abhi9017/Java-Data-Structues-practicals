public class ll{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next =  null;
		}
	}
	public static void main(String args[]){
		Node head = null;
		int arr[]={1,5,6,32,22,56};
		for(int i=0;i<arr.length;i++){
			Node n = new Node(arr[i]);
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
		Node t=head;
		while(t!=null){
			System.out.println(t.data);
			t=t.next;
		}
		
	}
}