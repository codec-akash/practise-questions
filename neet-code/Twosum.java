import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");

        int target = sc.nextInt();

        Twosum twosum = new Twosum();

        int[] ans = twosum.twoSum(arr, target);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        sc.close();
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int curSum = numbers[left] + numbers[right];

            if (curSum == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            } else if (curSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}
