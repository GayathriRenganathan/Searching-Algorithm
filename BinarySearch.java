//Search based on sorted array.Find the middle position and then decide which branch to search
//O(logn)
public class BinarySearch {
	public static int binarySearch(int arr[],int l, int r, int x){
		
		if(r>=l){
		//Searching in the sorted Array.. first find the middle position
		int mid = l+(r-l)/2;
		//
		if(arr[mid] > x){
			binarySearch(arr, 0, mid-1,x);
		}
		if(arr[mid] < x){
			binarySearch(arr,mid+1,r,x);
		}
		if(arr[mid] == x)
			return mid;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int pos = binarySearch(a,0,4,0);
		System.out.println("element found at pos /////"+pos);
	}

}
