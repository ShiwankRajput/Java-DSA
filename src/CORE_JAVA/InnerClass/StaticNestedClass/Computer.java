package CORE_JAVA.InnerClass.StaticNestedClass;

public class Computer {

    private String brand;
    private String model;

    private OperatingSystem os;

    public OperatingSystem getOs() {
        return os;
    }

    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem{

        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer : " + model + ", OS : " + osName);
        }

    }

    static class USB{

        private String usbType;

        public USB(String usbType){
            this.usbType = usbType;
        }

        public void displayInfo(){
            System.out.println("USB type :- " + usbType);
        }


    }


}
