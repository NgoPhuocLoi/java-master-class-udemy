package immutableObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SideEffectWhenUsingMutableObjectForKeyOfMap {
    public static void main(String[] args) {
        Map<StringBuilder, Integer> counts = new HashMap<>();

        String[] names = new String[] { "Aris", "Boba" };

        List<StringBuilder> repeatNames = getRepeatNameList(names);

        for (var name : repeatNames) {
            counts.merge(name, 1, Integer::sum);
        }

        System.out.println(counts);
    }

    public static List<StringBuilder> getRepeatNameList(String[] names) {
        List<StringBuilder> result = new ArrayList<>();
        int repeatCount = 3;
        for (String name : names) {
            for (int i = 0; i < repeatCount; i++) {
                result.add(new StringBuilder(name));
            }
            repeatCount++;
        }
        return result;
    }
}
