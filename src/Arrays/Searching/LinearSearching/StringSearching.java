package Arrays.Searching.LinearSearching;

public class StringSearching {

    public static void main(String[] args) {
        String str = "shiwank";
        char target = 't';
        System.out.println(search(str,target));
    }

    static boolean search(String str, char target){
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        //OR

//        for(char e : str.toCharArray()){
//            if(e == target){
//                return true;
//            }
//        }

        return false;
    }
}
