//package String_StringBuilders.questions;
//
//public class NonRepeatingChar {
//
//    public static void main(String[] args) {
//
//        String s = "aabbccc";
//
//        System.out.println(repeatingChar(s));
//    }
//
//    static char repeatingChar(String s){
//
//        for (int i=0; i<s.length(); i++){
//            int count=0;
//            for (int j=0; j<s.length(); j++){
//                if(s.charAt(i) == s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==1){
//                return s.charAt(i);
//            }
//        }
//
//        return '$';
//    }
//
//    static char repeatingChar1(String s){
//
//        int[] count = new int[26];
//
//        for(int i=0; i<s.length(); i++) {
//            count[s.charAt(i) - 'a']++;
//        }
//
//        for(int i=0; i<s.length(); i++){
//            count[s.charAt(i)-'a']--;
//        }
//
//        for(int i=0; i<count.length; i++){
//            if(count[i]!=0){
//
//            }
//        }
//    }
//}
