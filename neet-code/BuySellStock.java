import java.util.*;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the len");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BuySellStock buySellStock = new BuySellStock();

        int res = buySellStock.maxProfit(arr);

        System.out.println("Solution is - " + res);

        sc.close();
    }

    public int maxProfit(int[] prices) {

        int i = 0;
        int j = 1;

        int profit = 0;

        while (j < prices.length) {
            if (prices[i] <= prices[j]) {
                profit = Integer.max(profit, prices[j] - prices[i]);

            } else {
                i = j;
            }
            j++;
        }

        return profit;
    }
}

// prices=[5,1,5,6,7,1,10]
