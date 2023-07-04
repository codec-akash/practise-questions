import java.util.*;

class SumToIntergrs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        String res = addAlternative(word1, word2);

        System.out.print(res);

        sc.close();

    }

    public static String addAlternative(String s1, String s2) {
        if (s1.isEmpty()) {
            return s2;
        }
        if (s2.isEmpty()) {
            return s1;
        }

        int lenWord1 = s1.length();
        int lenWord2 = s2.length();

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < Integer.max(lenWord1, lenWord2); i++) {
            if (i < lenWord1) {
                stringBuffer.append(s1.charAt(i));
            }
            if(i < lenWord2){
                stringBuffer.append(s2.charAt(i));
            }
        }

        return stringBuffer.toString();
    }
}