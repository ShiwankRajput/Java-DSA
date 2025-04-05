package OOPS.InterfacesDemo;

public class NiceCar {

    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar(){
        engine = new ElectricEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void StartPlayer(){
        player.start();
    }

    public void StopPlayer(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new PowerEngine();
    }
}
