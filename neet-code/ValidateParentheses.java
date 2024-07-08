import java.util.*;

public class ValidateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");

        String s = sc.nextLine();

        ValidateParentheses validateParentheses = new ValidateParentheses();

        boolean ans = validateParentheses.isValid(s);

        System.out.println(ans);

        sc.close();
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < s.length(); index++) {
            char bracket = s.charAt(index);

            if (brackets.containsKey(bracket)) {
                if (!stack.isEmpty() && stack.peek().equals(brackets.get(bracket))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(bracket);
            }
        }

        return stack.isEmpty();
    }
}

// "[]"
