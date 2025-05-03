package CORE_JAVA.InnerClass.StaticNestedClass;

public class Test {

    public static void main(String[] args) {

        Computer c = new Computer("HP","ABC","XYZ");
        c.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");

    }

}
