import java.util.Scanner;

public class reverse_vowle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] word = str.toLowerCase().toCharArray();

        String vowel = "aeiou";

        int start = 0;
        int end = word.length-1;

        while (start<end) {
            while (start<end && vowel.indexOf(word[start]) == -1 ) {
                System.out.print("check start - "+start);
                start++;
            }
            while (start<end && vowel.indexOf(word[end]) == -1) {
                System.out.print("check end - "+end);
                end--;
            }
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }

        System.out.println(new String(word));

        scanner.close();
    }
}
