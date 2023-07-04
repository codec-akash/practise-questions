import java.util.*;

class LongestPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        String longestSub = "";
        longestSub = longestSubString(word, len);
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
}