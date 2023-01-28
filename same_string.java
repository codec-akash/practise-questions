import java.util.*;

class SameString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // * input string
        System.out.println("Enter a word");
        String word = sc.nextLine();
        
        int len = word.length();
        System.out.println("len of word is "+ len);
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        int left = 0; int right = 0; int max = 0;
        while(right<len){
            if(map.containsKey(word.charAt(right))){
                left = Math.max(map.get(word.charAt(right))+1, left);
            }
            map.put(word.charAt(right), right);
            max = Math.max(max, right-left+1);
            right++;
        }

        System.out.println("max length = "+max);

        sc.close();
    }
}