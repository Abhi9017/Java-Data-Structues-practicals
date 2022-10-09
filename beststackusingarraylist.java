import java.util.*;
public class beststackusingarraylist{
	public static class stack{
		static ArrayList<Integer> al=new ArrayList<Integer>();
		public static Boolean isEmpty(){
			return al.size()==0;
		}
		public static void push(int data){
			al.add(data);
		}
		public static void pop(){
			if(isEmpty()){
				System.out.print("Null list unavle to pop");
			}int top=al.get((al.size())-1);
			al.remove((al.size())-1);
			System.out.println("Popped element"+top);
			
		}
		public static void peek(){
			
			int top=al.get((al.size())-1);
			
			System.out.println("Peeked element"+top);
			
		}
		public static void display(){
			int top=((al.size())-1);
			for(int i=top;i>=0;i--){
				System.out.println(al.get(i));
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
		s.pop();
		s.peek();
		s.display();
		
	}
}