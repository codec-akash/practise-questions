import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * GroupAnagram
 */
public class GroupAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
        }

        GroupAnagram groupAnagram = new GroupAnagram();

        List<List<String>> grpAnaList = groupAnagram.groupAnagrams(arr);

        System.out.println("Result is " + grpAnaList);

        sc.close();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grpAnagram = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sortedStr = new String(letters);

            if (!grpAnagram.containsKey(sortedStr)) {
                grpAnagram.put(sortedStr, new ArrayList<>());
            }

            grpAnagram.get(sortedStr).add(strs[i]);
        }

        return new ArrayList<>(grpAnagram.values());
    }
}