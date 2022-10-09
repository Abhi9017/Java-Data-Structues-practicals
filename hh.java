public class hh
{
	public static void  sorting(int arr[],int n)
	{
		for(int parent=(n/2)-1;parent>=0;parent--)
		{
			heap(arr,n,parent);
		}
		for(int i=n-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heap(arr,i,0);
		}
	}
	static void heap(int arr[],int n,int stater)
	{
		int l=stater;
		int left=(2*stater)+1;
		int right=(2*stater)+2;
		while(arr[left]>arr[l] && left<n)
		
		{
			l=left;
		}
			while(arr[right]>arr[l] && right<n)
		
		{
			l=right;
		}
	         if(l !=stater)
			 {
				 int tempr=arr[stater];
				 arr[stater]=arr[l];
				 arr[l]=tempr;
				 heap(arr,n,l);
			 }
		
	}
	public static void main(String args[])
	{
		hh h=new hh();
		int arr[]={1,7,6,43,2,4,6};
		int n=arr.length;
		System.out.print(n);
		h.sorting(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
}