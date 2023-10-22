import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(task1(sc.nextInt(), sc.nextInt()));
        task2(sc.nextInt());
        System.out.println(task3(sc.nextInt()));
        task4(sc.nextInt(), sc.next());
        System.out.println(task5(sc.nextInt()));
        task6();
        task7();
        task8();
        task9();
        System.out.println(Arrays.toString(task10(sc.nextInt(), sc.nextInt())));

    }

    public static Boolean task1(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void task2(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static Boolean task3(int a) {
        return a >= 0;
    }

    public static void task4(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static Boolean task5(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static void task6() {
        Integer[] arr = {1, 1, 0, 1, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task7() {
        Integer[] arr = new Integer[100];
        int b = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b;
            b++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8() {
        Integer[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task9() {
        Integer[][] arr = new Integer[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                if (j + i == 4) {
                    arr[i][j] = 1;
                }
            }
        }
        for (Integer[] num : arr) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[] task10(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
