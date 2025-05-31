package org.example;

public class MyArraySizeException extends Exception {

  public MyArraySizeException() {
    super("Массив должен быть 4х4");
  }
}