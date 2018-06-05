// Search in a sorted array.. Jump to a block and search
//O(sqrt(n))
public class JumpSearch {
	public static int jumpSearch(int arr[], int x){
		int size = arr.length;
		
		//finding the block size to jump
		int step = (int)Math.floor(Math.sqrt(size));
		
		int prev = 0;
		while(arr[(Math.min(step, size)-1)] < x){
			prev = step;
			step +=  (int)Math.floor(Math.sqrt(size));
			if(prev >= size)
				return -1;
		}
		while (arr[prev] < x){
			prev++;
			if(prev == Math.min(step, size))
				return -1;
		}
		if(arr[prev] == x)
			return prev;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int pos = jumpSearch(a,4);
		System.out.println("element found at pos /////"+pos);
	}

}
