import java.util.*;
import java.io.*;
public class radixsort{
	static int getmax(int arr[],int n){
		int maxi=arr[0];
		for(int i=1;i<n;i++){
			
		if(arr[i]>maxi){
			maxi=arr[i];
		}
	  }
		return maxi;
	}
	
	  static void sorting(int arr[],int n){
		  int max=getmax(arr,n);
		  for(int placevalue=1;(max/placevalue)>0;placevalue*=10){
			  counting(arr,n,placevalue);
		  }
	  }
		 static void counting(int arr[],int n,int placevalue){
			  
			  int output[]=new int[n];
			  
			  int count[]=new int[10];
			  Arrays.fill(count,0);
			  for(int i=0;i<n;i++){
				  ++count[(arr[i]/placevalue)%10];
			  }
			  for(int i=1;i<10;i++){
				 count[i]+=count[i-1];
			  }
			  for(int i=n-1;i>=0;i--){
			 output[count[(arr[i]/placevalue)%10]-1]=arr[i];
				  			--count[(arr[i]/placevalue)%10];	   

			  }
			  for(int i=0;i<=n-1;++i){
				   arr[i]=output[i];
			   }
		  }
		  
 
		  
	  
	public static void main(String args[]){
		int arr[]={99,888,33,555,11,23,66,888};
		int n=arr.length;
		sorting(arr,n);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}