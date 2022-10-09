
public class merges{
	
	static void sorting(int arr[],int lb,int ub){
		if(lb<ub){
			int  mid=(lb+ub)/2;
			sorting(arr,lb,mid);
			sorting(arr,mid+1,ub);
			merge(arr,lb,mid,ub);
		}
		
	}
	static void  merge(int arr[],int lb,int mid,int ub){
		int i=lb;
		int n=arr.length;
		int j=mid+1;
		int k=lb;
		int brr[]=new int[n];
		while(i<=mid && j<=ub){
			if(arr[i]<=arr[j]){
		        brr[k]=arr[i];
				i++;
				k++;
			  }else{
				  brr[k]=arr[j];
				  k++;
				  j++;
			  }
		}
		if(i>mid){
			while(j<=ub){
				brr[k]=arr[j];
				j++;
				k++;
			}
		}else{
			while(i<=mid){
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
		for(k=lb;k<=ub;k++)
		{
			arr[k]=brr[k];
		
		}
		
    }

	public static void main(String args[]){
		int arr[]={55,44,33,88,11,22,4,3};
		int lb=0;
		int ub=arr.length;
		sorting(arr,lb,ub);
	      for(int i=0;i<ub;i++)
		{
			System.out.println(arr[i]);
		
		}
		
		
		
	}
}