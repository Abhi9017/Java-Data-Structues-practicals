import java.util.*;
public  class  stackusingarray{
	
	public static class stack{
		int n=10;
	   int arr[]=new int[10];
	   int top=-1;
		void push(){
			if(top==(n-1)){
				System.out.print("overflow stack");
			}else{
				for(int p=0;p<10;p++){
				Scanner sc=new Scanner(System.in);
				System.out.print("enter data to push");
				int i=sc.nextInt();
				top++;
				arr[top]=i;
				System.out.println("Item Inserted");
			}}
		}
		void pop(){
			if(top==-1){
				System.out.print("Underflow condition");
			}else{
				int data=arr[top];
				top--;
				System.out.print("poped"+" "+data);
			}
		}
		void display(){
			System.out.print("Items are:");
		    for(int i=top;i>=0;i--){
				System.out.println(arr[i]);
			}
		
		}
		
	}
	public static void main(String args[]){
		
	   stack s=new stack();
	   s.push();
	   s.display();
	   s.pop();
	   s.display();
	   
		
	}
}