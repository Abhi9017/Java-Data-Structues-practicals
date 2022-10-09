public class stackarraypushbotttom{
	static int arr[]=new int[7];
		static int top=-1;
	public static class stack{
		
		public static void push(int data){
			top++;
			arr[top]=data;
		}
		public static int pop(){
			int p=arr[top];
			top--;
			
			
			return p;
		}
		public static int  peek(){
			int p=arr[top];
			
			
			System.out.println("popped element is"+p);
			return p;
			
		}
		 public static  void bp(stack s,int le){
			if(top==-1){
				s.push(le);
			return;	
			}
			int data =s.pop();
			bp(s,le);
			s.push(data);
		}
	}
	
		public static void main(String args[]){
			stack s=new stack();
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			s.push(5);
			
			
			int le=55;
			s.bp(s,le);
			for(int i=top;i>=0;i--){
				System.out.println(arr[i]);
				

			}
			
		
			}
			
	
}