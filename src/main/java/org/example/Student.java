package org.example;

import java.util.List;

class Student {

  String name;
  String group;
  int course;
  List<Integer> grades;

  public Student(String name, String group, int course, List<Integer> grades) {
    this.name = name;
    this.group = group;
    this.course = course;
    this.grades = grades;
  }

  public double getAverageGrade() {
    if (grades.isEmpty()) {
      return 0;
    }
    int sum = 0;
    for (int grade : grades) {
      sum += grade;
    }
    return (double) sum / grades.size();
  }
}