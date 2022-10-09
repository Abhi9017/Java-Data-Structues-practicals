public class insertsort{
	public static void sorting(int arr[]){
		int n=arr.length;
		for(int i=1;i<=n-1;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	} 
	public static void main(String args[]){
		int arr[]={66,44,88,22,99,122,566,3,2,4};
		int n=arr.length;
		sorting(arr);
		System.out.println("after sorting");
		for(int i=0;i<=n-1;i++){
			System.out.println(arr[i]);
		}
	}
}