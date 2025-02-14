package OOPS.SingletonClass;

// singleton class are those class for which we can create only one instance, not more than that.

public class Singleton {

    A obj1 = A.getInstance();
}

// Steps to be a singleton Class is :
class A{
    static A obj = new A();  //this object is static because getInstance method is static.
    private A(){

    }

    public static A getInstance(){
        return obj;
    }
}
