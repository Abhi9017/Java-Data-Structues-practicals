public class selectionsort{
	public static void sorting(int []arr){
		for(int i=0;i<=arr.length;i++){
			int min=i;
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[j]<arr[min]){
					int temp=arr[min];
					arr[min]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
public static void main(String args[]){
	int arr[]={224,66,88,11,33,44,6};
	sorting(arr);
	for(int i=0;i<=arr.length-1;i++){
	System.out.println(arr[i]);
	}
}
}