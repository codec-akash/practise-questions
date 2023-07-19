import java.util.Scanner;

class MaxVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println("Enter the k");

        int k = sc.nextInt();

        MaxVowel maxVowel = new MaxVowel();

        int maxCount = maxVowel.maxVowels(s, k);

        System.out.println("max count is "+maxCount);

        sc.close();
    }

    public int maxVowels(String s, int k){
        int maxVow = 0;
        int currentVowel = 0;
        String vowel = "aeiou";

        for (int i = 0; i < k; i++) {
            if(vowel.indexOf(s.charAt(i)) != -1){
                currentVowel++;
            }
        }

        maxVow = currentVowel;

        for (int i = k; i < s.length(); i++) {
            if(vowel.indexOf(s.charAt(i-k)) != -1){
                currentVowel--;
            }
            if(vowel.indexOf(s.charAt(i)) != -1){
                currentVowel++;
            }

            maxVow = Integer.max(maxVow, currentVowel);
        }

        return maxVow;
    }
}