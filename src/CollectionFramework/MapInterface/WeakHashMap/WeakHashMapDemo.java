package CollectionFramework.MapInterface.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {

        // weakHashMap works like weak reference that we have studied before.

        WeakHashMap<String, Image> imageCache1 = new WeakHashMap<>();
        imageCache1.put("img1",new Image("photo1"));
        imageCache1.put("img2",new Image("photo2"));
        System.out.println(imageCache1);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared)" + imageCache1);

        // here cache is not cleared because we have used string literals above where java treats it as strong
        // reference to make it weak we have to create a object of it.




        WeakHashMap<String, Image> imageCache2 = new WeakHashMap<>();
        imageCache2.put(new String("img1"),new Image("photo1"));
        imageCache2.put(new String("img2"),new Image("photo2"));
        System.out.println(imageCache2);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared)" + imageCache2);



    }

    public static void simulateApplicationRunning(){
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}

class Image{

    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
