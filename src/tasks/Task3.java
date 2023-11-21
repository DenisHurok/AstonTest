package tasks;

import java.util.*;

public class Task3 {
    private List<String> collection;

    public Task3(List<String> collection) {
        this.collection = collection;
    }

    public String[] sortAndToArray() {
        Collections.sort(collection, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(Integer.parseInt(s1.substring(1)), Integer.parseInt(s2.substring(1)));
            }
        });

        return collection.toArray(new String[0]);
    }

}
