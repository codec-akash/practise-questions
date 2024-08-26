import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        LongestSubString longestSubString = new LongestSubString();

        int res = longestSubString.lengthOfLongestSubstring(str);

        System.out.println("Res - " + res);

        sc.close();
    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();

        int l = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            while (charSet.contains(s.charAt(i))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(i));
            res = Math.max(res, i - l + 1);

        }

        return res;

    }
}
