package String_StringBuilders;

public class Palindrome {

    public static void main(String[] args) {

        String name = "abcdcba";

        System.out.println(isPalindrome(name));

    }

    static boolean isPalindrome(String s) {

        if(s.length()==0 || s == null){
            return true;
        }

        s = s.toLowerCase();
        for (int i = 0; i <= s.length() / 2; i++) {
            int start = s.charAt(i);
            int end = s.charAt(s.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }

        return true;
    }
}
