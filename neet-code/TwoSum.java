import java.util.HashMap;
import java.util.Scanner;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }
            prevMap.put(nums[i], i);
        }

        return new int[] {};
    }
}