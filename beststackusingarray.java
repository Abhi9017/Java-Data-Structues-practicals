import java.util.*;
public class beststackusingarray{
	public static class stack{
	   
	    static	int arr[]=new int[6];
	    static int top=-1;
		public static Boolean isEmpty(){
			return arr.length==0;
		}
		public static void push(int data){
			top++;
			arr[top]=data;
		}
		public static int pop(){
			if(isEmpty()){
				System.out.print("Null list created");
				return -1;
			}int data=arr[top];
			top--;
			System.out.println("Poopped element is"+data);
			return arr[top];
		}
		public static int peek(){
			if(isEmpty()){
				System.out.print("Null list created");
				return -1;
			}int data=arr[top];
			
			System.out.println("Peeked element is"+data);
			return arr[top];
		}
		public static void display(){
			for(int i=top;i>=0;i--){
				System.out.println(arr[i]);
			}
		}
		
		
		
	}
	public static void main(String args[]){
		stack s=new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.peek();
		s.pop();
		s.peek();
		s.display();
		
	}
}