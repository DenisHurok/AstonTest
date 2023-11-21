package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    public void runTasks() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер задания (1-5) или 0 для выхода:");
            int taskNumber = scanner.nextInt();

            switch (taskNumber) {
                case 1:
                    // Task1
                    Task1 task1 = new Task1();
                    System.out.println("Количество четных чисел: " + task1.countEvenNumbers());
                    break;
                case 2:
                    // Task2
                    List<String> collectionTask2 = Arrays.asList("Highload", "High", "High", "Load", "Highload", "High");
                    Task2 task2 = new Task2(collectionTask2);
                    task2.countHigh();
                    task2.getFirstElement();
                    task2.getLastElement();
                    break;
                case 3:
                    // Task3
                    List<String> collectionTask3 = Arrays.asList("f10", "f15", "f2", "f4", "f4", "f14");
                    Task3 task3 = new Task3(collectionTask3);
                    System.out.println(Arrays.toString(task3.sortAndToArray()));
                    break;
                case 4:
                    // Task4
                    Task4 task4 = new Task4();
                    task4.averageAge();
                    task4.militaryAge();
                    break;
                case 5:
                    // Task5
                    Task5 task5 = new Task5();
                    task5.run();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный номер задания. Пожалуйста, введите число от 1 до 5.");
                    break;
            }
        }
    }
}
