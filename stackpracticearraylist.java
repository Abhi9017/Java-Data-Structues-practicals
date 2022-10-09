import java.util.*;
public class stackpracticearraylist{
	public static class stack{
	static	ArrayList<Integer> al=new ArrayList<Integer>();
		public static Boolean isEmpty(){
			return al.size()==0;
		}
		public static void   push(int data){
			
				al.add(data);
				
			}
			public static int pop(){
				if(isEmpty()){
					System.out.print("Null LIST CREAED");
					return -1;
				}int data=al.get((al.size()-1));
				al.remove((al.size()-1));
				System.out.println("popped element is"+data);
				return (al.size()-1);
			}
			public static void display(){
				for(int i=(al.size()-1);i>=0;i--){
					System.out.println(al.get(i));
				}
			}
			
		}
	
	
	
	public static void main(String args[]){
	 	stack s=new stack();
		s.push(1);
		s.push(20);
		s.push(3);
		s.push(4);
		s.display();
		s.pop();
		s.display();
		
	}
}