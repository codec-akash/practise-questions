import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();

        String str2 = sc.next();

        LongestCommonSub longestCommonSub = new LongestCommonSub();

        int len = longestCommonSub.longestCommonSubsequence(str1, str2);

        System.out.println("Solutin is - "+len);

        sc.close();
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int longestSub = 0;
        int[][] dp = new int[text1.length()][text2.length()];

        for(int[] arr :dp){
            Arrays.fill(arr,-1);
        }

        longestSub = checkSubSeq(text1.length()-1, text2.length()-1, text1, text2,dp);

        return longestSub;
    }

    public int checkSubSeq(int index1, int index2,String str1,String str2,int[][] dp){

        
        if(index1<0|| index2 <0){
            return 0;
        }
        
        if(dp[index1][index2] != -1){
            return dp[index1][index2];
        }

        if(str1.charAt(index1) == str2.charAt(index2)){
            dp[index1][index2] = 1 + checkSubSeq(index1-1, index2-1, str1, str2,dp);
            return dp[index1][index2];
        }

        return dp[index1][index2] = Integer.max(checkSubSeq(index1-1, index2, str1, str2,dp), checkSubSeq(index1, index2-1, str1, str2,dp));
    }

}