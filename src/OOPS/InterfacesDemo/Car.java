package OOPS.InterfacesDemo;

public class Car implements Engine, Brake, Media{

    int a = 50;

    @Override
    public void start() {
        System.out.println("It starts engine as normal car");
    }

    @Override
    public void stop() {
        System.out.println("It stops engine as normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("It accelerates engine as normal car");
    }

    @Override
    public void brake() {
        System.out.println("It brake as normal car");
    }
}
