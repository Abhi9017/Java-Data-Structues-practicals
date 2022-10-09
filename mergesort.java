public class mergesort{
	static void divide(int arr[],int lb,int ub){
		if(lb<ub){
		int mid=(lb+ub)/2;
		divide(arr,lb,mid);
		divide(arr,mid+1,ub);
		merge(arr,lb,mid,ub);
		
	}}
	static void merge(int arr[],int lb,int mid,int ub)
	{
		int i=lb;
		int j=mid+1;
		int brr []= new int[6];
		while(i<=mid && j<=ub){
			if(arr[i]<=arr[j]){
				for(int k=0;k<6;k++){
					brr[k]=arr[i];
					i++;
					k++;
				}
			}else{
				for(int k=0;k<6;k++){
					brr[k]=arr[j];
					j++;
					k++;
				
			}
		}
		
	}
	if(i>mid){
		while(j<ub){
			for(int k=0;k<=6;k++){
			brr[k]=arr[j];
					j++;
					k++;
			}
		}
	}else{
		while(j>ub){
			for(int k=0;k<=6;k++){
					brr[k]=arr[i];
					i++;
					k++;
			
		}
	}
	for(int k=0;k<=6;k++){
		System.out.println("brr[k]");
	}
	}
	}
   public static void main(String args[]){
		int arr[]={22,99,33,77,55,66};
		int lb=0;
		int ub=arr.length;
       divide(arr,lb,ub);
	
	}

}