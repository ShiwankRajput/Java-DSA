package Recursion;

public class NewStringFormation {

    public static void main(String[] args) {

        newString1("","baccad");
        System.out.println(newString2("baccad"));
        System.out.println(newString3("hqhiapplejoij"));
        System.out.println(newString4("efiapplejhf"));
    }

    static void newString1(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            newString1(p,up.substring(1));
        }
        else{
            newString1(p+ch,up.substring(1));
        }
    }

    static String newString2(String up){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return newString2(up.substring(1));
        }
        else{
            return ch + newString2(up.substring(1));
        }
    }

    //skip a particular string....
    static String newString3(String up){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return newString3(up.substring(5));
        }
        else{
            return ch + newString3(up.substring(1));
        }
    }

    //skip app if string does not starts with apple
    static String newString4(String up){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(up.startsWith("app") && !up.startsWith("apple")){
            return newString4(up.substring(3));
        }
        else{
            return ch + newString4(up.substring(1));
        }
    }
}
