import java.util.*;
public class infixtopostfix{
	public static Boolean checkoperand(char ch){
		return (ch>='a' && ch<='z' || ch>='A' && ch <='Z');
	}
	public static int precedene( char ch)
	{
		switch(ch)
		{
			case '+':
			case '-':
			  return 1;
			 
			 case '*':
			 case '/':
			  return 2;
			  
			  case'^':
			   return 3;
			   
			 
		}
		return -1;
		
	}
	
	static void convertintopost(String expr){
		int i;
		Stack s=new Stack<>();
		StringBuilder result=new StringBuilder(new String(""));
		for(i=0;i<expr.length();++i){
			
			if(checkoperand(expr.charAt(i))){
				result.append(expr.charAt(i));
			}
			else if(expr.charAt(i)=='('){
				s.push(expr.charAt(i));
			}
			else if(expr.charAt(i)==')')
			{
				while(!s.isEmpty() && s.peek()!="("){
					result.append(s.peek());
					s.pop();
				}
				if(!s.isEmpty() && s.peek()!=")")
				      {
					return ;
				     }else{
						 s.pop();
					 }
				
			}
			else{
				while(!s.isEmpty()&&precedene(expr.charAt(i)) <= precedene(((Character)s.peek()))){
					result.append(s.peek());
					s.pop();
				}
				s.push((expr.charAt(i)));
			}
			
			
			
			
		}
		while(!s.isEmpty()){
			result.append(s.peek());
			s.pop();
		}
		System.out.print(result);
		
		
		
	}
	
	
	
	public static void main(String args[]){
		String expression="((a+(b*c))-d)";
		convertintopost(expression);
	}
}