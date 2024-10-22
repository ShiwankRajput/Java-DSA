package functions;

/*shadowing basically means overlapping the value of higher
 one by lower one */
public class Shadowing {

    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);   //90
        int x = 40; /* the class variable or
         instance variable is shadowed by this variable*/
        System.out.println(x);   //40
        print();  //90
    }

    static void print(){
        System.out.println(x);
    }
}
