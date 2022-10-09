import java.util.*;
public class reversestackpractice{
	public static class stack{
		public static void pushatbottom(Stack<Integer> s,int data){
			if(s.isEmpty()){
				s.push(data);
				return;
			}
			int top=s.pop();
			pushatbottom(s,data);
			s.push(top);
			
		}
		public  static void reverse(Stack<Integer> s){
			if(s.isEmpty()){
				return;
			}
			int t=s.pop();
			reverse(s);
			pushatbottom(s,t);
		}
		
	}
	public static void main(String args[]){
		stack r=new stack();
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		r.pushatbottom(s,100);
		r.reverse(s);
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}
}