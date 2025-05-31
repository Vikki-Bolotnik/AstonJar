package org.example;

public class MyArrayDataException extends Exception {
  public MyArrayDataException(int row, int col, String value) {
    super("Нечисловые данные в [" + row + "][" + col + "]: '" + value + "'");
  }
}