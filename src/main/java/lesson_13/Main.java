package lesson_13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+375-123-456-78-90");
        phoneBook.add("Петров", "+375-987-654-32-10");
        phoneBook.add("Иванов", "+375-111-222-33-44");
        phoneBook.add("Сидоров", "+375-555-666-77-88");
        phoneBook.add("Петров", "+375-999-888-77-66");


        System.out.println("Все записи в телефонной книге:");
        phoneBook.printAll();

        System.out.println("\nПоиск по фамилиям:");
        searchAndPrint(phoneBook, "Иванов");
        searchAndPrint(phoneBook, "Петров");
        searchAndPrint(phoneBook, "Сидоров");
        searchAndPrint(phoneBook, "Кузнецов");


        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван Иванов", "Группа 1", 1, new int[]{5, 4, 3}));
        students.add(new Student("Петр Петров", "Группа 2", 1, new int[]{2, 3, 2}));
        students.add(new Student("Сидор Сидоров", "Группа 1", 2, new int[]{4, 4, 5}));
        students.add(new Student("Анна Аннова", "Группа 3", 2, new int[]{3, 3, 3}));
        students.add(new Student("Мария Маринова", "Группа 2", 3, new int[]{2, 2, 2}));

        System.out.println("Все студенты:");
        students.forEach(System.out::println);


        removeUnderperformingStudents(students);
        System.out.println("\nСтуденты после удаления неуспевающих:");
        students.forEach(System.out::println);


        promoteStudents(students);
        System.out.println("\nСтуденты после перевода на следующий курс:");
        students.forEach(System.out::println);


        System.out.println("\nСтуденты 2 курса:");
        printStudents(students, 2);
    }


    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }


    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }


    public static void printStudents(Set<Student> students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(student -> System.out.println(student.getName()));
    }

    private static void searchAndPrint(PhoneBook phoneBook, String lastName) {
        List<String> phones = phoneBook.get(lastName);
        if (phones.isEmpty()) {
            System.out.println("Фамилия '" + lastName + "' не найдена.");
        } else {
            System.out.println("Телефоны для '" + lastName + "': " + phones);
        }
    }


}