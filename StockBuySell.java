public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,3,6,4};
		int profit = 0;
		int finalProfit = 0;
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			profit = arr[i] - min;
			finalProfit = Math.max(finalProfit, profit);
			min = Math.min(min, arr[i]);
		}
		System.out.println("Total Profit :: "+ finalProfit);
	}

}
