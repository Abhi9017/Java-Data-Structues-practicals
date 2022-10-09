import java.util.*;
public class stacusingrraylist{
	public static class stack{
		static  ArrayList<Integer> al=new ArrayList<Integer>();
		public static Boolean isEmpty(){
			return al.size()==0;
		}
		
		public static void push(int data){
			al.add(data);
		}
		public static int pop(){
			if(isEmpty()){
				return -1;
			}
			int top=al.get((al.size()-1));
			al.remove((al.size()-1));
			return top;
		}
		public static int peek(){
			if(isEmpty()){
				return -1;
			}int top=al.get((al.size()-1));
			return top;
		}
	}	
	
	
	public static void main(String args[]){
		stack s=new stack();
		s.push(1);
		s.push(20);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}
}