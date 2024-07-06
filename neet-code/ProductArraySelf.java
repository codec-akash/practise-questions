import java.util.Scanner;

public class ProductArraySelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ProductArraySelf productArraySelf = new ProductArraySelf();

        int[] ans = productArraySelf.productExceptSelf(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }

    public int[] productExceptSelf(int[] nums) {
        // int[] arr = new int[nums.length];

        // for (int i = 0; i < arr.length; i++) {
        // int sum = 1;
        // for (int j = 0; j < arr.length; j++) {
        // if (i == j) {
        // continue;
        // } else {
        // sum *= nums[j];
        // }
        // }
        // arr[i] = sum;
        // }

        int[] res = new int[nums.length];

        int left = 1;
        int right = 1;

        for (int i = 0; i < res.length; i++) {
            res[i] = left;
            left *= nums[i];
        }

        for (int i = res.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }
}
