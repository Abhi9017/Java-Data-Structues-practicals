public class stackarraypushbotttom{
	public static class stack{
		int arr[]=new int[6];
		top=1;
		public static void push(int data){
			top++;
			arr[top]=data;
		}
		public static void pop(){
			int p=arr[top];
			top--;
			
			System.out.print("popped element is"+p);
		}
		publis static void peek(){
			int p=arr[top];
			
			
			System.out.print("popped element is"+p);
		}
		public static void main(String args[]){
			stack s=new Stack();
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			s.push(5);
			s.push(6);
			while(top==-1){
				System.out.println(s.peek());
				s.pop();
			}
		}
	}
}