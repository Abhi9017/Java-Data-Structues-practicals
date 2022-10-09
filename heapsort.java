public class heapsort{
static void	sorting(int arr[],int n){
	
		for(int parent=(n/2)-1;parent>=0;parent--){
			heapify(arr,n,parent);
		}
		for(int i=n-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	static void heapify(int arr[],int n,int startingvalue){
		int  partialparent=startingvalue;
		int left=(2*startingvalue)+1;
		int right=(2*startingvalue)+2;
		while(arr[partialparent]<arr[left] && left<n){
			partialparent=left;
		}
		while(arr[partialparent]<arr[right] && right<n){
			partialparent=right;
		}if(partialparent!=startingvalue){
			int temp=arr[startingvalue];
			arr[startingvalue]=arr[partialparent];
			arr[partialparent]=temp;
			heapify(arr,n,partialparent);
		}
		
	}
	public static void main(String args[]){
		int arr[]={22,3,14,67,332,76};
		int n=arr.length;
		sorting(arr,6);
		for(int i=0;i<n;i++){
		System.out.println(arr[i]);
		}
	}
}