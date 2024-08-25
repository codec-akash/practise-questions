
/**
 * MergeSortedLL
 */

import java.util.*;

public class LongestSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1");
        String s1 = sc.next();

        System.out.println("Enter the second len");
        String s2 = sc.next();

        LongestSubSeq longestSubSeq = new LongestSubSeq();

        int ans = longestSubSeq.checkSubSeq(s1.length() - 1, s2.length() - 1, s1, s2);

        System.out.println(ans);

        sc.close();
    }

    int checkSubSeq(int index1, int index2, String str1, String str2) {
        if (index1 < 0 || index2 < 0) {
            return 0;
        }

        if (str1.charAt(index1) == str2.charAt(index2)) {
            return 1 + checkSubSeq(index1 - 1, index2 - 1, str1, str2);
        }
        return Integer.max(checkSubSeq(index1 - 1, index2, str1, str2), checkSubSeq(index1, index2 - 1, str1, str2));
    }
}
