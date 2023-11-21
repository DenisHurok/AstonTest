package tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Task4 {
    Collection<Student> students = Arrays.asList(new Student("Дмитрий", 17, Gender.MAN),
            new Student("Максим", 20, Gender.MAN),
            new Student("Екатерина", 20, Gender.WOMAN),
            new Student("Михаил", 28, Gender.MAN));

    private enum Gender {
        MAN,
        WOMAN
    }

    public void averageAge() {
        int sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                sum += student.getAge();
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.printf("Средний возраст студентов мужского пола: %.2f%n", average);
    }

    public void militaryAge() {
        System.out.println("Студенты, которым грозит получение повестки в этом году:");
        for (Student student : students) {
            if (student.getGender() == Gender.MAN && student.getAge() >= 18 && student.getAge() <= 27) {
                System.out.println(student.getName());
            }
        }
    }

    private class Student {
        private final String name;
        private final Integer age;
        private final Task4.Gender gender;

        public Student(String name, Integer age, Task4.Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Task4.Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}