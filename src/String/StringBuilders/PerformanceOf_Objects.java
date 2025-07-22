package String.StringBuilders;

public class PerformanceOf_Objects {

    public static void main(String[] args) {

        String value = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            value = value + ch;
        }

        System.out.println(value);

        /* here everytime a new object is being created using + operator therefore, it
        takes more space which also comsumes more time, so in place of this we use concept
        of stringBuilder(this is used to change the same object that does not create a new object
        everytime,where reference of that object also remain same.) */


        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char) ('a'+i);
            sb.append(ch);
        }

        System.out.println(sb);
        sb.deleteCharAt(0);
        sb.reverse();
        System.out.println(sb);

    }
}
