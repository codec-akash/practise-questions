import java.util.Scanner;

public class MaxAvgSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the window len -");
        int k = sc.nextInt();

        MaxAvgSubArray maxAvgSubArray = new MaxAvgSubArray();

        double res = maxAvgSubArray.findMaxAverage(arr, k);

        System.out.println("Solution is - " + res);

        sc.close();
    }

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        max = sum;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];
            max = Integer.max(max, sum);
        }

        return (double)max/k;
    }
}