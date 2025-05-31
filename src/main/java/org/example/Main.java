package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Set<Student> students = new HashSet<>();

    students.add(new Student("Вика", "Группа A", 1, Arrays.asList(4, 5, 3)));
    students.add(new Student("Егор", "Группа B", 2, Arrays.asList(2, 2, 3)));
    students.add(new Student("Дима", "Группа C", 1, Arrays.asList(5, 5, 5)));
    students.add(new Student("Настя", "Группа D", 3, Arrays.asList(3, 4, 2)));

    removeStudentsWithLowAverage(students);

    promoteStudents(students);

    System.out.println("Студенты на 1 курсе:");
    printStudents(students, 1);

    System.out.println("Студенты на 2 курсе:");
    printStudents(students, 2);

    System.out.println("Студенты на 3 курсе:");
    printStudents(students, 3);

    System.out.println("Студенты на 4 курсе:");
    printStudents(students, 4);
  }

  public static void removeStudentsWithLowAverage(Set<Student> students) {
    Set<Student> toRemove = new HashSet<>();
    for (Student student : students) {
      if (student.getAverageGrade() < 3) {
        toRemove.add(student);
      }
    }
    students.removeAll(toRemove);
  }

  public static void promoteStudents(Set<Student> students) {
    for (Student student : students) {
      if (student.getAverageGrade() >= 3) {
        student.course += 1;
      }
    }
  }

  public static void printStudents(Set<Student> students, int course) {

    for (Student student : students) {
      if (student.course == course) {
        System.out.println(student.name);
      }
    }
  }
}