import java.util.Scanner;
import java.util.Stack;

public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String result = "";
        for (int i = String.valueOf(n).length() - 1; i >= 0; i--) {
            result += String.valueOf(n).charAt(i);
        }
        return result;
    }


    // 3. encryptThis
    public static String encryptThis(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String res;
            int ascii = word.charAt(0);
            int len = word.length();

            if (len == 2) {
                res = ascii + String.valueOf(word.charAt(1));
            } else if (len == 1) {
                res = String.valueOf(ascii);
            } else if (len == 3) {
                res = ascii + String.valueOf(word.charAt(2)) + word.charAt(1);
            } else {
                res = ascii + String.valueOf(word.charAt(len - 1)) + word.substring(2, len - 1) + word.charAt(1);
            }

            words[i] = res;
        }

        return String.join(" ", words);
    }


    // 4. decipherThis
    public static String decipherThis(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String wordClone = String.valueOf(word);
            String res;
            int len = word.length();

            int k = 0;
            while (k < word.length() && Character.isDigit(word.charAt(k))) {
                k++;
            }

            String tail = word.substring(k);
            String asciiValue = word.substring(0, k);

            res = String.valueOf((char) Integer.parseInt(asciiValue));

            len = tail.length();
            if (len == 0) {

            }
            else if (len == 1) {
                res += String.valueOf(tail.charAt(0));
            } else if (len == 2) {
                res += tail.charAt(1) + String.valueOf(tail.charAt(0));
            } else {
                String middle = len > 2 ? tail.substring(1, len - 1) : "";
                res += String.valueOf(tail.charAt(len - 1)) + middle + tail.charAt(0);
            }

            words[i] = res;
        }

        return String.join(" ", words);
    }

}
