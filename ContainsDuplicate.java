import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * contains_duplicate
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println("Enter the array len");
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        boolean ctnDuplicate = containsDuplicate.containsDuplicate(arr);

        System.out.println(ctnDuplicate ? "Contains Duplicate" : "Does not contains duplicate");

        sc.close();

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (uniqueSet.contains(nums[i])) {
                return true;
            } else {
                uniqueSet.add(nums[i]);
            }
        }
        return false;
    }

}