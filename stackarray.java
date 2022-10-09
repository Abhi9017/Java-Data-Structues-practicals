import java.util.*;
public class stackarray{
	  public static class stack{
		  
		  Scanner sc=new Scanner(System.in);
		 
		  int size=sc.nextInt();
		  int arr[]=new int[size];
		  int top=-1;
		  void push(){
			  if(top==size-1){
				  System.out.print("oveflow stack unable to push");
			  }
			  for(int i=0;i<size;i++){
			  Scanner sc=new Scanner(System.in);
		       System.out.println("enter element to push ");
		      int e=sc.nextInt();
			  top++;
			  arr[top]=e;
			   System.out.println("element pushed "+" "+e);
		  }
		  }
		  void pop(){
			  if(top==-1){
				  System.out.print("underflow stack unable to delete");
			  }int data=arr[top];
			  top--;
			  System.out.println(data+" "+"is deleted");
		  }
		void display(){
			System.out.println("Items are:");
		    for(int i=top;i>=0;i--){
				System.out.println(arr[i]);
			}
		  
	  }
	  }
	
	public static void main(String args[]){
		stack s=new stack();
		Scanner sc=new Scanner(System.in); 
		System.out.print("pree smth to push");
		int d=sc.nextInt();
		switch(d)
		{
			case 1:
			{
				s.push();
				break;
			}
			case 2:
			{
				s.pop();
				break;
			}
			case 3:
			{
				s.display();
				break;
				
			}
			default:
			{
				System.out.print("exited");
			}
		}
	}

}