public class binarysearch{
	public static int search(int arr[],int lb,int ub,int key){
		while(lb<ub){
			int mid=(lb+ub)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(arr[mid]>key){
			ub= mid-1;
			}
			else{
				lb=mid+1;
			}
		}
		return -1;
	}
	

public static void main(String args[]){
	int arr[]={2,3,4,5,6,7,8,9};
	int lb=0;
	int ub=arr.length;
	int key = 9;
	int position = search(arr,lb,ub,key);
	if(position==-1){
		System.out.println("abhi");
	}else{
		System.out.println(key+"at"+position);
	}
	
}
}