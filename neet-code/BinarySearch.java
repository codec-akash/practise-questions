import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        // [-1,0,2,4,6,8] -- 4
        // [-1,0,2,4,6,8] -- 3
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");

        int target = sc.nextInt();

        BinarySearch binarySearch = new BinarySearch();

        int ans = binarySearch.search(arr, target);

        System.out.println(ans);

        sc.close();
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;

            } else if (nums[mid] < target) {
                left = mid + 1;

            } else {

                return mid;
            }
        }

        return -1;
    }
}
