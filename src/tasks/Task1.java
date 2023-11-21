package tasks;

import java.util.*;

public class Task1 {
    public Task1() {
    }
    public int countEvenNumbers() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(Arrays.toString(numbers.stream().toArray()));
        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
