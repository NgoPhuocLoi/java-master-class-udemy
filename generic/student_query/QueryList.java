package student_query;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends Student & QueryItem> {
    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    }

    public List<T> getMatches(String field, String value) {
        List<T> matches = new ArrayList<>();
        for (T item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public static <T extends QueryItem> List<T> getMatches(List<T> list, String field, String value) {
        List<T> matches = new ArrayList<>();
        for (T item : list) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

}
