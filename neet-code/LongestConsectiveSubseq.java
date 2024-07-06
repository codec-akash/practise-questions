import java.util.*;
import java.util.Scanner;

public class LongestConsectiveSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of element");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LongestConsectiveSubseq longestConsectiveSubseq = new LongestConsectiveSubseq();

        int res = longestConsectiveSubseq.longestConsecutive(arr);

        System.out.println(res);

        sc.close();
    }

    public int longestConsecutive(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        if (arr.size() == 0) {
            return 0;
        }

        Collections.sort(arr);
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == arr.get(i + 1)) {
                continue;
            }
            System.out.println(arr.get(i) + " " + arr.get(i + 1));
            if (arr.get(i) + 1 == arr.get(i + 1)) {
                count++;
            } else {
                if (max <= count) {
                    max = count;
                }
                count = 0;
            }
        }

        max = count > max ? count : max;

        return max + 1;
    }
}
