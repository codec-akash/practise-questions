import java.util.Arrays;
import java.util.Scanner;

public class MaxKsumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum -");
        int k = sc.nextInt();

        MaxKsumPair maxKsumPair = new MaxKsumPair();

        int pairs = maxKsumPair.maxOperations(arr, k);

        System.out.println("Solution is - "+pairs);

        sc.close();
    }

    public int maxOperations(int[] nums, int k) {
        int pairCnt = 0;
        int left = 0;
        int right = nums.length-1;

        Arrays.sort(nums);

        while(left < right){
            if(nums[left]+ nums[right] == k){
                pairCnt++;
                left++;
                right--;
            }else if(nums[left]+ nums[right] > k){
                right--;
            }else {
                left++;
            }
        }

        return pairCnt;
    }
}
