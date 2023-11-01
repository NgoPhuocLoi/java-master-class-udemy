package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("a", "Aribe");
        m.put("b", "Beto");
        m.put("c", "Carlo");

        m.forEach((k, v) -> System.out.println("%s: %s".formatted(k, v)));

        String d = m.getOrDefault("d", "Daika");
        System.out.println(d);

        m.put("a", "Aribe 2");
        m.putIfAbsent("b", "Beto2");
        System.out.println();
        m.forEach((k, v) -> System.out.println("%s: %s".formatted(k, v)));

        m.merge("a", "Aribe 3", (prev, current) -> prev + " " + current);
        System.out.println();
        m.forEach((k, v) -> System.out.println("%s: %s".formatted(k, v)));

        String[] keys = new String[] { "a", "b", "e", "f" };
        for (String key : keys) {
            m.compute(key, (k, v) -> (v == null) ? "New value of key " + key : v + " after compute");
        }
        System.out.println();
        m.forEach((k, v) -> System.out.println("%s: %s".formatted(k, v)));

        m.replaceAll((k, v) -> "__%s".formatted(v));
        System.out.println();
        m.forEach((k, v) -> System.out.println("%s: %s".formatted(k, v)));

        Set<String> keyView = m.keySet();
        var values = m.values();
        System.out.println("\nkeySet(): " + keyView);
        System.out.println("values(): " + values);
        m.remove("a");
        System.out.println("keySet() after removing 'a': " + keyView);
        System.out.println("values() after removing 'a': " + values);
    }
}