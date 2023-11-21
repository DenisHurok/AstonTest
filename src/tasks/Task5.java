package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public void run() {
        ArrayList<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логины. Для завершения введите пустую строку.");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            logins.add(input);
        }

        System.out.println("Логины, начинающиеся на букву 'f':");
        for (String login : logins) {
            if (login.startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}

