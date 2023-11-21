package tasks;

import java.util.*;

public class Task2 {
    private List<String> collection;

    public Task2(List<String> collection) {
        this.collection = collection;
    }

    public void countHigh() {
        int count = 0;
        for (String s : collection) {
            if (s.equals("High")) {
                count++;
            }
        }
        System.out.println("кол-во high: " + count);
    }

    public void getFirstElement() {
        String firstElement;
        if (collection.isEmpty()) {
            firstElement = "0";
        } else {
            firstElement = collection.get(0);
        }
        System.out.println("Последний элемент: " + firstElement);
    }

    public void getLastElement() {
        String lastElement;
        if (collection.isEmpty()) {
            lastElement = "0";
        } else {
            lastElement = collection.get(collection.size() - 1);
        }
        System.out.println("Последний элемент: " + lastElement);
    }
}
