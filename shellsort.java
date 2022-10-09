public class shellsort{
	static void sorting(int arr[]){
		int n=arr.length;
		for(int gap=n/2;gap>=1;gap=gap/2){
			for(int j=gap;j<n;j++){
				for(int i=j-gap;i>=0;i=i-gap){
					if(arr[i+gap]>arr[i]){
						break;
					}else{
						int temp=arr[i+gap];
						arr[i+gap]=arr[i];
						arr[i]=temp;
					}
				}
			}
		}
		
	}
        public static void main(String args[]){
      int arr[]={55,44,333,77,88};
       sorting(arr);
	   for(int i=0;i<arr.length;i++){
		   System.out.println(arr[i]);
	   }

}}