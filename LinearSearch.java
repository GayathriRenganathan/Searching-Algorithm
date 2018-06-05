//Search the array one by one
//O(n)
public class LinearSearch {
	public static int linearSearch(int arr[], int x){
		int size = arr.length;
		// checking the element one by one in the array..
		for (int i =0; i < arr.length;i++){
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int pos = linearSearch(a,2);
		System.out.println("element found at pos ----"+pos);
	}

}
