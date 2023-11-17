import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"кошка", "собака", "кошка", "мышь", "собака", "кошка", "слон", "слон", "тигр", "кошка"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова: " + uniqueWords);
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество повторений каждого слова: " + wordCount);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456");
        phoneBook.add("Иванов", "789101");
        phoneBook.add("Петров", "112131");

        System.out.println("Телефоны по фамилии: " + phoneBook.get("Петров"));
    }
}
