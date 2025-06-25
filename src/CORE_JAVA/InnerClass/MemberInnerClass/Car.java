package CORE_JAVA.InnerClass.MemberInnerClass;

public class Car {

    String model;
    boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine{

        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + " Engine started");
            }
            else{
                System.out.println("Engine is already On");
            }
        }

        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + " Engine stopped");
            }
            else{
                System.out.println("Engine is already off");
            }
        }

    }

}
