package l8collections;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class HashAndEquals implements Comparable {


    public HashAndEquals() {
    }

    public static void main (String[] args) {
        Map<Integer, String> myUniverseMap = new HashMap<>();
        myUniverseMap.put(Integer.valueOf(1), "Cat Nikolay");
        myUniverseMap.put(Integer.valueOf(2), "Cat Petr");

        for (Map.Entry<Integer, String> item :  myUniverseMap.entrySet()) {
        System.out.printf("%d '%s' \n", item.getKey(), item.getValue());
    }}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}

