import java.util.Scanner;

public class compressed_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        char[] charArr = new char[len];

        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = sc.next().charAt(0);
        }

        compressed_string cmp_string = new compressed_string();

        int strLen = cmp_string.compress(charArr);

        System.out.println("Length is " + strLen);

        sc.close();
    }

    public int compress(char[] chars) {

        int len = chars.length;
        int end = len - 1;

        if (len <= 1) {
            return len;
        }

        char current = chars[0];
        int ctr = 0;
        String str = "";

        for (int i = 0; i < len; i++) {
            if (current == chars[i]) {
                ctr++;
            } else {
                if (ctr > 1) {
                    str = str.concat(String.valueOf(current) + Integer.toString(ctr));
                } else {
                    str = str.concat(String.valueOf(current));
                }
                current = chars[i];
                ctr = 1;
            }
        }

        if (ctr > 1) {
            str = str.concat(String.valueOf(current) + Integer.toString(ctr));
        } else {
            str = str.concat(String.valueOf(current));
        }

        chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(chars[i]);
        }

        System.out.println(str);

        return str.length();
    }
}