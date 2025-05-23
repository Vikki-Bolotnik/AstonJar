package org.example;

interface GeometricShape {

  double calculateArea();
  String getFillColor();
  String getBorderColor();

  default double calculatePerimeter() {
    return 0.0;
  }

  default void printCharacteristics() {
    System.out.println("Площадь: " + calculateArea());
    System.out.println("Периметр: " + calculatePerimeter());
    System.out.println("Цвет фона: " + getFillColor());
    System.out.println("Цвет границ: " + getBorderColor());
    System.out.println();
  }
}