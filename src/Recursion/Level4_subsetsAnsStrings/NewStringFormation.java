package Recursion.Level4_subsetsAnsStrings;

public class NewStringFormation {

    public static void main(String[] args) {

        System.out.println("New String after skipping a character --> " + newString1("","abbacd"));
        System.out.println("New String after skipping a character --> " + newString2("abbacd"));

        System.out.println("New string after skipping string apple --> " + newString3("bacapplegf"));
        System.out.println("New string after skipping string app not apple --> " + newString4("bacapplgf"));

    }

    //skipping a character ---->

    //case1: taking process string as argument
    static String newString1(String p, String up){

        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return newString1(p,up.substring(1));
        }

        return newString1(p+ch,up.substring(1));
    }

    //case2: taking process string within function body
    static String newString2(String up){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return newString2(up.substring(1));
        }

        return ch + newString2(up.substring(1));
    }



    //skipping a particular string ---->

    //case1: starting with apple
    static String newString3(String up){

        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return newString3(up.substring(5));
        }

        return up.charAt(0) + newString3(up.substring(1));
    }

    //case2: skipping app not apple
    static String newString4(String up){

        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return newString4(up.substring(3));
        }

        return up.charAt(0) + newString4(up.substring(1));
    }

}
