import java.util.*;

public class LongestRepeatWIthReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        LongestRepeatWIthReplace longestRepeatWIthReplace = new LongestRepeatWIthReplace();

        int res = longestRepeatWIthReplace.characterReplacement(str, k);

        System.out.println("Res - " + res);

        sc.close();
    }

    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int res = 0;

        Map<Character, Integer> count = new HashMap<>();

        while (r < s.length()) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            for (int iterable_element : count.values()) {
                maxFreq = Integer.max(maxFreq, iterable_element);
            }

            if (k < ((r - l + 1) - maxFreq)) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            res = Integer.max(res, r - l + 1);
            r++;
        }

        return res;
    }
}
