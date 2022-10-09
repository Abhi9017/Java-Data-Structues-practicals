import java.util.ArrayList;
public class arayliststring{
	public static void main(String args[]){
		ArrayList<String> al= new ArrayList<String>();
		al.add("Abhilash chinnala");
		al.add("Abhilash chinnala");
		al.add("Abhilash chinnala");
		al.add("Abhilash chinnala");
		al.add("Abhilash chinnala");
		al.set(0,"chinnala");
		al.add(1,"c");
		al.remove(2);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	}
}