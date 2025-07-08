package CollectionFramework.MapInterface.WeakHashMap;

import java.lang.ref.WeakReference;

public class WeakAndStrongReferenceDemo {

    public static void main(String[] args) {

        // StrongReference -->
        Phone obj1 = new Phone("Apple","15 pro max");
        System.out.println(obj1);
        obj1 = null;
        System.out.println(obj1);


        // WeakReference -->
        WeakReference<Phone> obj = new WeakReference<>(new Phone("Apple","16 pro max"));
        System.out.println(obj.get());
        System.gc();
        try{
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(obj.get());

    }
}

class Phone{

    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
