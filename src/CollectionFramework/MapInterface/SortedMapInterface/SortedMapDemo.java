package CollectionFramework.MapInterface.SortedMapInterface;

import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        // Treemap in java is implemented using red-black tree, due to which time complexity of getting
        // putting and remove element is O(log n)

        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Shiwank",89);
        sortedMap.put("Dev",70);
        sortedMap.put("Tarang",90);
        sortedMap.put("Rana",80);
        sortedMap.put("Anmol",89);

        System.out.println(sortedMap);   // keys are sorted according to name

        SortedMap<Integer, String> sortedMap1 = new TreeMap<>();
        sortedMap1.put(89,"Shiwank");
        sortedMap1.put(70,"Dev");
        sortedMap1.put(90,"Tarang");
        sortedMap1.put(99,"Rana");
        sortedMap1.put(92,"Anmol");

        System.out.println(sortedMap1);  // keys are sorted according to numbers


        /*

            methods -->

         */

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap1.headMap(90));  // toKey : 90 is excluded
        System.out.println(sortedMap1.tailMap(90));  // fromKey : 90 is included
        System.out.println(sortedMap1.subMap(70,90));  // 90 is excluded here


        // in TreeMap constructor either we can pass a comparator or we can implement comparable in class for
        // which we have decided a key. Example -->

        // (1) - using comparator :
        SortedMap<Integer, String> sortedMap3 = new TreeMap<>((a,b) -> b - a);  // sort in descending
        sortedMap3.put(89,"Shiwank");
        sortedMap3.put(70,"Dev");
        sortedMap3.put(90,"Tarang");
        sortedMap3.put(99,"Rana");
        sortedMap3.put(92,"Anmol");

        System.out.println(sortedMap3);


        // (2) - using comparable :
        SortedMap<Student, Integer> sortedMap4 = new TreeMap<>();
        sortedMap4.put(new Student("Shiwank",21),89);
        sortedMap4.put(new Student("Tarang",19),90);
        sortedMap4.put(new Student("Dev",22),80);

        System.out.println(sortedMap4);



        /*

            NavigableMap Interface -->

         */

        NavigableMap<Integer,String> sortedMap5 = new TreeMap<>();
        sortedMap5.put(89,"Shiwank");
        sortedMap5.put(90,"Tarang");
        sortedMap5.put(92,"Deshwal");
        sortedMap5.put(95,"Dev");

        System.out.println(sortedMap5);
        System.out.println(sortedMap5.lowerKey(90)); // 89
        System.out.println(sortedMap5.lowerKey(89)); // null
        System.out.println(sortedMap5.ceilingKey(91)); // 95
        System.out.println(sortedMap5.higherEntry(95)); // null
        System.out.println(sortedMap5.ceilingKey(95));  // 95

    }

}

class Student implements Comparable<Student>{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.getAge() - this.age;
    }
}
