import java.util.*;
public class arraylist{
	public static void main(String args[]){
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		
	  list.add(1);
	  list.add(2);
	  list.add(3);
	  list.add(4);
	  list.add(5);
	  list.add(6);
	  System.out.println(list);
	  int element=list.get(0);
	  System.out.println(element);
	 
	 //add between at particular
	 
	 list.add(1,100);
	 
	  System.out.println(list);

   //remove /repace 
   list.set(0,400);
    System.out.println(list);
	
	list.remove(3);
	 System.out.println(list);
	 
	 int size=list.size();
	 System.out.println(size);
	 for(int i=0; i<list.size();i++){
		 System.out.println(list.get(i));
	 }
      //soritng
	  
	  Collections.sort(list);
	  System.out.println(list);
	  
	  
	  
	  
	}
}