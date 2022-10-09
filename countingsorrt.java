public class countingsorrt{
	static  void sorting(int arr[]){
		int n= arr.length;
		int count[]=new int[100];
		int output[] = new int[n];
		for(int i=0;i <100;++i){
			count[i]=0;
		}
		for(int i=0;i<n;++i){
			++count[arr[i]];
		}
		for(int i=1;i<=99;++i){
			count[i]+=count[i-1];
		}
		for(int i=n-1;i>=0;i--){
		output[count[arr[i]]-1]=arr[i];
		--count[arr[i]];
		}
		for(int i=0;i<n;++i){
			arr[i]=output[i];
		}
		
	}
	public static void main(String args[]){
		int arr[]={88,77,66,1,2,99,67,88,77,66,2,1,67};
		sorting(arr);
		for(int i=0;i<arr.length;++i){
			System.out.println(arr[i]);
		}
	}
}