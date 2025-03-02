package String_StringBuilders.questions;

/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    Example 1:

        Input: s = "anagram", t = "nagaram"

        Output: true

    Example 2:

        Input: s = "rat", t = "car"

        Output: false

*/

public class Valid_Anagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

    }

    static boolean checkAnagram(String s, String t){

        int[] count = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for (int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }

        for (int i=0; i<t.length(); i++){
            count[t.charAt(i)-'a']--;
        }

        for (int i=0; i<count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }

}

