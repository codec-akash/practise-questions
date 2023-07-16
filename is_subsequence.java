import java.util.Scanner;

/**
 * is_subsequence
 */
public class is_subsequence {

    public static void main(String[] args) {
        String str;
        String subSeq;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sub-sequence text");
        subSeq = sc.next();
        System.out.println("Enter main text");
        str = sc.next();

        is_subsequence isSub = new is_subsequence();

        boolean isSubsequence = isSub.isSubsequence(subSeq, str);

        System.out.println(isSubsequence);

        sc.close();
    }

    public boolean isSubsequence(String s, String t) {

        int j = 0;

        if(s.isEmpty()){
            return true;
        }

        if(t.isEmpty()){
            return false;
        }

        for (int i = 0; (i < t.length() && j < s.length()); i++) {

            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }

            if (j == s.length()) {
                return true;
            }

        }

        return false;
    }
}