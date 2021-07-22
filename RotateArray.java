public class RotateArray {
	
	static int arr[] = {1,5,2,4,3};
	static void reverse(int low, int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	static void print(String msg) {
		System.out.println(msg);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		print("Original Array");
		reverse(arr.length - k, arr.length - 1); //P1 reverse
		print("P1 Reverse");
		reverse(0, (arr.length - 1) - k); // P2 reverse
		print("P2 Reverse");
		reverse(0, arr.length - 1); // whole array reverse
		print("Whole Array Reverse");
	}

}
