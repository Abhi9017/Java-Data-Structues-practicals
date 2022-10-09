import java.util.*;
public class  reversestack{
	public static void pushbottom(int data,Stack<Integer> s){
		if(s.isEmpty()){
			s.push(data);
			return;
			
		}int top=s.pop();
		pushbottom(data,s);
		s.push(top);
		
	}
	public static void reverse(Stack<Integer> s){
		if(s.isEmpty()){
			return;
		}
		
		int top=s.pop();
		reverse(s);
		pushbottom(top,s);
		
	}
	
	
	
	
	
	public static void main(String args[]){
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
	   pushbottom(0,s);
	   reverse(s);
		while(!s.isEmpty()){
		System.out.println(s.peek());
		s.pop();
		}
		
	}
}