// finds the position based on the distribution 
// O(log log n)
public class InterpolationSearch {
	public static int interpolationSearch(int arr[], int n, int x){
		int lo =0; int hi = n-1;
		while(lo <= hi && x >= arr[lo] && x <= arr[hi]){
			int pos = lo+ (((hi - lo)/(arr[hi] - arr[lo])) * (x - arr[lo]));
			System.out.println("pos value --"+pos);
			if(arr[pos] ==  x){
				return pos;
			}
			if(arr[pos] < x){
				lo = pos +1;
			}
			if(arr[pos] > x){
				hi = pos -1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6};
		int pos = interpolationSearch(a,5,4);
		System.out.println("element found at pos /////"+pos);
	}

}
