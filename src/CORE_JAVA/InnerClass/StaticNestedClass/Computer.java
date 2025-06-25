package CORE_JAVA.InnerClass.StaticNestedClass;

public class Computer {

    private String brand;
    private String model;

    private OperatingSystem os;

    public OperatingSystem getOs(){
        return os;
    }

    Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem{

        private String osName;

        OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Model: " + model + ", OS: " + osName);
        }

    }

    static class USB{

        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB type is : " + type);
        }


    }

}
