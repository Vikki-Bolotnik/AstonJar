package org.example;

public class TriangleAreaCalculator {

  public double calculateArea(double base, double height) {
    if (base < 0 || height < 0) {
      throw new IllegalArgumentException("Длина не может быть отрицательной");
    }
    return (base * height) / 2;
  }
}