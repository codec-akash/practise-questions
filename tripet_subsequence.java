import java.util.*;

public class tripet_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int[] nums = new int[len];
        for(int i = 0;i<len;i++){
            nums[i] = sc.nextInt();
        }

        tripet_subsequence tri = new tripet_subsequence();

        boolean ans = tri.increasingTriplet(nums);
        
        
        System.out.println(ans);

        sc.close();
    }

    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

       for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= max1){
                max1 = nums[i];
            }else if(nums[i] <= max2){
                max2 = nums[i];
            }else {
               return true;
            }
       }
        return false;
    }
}
