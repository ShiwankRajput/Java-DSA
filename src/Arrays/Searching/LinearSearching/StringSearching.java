package Arrays.Searching.LinearSearching;

//public class StringSearching {
//
//    public static void main(String[] args) {
//        String str = "shiwank";
//        char target = 't';
//        System.out.println(search(str,target));
//    }
//
//    static boolean search(String str, char target){
//        for(int i=0; i<str.length(); i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
//
//        //OR
//
//        for(char e : str.toCharArray()){
//            if(e == target){
//                return true;
//            }
//        }
//
//        return false;
//    }
//}


public class StringSearching {

    public static void main(String[] args) {

        String name = "Shiwank";
        char target = 'w';

        System.out.println("Character is present at :- " + searching(name,target));
    }

    static int searching(String name, char target){

        if(name.length() == 0){
            return -1;
        }

        for(int i=0; i<name.length(); i++ ){
            if (target == name.charAt(i)){
                return i;
            }
        }

        return -1;
    }
}
