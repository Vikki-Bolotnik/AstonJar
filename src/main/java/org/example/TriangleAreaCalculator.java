package org.example;

public class TriangleAreaCalculator {

  public static double triangleAreaCalculator(double a, double b, double c) {
    if (a <= 0 || b <= 0 || c <= 0) {
      throw new IllegalArgumentException("Все стороны должны быть положительными");
    }

    if (a + b <= c || a + c <= b || b + c <= a) {
      throw new IllegalArgumentException("Сумма любых двух сторон должна быть больше третьей");
    }

    double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}