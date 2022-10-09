import java.util.*;
public class pushatbottomstack{
	public static void pushbottom(Stack<Integer> s,int data){
		if(s.isEmpty()){
			s.push(data);
			return;
		}
		int top=s.pop();
		pushbottom(s,data);
		s.push(top);
	}
	public static void main(String args[]){
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
	    pushbottom(s,0);
		
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
		
		
	}
}