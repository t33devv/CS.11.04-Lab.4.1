import java.util.Scanner;

public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        int openCount=0, closeCount=0;
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i)=='(')
                openCount++;
            if (s.charAt(i)==')')
                closeCount++;
            if (closeCount > openCount)
                return false;
        }
        return openCount==closeCount;
    }

    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String s = "" + n, revString="";
        for (int i=0; i < s.length(); i++)
            revString += s.charAt(s.length() - i - 1);
        return revString;
    }


    // 3. encryptThis
    public static String encryptThis(String input) {
        String msg = "";
        Scanner src = new Scanner(input);
        while (src.hasNext()) {
            String word = src.next();
            char first = word.charAt(0);

            if (word.length() > 2) {
                char second = word.charAt(1), last = word.charAt(word.length() - 1);
                word = "" + first + last + word.substring(2, word.length()-1) + second;
            }
            msg += " " + (int) first + word.substring(1);
        }
        if (msg.length() > 0)
            return msg.substring(1);
        else
            return msg;
    }


    // 4. decipherThis
    public static String decipherThis(String input) {
        String msg = "";
        Scanner src = new Scanner(input);
        while (src.hasNext()) {
            String word = src.next();
            //System.out.println(word);

            int intEnd = 0;
            for (int i=1; i < word.length(); i++)
                if ('0' <= word.charAt(i) && word.charAt(i) <= '9')
                    intEnd = i;
                else
                    break;
            int first = Integer.parseInt(word.substring(0, intEnd+1));
            String rest = word.substring(intEnd+1);
            //System.out.println("" + first + "\t" + rest);

            msg += " " + (char) first;
            if (rest.length() == 1)
               msg += rest;
            else if (rest.length() == 2)
               msg += "" + rest.charAt(1) + rest.charAt(0);
            else
               msg += "" + rest.charAt(rest.length()-1) + rest.substring(1, rest.length()-1) + rest.charAt(0);
        }
        if (msg.length() > 0)
            return msg.substring(1);
        else
            return msg;
    }

}