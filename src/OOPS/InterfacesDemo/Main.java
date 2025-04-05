package OOPS.InterfacesDemo;

public class Main {

    public static void main(String[] args) {

        //reference type is Car
        Car car = new Car();
        System.out.println(Engine.VALUE);
        System.out.println(car.a);
        car.start();
        car.stop();
        car.accelerate();
        car.brake();

        System.out.println();

        //reference type is Engine interface
        Engine car1 = new Car();
        System.out.println(Engine.VALUE);
        car1.start();
        car1.stop();
        car1.accelerate();
//        System.out.println(car1.a);
//        car1.brake();

        System.out.println();

//        Media car2 = new Car();
//        car2.start();
//        car2.stop();   //problem here that we call starts for media and it calls for engine.
//        // So, we need to create a new class

        System.out.println();

        NiceCar car3 = new NiceCar();
        car3.start();
        car3.StartPlayer();
        car3.upgradeEngine();
        car3.start();

    }
}
