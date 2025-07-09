package CollectionFramework.MapInterface;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"BACK DAY");
        map.put(Day.MONDAY, "CHEST DAY");

        System.out.println(map.get(Day.MONDAY));
        System.out.println(map);

    }

}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
