package CollectionFramework.MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*

    Custom classes and predefined classes for HashMap ;-

*/

public class HashCodeAndEqualsMethod {

    public static void main(String[] args) {

        // here custom class has same name in object of Person but, it produces different hashcode.
        // Therefore, we need to overwrite and implement the hashcode and equals methods of Object class.
        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Shiwank",1);
        Person p2 = new Person("Tarang",2);
        Person p3 = new Person("Shiwank",1);

        map.put(p1,"Developer");  //hashcode1 --> index1
        map.put(p2,"Designer");   //hashcode2 --> index2
        map.put(p3,"Police");     //hashcode1 --> index1 --> equals() method calls --> replace

        System.out.println("HashMapSize : " + map.size());  // if equals method is not overridden then size would be three
        System.out.println("Value of p1 : " + map.get(p1));
        System.out.println("Value of p2 : " + map.get(p2));
        System.out.println("Value of p3 : " + map.get(p3));

        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p3));


        // Predefined class in Map produces same hashcode for same key
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Shiwank",1);  //hashcode1 --> index1
        map2.put("Tarang",2);   //hashcode2 --> index2
        map2.put("Shiwank",1);  //hascode1 --> index1 --> equals() method calls --> replace [value of key Shiwank replaces with 3]

        System.out.println(map2.size());

    }

}

class Person{

    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    // we need to override this due to custom classes.
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        Person other = (Person) obj;

        return id == other.getId() && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public String toString() {
        return "id:" + id + ", name:" + name;
    }

}
