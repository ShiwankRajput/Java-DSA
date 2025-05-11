package CORE_JAVA.OOPS.OOPS_2.SingletonClass;

class SingletonClass {

    static SingletonClass obj = new SingletonClass();

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return obj;
    }

}

class TestSingletonClass{

    public static void main(String[] args) {

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

    }

}
