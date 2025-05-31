package org.example;

public class Main {

  public static void main(String[] args) {
    String[][] goodArray = {
        {"1", "2", "3", "4"},
        {"5", "6", "7", "8"},
        {"9", "10", "11", "12"},
        {"13", "14", "15", "16"}
    };

    String[][] badSizeArray = {
        {"1", "2"},
        {"3", "4"}
    };

    String[][] badDataArray = {
        {"1", "2", "3", "4"},
        {"5", "6", "7", "8"},
        {"9", "10", "11", "12"},
        {"13", "14", "15", "W"}
    };

    testArray(goodArray);
    testArray(badSizeArray);
    testArray(badDataArray);

    demoArrayIndexException();
  }

  static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
    if (array.length != 4 || array[0].length != 4) {
      throw new MyArraySizeException();
    }

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        try {
          sum += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException(i, j, array[i][j]);
        }
      }
    }
    return sum;
  }

  static void testArray(String[][] array) {
    try {
      System.out.println("Сумма: " + processArray(array));
    } catch (MyArraySizeException e) {
      System.out.println("Ошибка: " + e.getMessage());
    } catch (MyArrayDataException e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }

  static void demoArrayIndexException() {
    int[] arr = {1, 2, 3};
    try {
      System.out.println("Элемент с индексом 3: " + arr[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Поймали ошибку: " + e);
    }
  }
}