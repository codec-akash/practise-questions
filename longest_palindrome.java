import java.util.*;

class LongestPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        String longestSub = "";
        // longestSub = longestSubString(word, len);
        longestSub = longestPalinDP(word);
        if(longestSub == null){
            System.out.println("No match");
        }else {
            System.out.println("<atch is "+ longestSub);
        }
        sc.close();
    }
    
    static String longestSubString(String word,int len){
        System.out.println("word is "+word+" len is "+len);
        for(int i = 0; i<len;i++){
            for(int j=len-1;j>i;j--){
                if(word.charAt(i) == word.charAt(j)){
                    System.out.println("check for palin is  "+word.substring(i, j+1));
                    if(isPalindrome(word.substring(i, j))){
                        return word.substring(i, j);
                    }
                }
            }
        }
        return null;
    }

    static Boolean isPalindrome(String text){
        String word = text;
        String reverseWord = "";
        for(int i = word.length()-1; i>=0 ;i--){
            reverseWord = reverseWord+word.charAt(i);
        }
        System.out.println("reverse word is "+ reverseWord);
        System.out.println("word is "+ reverseWord);
        if(reverseWord.matches(word)){
            System.out.println("matched word is "+ reverseWord);
            return true;
        }
        return false;
    }

    static String longestPalinDP(String s) {
        // Initialize variables to keep track of the 
        // longest palindrome and its length.
        int count = -1;
        String ans = "";
 
        // Get the length of the input string.
        int n = s.length();
 
        // Create a boolean 2D array to store palindrome information.
        boolean[][] dp = new boolean[n][n];
 
        // Iterate through different substring lengths.
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                // Check if the substring is of length 1 (base case).
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    // Check if the substring is of length 2 (base case).
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    // Check if the current substring is a 
                    // palindrome based on its ends.
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
 
                // Update the longest palindrome and its length if found.
                if (dp[i][j] && count < s.substring(i, j + 1).length()) {
                    ans = s.substring(i, j + 1);
                    count = ans.length();
                }
            }
        }
        return ans;
    }
}