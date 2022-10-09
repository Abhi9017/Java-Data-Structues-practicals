import  java.util.*;
public class bestinfixtopostfix{
	static Stack<Character> s=new Stack<>();
	 static StringBuffer sb=new StringBuffer();
	 public static Boolean checkinoperand(char ch){
		 return (ch >='a' && ch<='z' || ch>='A' && ch<='Z');
	 }
	 public static int checkoperatorr(char ch){
		 switch(ch){
			 case'+':
			 case'-':
			 return 1;
			  case'*':
			 case'/':
			 return 2;
			  case'^':
			 
			 return 3;
		 }
		 return -1;
	 }
	 public static void convertinfixtopostfix(String expre){
		 for(int i=0;i<expre.length();i++){
			 if(checkinoperand(expre.charAt(i))){
				 sb.append(expre.charAt(i));
			 }else if(expre.charAt(i)=='('){
				 s.push(expre.charAt(i));
			 }else if(expre.charAt(i)==')'){
				 while(!s.isEmpty() && s.peek()!='('){
					 sb.append(s.peek());
					 s.pop();
				 }if(!s.isEmpty() && s.peek()!='('){
					 System.out.print("NOT CORECT EXPRESSION");
					  return;
				 }else{
					 s.pop(); 
				 }
			 }
			 else{
				 while(!s.isEmpty() && checkoperatorr(expre.charAt(i))<=checkoperatorr(s.peek())){
					 sb.append(s.peek());
					 s.pop();
				 }
				 s.push(expre.charAt(i));
			 }
		 }
		 while(!s.isEmpty()){
			 sb.append(s.peek());
			 s.pop();
		 }
		 System.out.print(sb);
		 
	 }
	
	
	
	
	
	
	public static void main(String args[]){
		String expression="((a+(b*c))-d)";
		convertinfixtopostfix(expression);
	}
}