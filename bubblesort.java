public class bubblesort{
	public static void sorted(int arr[]){
		int n=arr.length;
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[i];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	
	public static void main(String args[]){
		int arr[]={77,55,33,00,44,66};
		int n=arr.length;
		System.out.println("after sorted");
		sorted(arr);
		for(int i=0;i<=n-1;i++){
			System.out.println(arr[i]);
		}
	}
}