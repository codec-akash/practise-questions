import java.util.*;

/**
 * product_of_self
 */
public class product_of_self {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        int[] sum = new int[len];
        int prd = 1;
        int zeroCtr = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] != 0) {
                prd *= nums[i];
            }else {
                zeroCtr++;
            }
        }

        for (int i = 0; i < sum.length; i++) {
            if(zeroCtr  >= 2){
                sum[i] = 0;
            }else if(zeroCtr == 1){
                if(nums[i] != 0){
                    sum[i] = 0;
                }else {
                    sum[i] = prd;
                }
            }else {
                sum[i] = prd/nums[i];
            }
        }

        System.out.println("Solution -- ");

        for(int i = 0; i<sum.length;i++){
            System.out.println(sum[i]);
        }



        sc.close();
    }
}