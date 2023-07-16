import java.util.*;

public class move_zeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        move_zeros moveZero = new move_zeros();

        moveZero.moveZeroes(arr);

        sc.close();
    }

    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for(int i = j;i<nums.length;i++){
            nums[i] = 0;
        }

        System.out.println("Solution is - ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}