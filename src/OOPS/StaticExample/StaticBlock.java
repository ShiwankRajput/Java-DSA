package OOPS.StaticExample;

public class StaticBlock {

    static int a = 2;
    static int b;

    //static block will run for the first time only when first object is created i.e when class is loaded
    static {
        System.out.println("I am static block");
        b = a*2;
    }

    public static void main(String[] args) {

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a+ " " +StaticBlock.b);

        StaticBlock.b += 1;
        System.out.println(StaticBlock.a+ " " +StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+ " " +StaticBlock.b);
    }
}
