public class quicksort{
	static int sorting(int arr[],int lb,int ub){
		  int pivot = arr[lb];
		  int start = lb;
		  int end= ub;
		  while(start < end){
			  while(arr[start] <=pivot){
				  start++;
				  
			  }
			  while(arr[end]>pivot){
				  end--;
			  }
			  if(start<end){
				  int temp2=arr[start];
				  arr[start]=arr[end];
				  arr[end]=temp2;
			  }
			  
		  }
		  int temp = arr[lb];
		  arr[lb]=arr[end];
		  arr[end]=temp;
		  return end;
	}
	static void quicksorting(int arr[],int lb ,int ub){
		int loc = sorting(arr, lb,ub);
		quicksorting( arr,lb,loc-1);
		quicksorting( arr,loc+1,ub);
	}
	
	
	
	public static void main(String args[]){
		int arr[]={8,7,6,5,4,3};
		sorting(arr,0,6);
		for(int i=0;i<6;i++){
			System.out.println(arr[i]);
		}
	}
}
