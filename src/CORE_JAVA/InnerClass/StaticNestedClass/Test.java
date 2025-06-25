package CORE_JAVA.InnerClass.StaticNestedClass;

public class Test {

    public static void main(String[] args) {

        Computer com = new Computer("HP","SMX-111", "XYZ");
        com.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("Type-C");
        usb.displayInfo();

    }
}
