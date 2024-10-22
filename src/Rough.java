public class Rough {
    public static void main(String[] args) {

        int x = -121;
        String str = String.valueOf(x);
        System.out.println(str.length());


        String str1 = "";
        for (int i=str.length()-1; i>=0; i--){
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);

        if(str.equals(str1)){
            System.out.println("palindrome");
        }

        
    }
}
