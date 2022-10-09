public class har{
	static void sorting(int arr[],int n){
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
	static void heapify(int arr[],int n,int i){
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		while(arr[left]>arr[largest] && left<n){
			largest=left;
		}
		while(arr[right]>arr[largest] && right<n){
			largest=right;
		}if(largest!=i){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
	}
	
	
	
	
	
	public static void main(String args[]){
		int arr[]={88,66,55,33,5,2,4,559,339,44};
		int n=arr.length;
		sorting(arr,n);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}