import java.util.Arrays;
import java.util.Scanner;

/**
 * KLargestElement
 */
public class KLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Kth position -");

        int k = sc.nextInt();

        KLargestElement kLargestElement = new KLargestElement();

        int res = kLargestElement.findKthLargest(arr, k);

        System.out.println("Solution is - "+res);

        sc.close();
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        return nums[nums.length-k];
    }
}