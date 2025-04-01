package OOPS.Singleton;

public class SingletonClass {

    static SingletonClass obj1 = new SingletonClass();

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return obj1;
    }

}

