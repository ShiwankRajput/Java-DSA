package String.StringBuilders.questions;

public class Palindrome {

    public static void main(String[] args) {

        String name = "abcdcba";

        System.out.println(isPalindrome(name));
        System.out.println(isPalindrome1(name));

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


    static boolean isPalindrome1(String s){

        if(s.length()==0 || s == null){
            return true;
        }

        int i=0;
        int j=s.length()-1;

        while(i<s.length()-1 && i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
