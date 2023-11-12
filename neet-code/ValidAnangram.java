import java.util.Arrays;
import java.util.Scanner;

public class ValidAnangram {
    public static void main(String[] args) {
        String word1;
        String word2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st word");
        word1 = sc.nextLine();
        word2 = sc.nextLine();

        ValidAnangram validAnangram = new ValidAnangram();

        boolean checkIfIsValidAnangram = validAnangram
                .isAnagram(word1, word2);

        System.out.println(checkIfIsValidAnangram ? "is anagram" : "is not and anagram");

        sc.close();
    }

    public String sortedString(String word) {
        char tempArray[] = word.toCharArray();

        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public boolean isAnagram(String s, String t) {
        String word1 = sortedString(s);
        String word2 = sortedString(t);

        if (word1.equals(word2)) {
            return true;
        }
        return false;
    }
}
