public class DNF_Problem {
	static int arr[] = {0,1,2,0,2,1};
	static void swap(int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while(mid <= high) {
			switch(arr[mid]) {
			case 0 : swap(low, mid);
			low++;
			mid++;
			break;
			case 1 : mid++;
			break;
			case 2 : swap(mid, high);
			high--;
			break;
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
