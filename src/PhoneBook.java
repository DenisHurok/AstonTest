import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        List<String> phones = directory.get(surname);
        if (phones == null) {
            phones = new ArrayList<>();
            directory.put(surname, phones);
        }
        phones.add(phoneNumber);
    }
    public List<String> get(String surname) {
        List<String> phones = directory.get(surname);
        if (phones == null) {
            return Collections.emptyList();
        } else {
            return phones;
        }
    }
}