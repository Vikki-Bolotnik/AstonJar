package org.example;

import org.example.Park.Attraction;

public class Main {

  public static void main(String[] args) {

    printThreeWords();

    checkSumSign();

    printColor();

    compareNumbers();

    isSumInRange(20, 50);

    printNumberSign(-3);

    isNegative(-5);

    printStringMultipleTimes("Hello", 3);

    isLeapYear(2025);

    int[] array = {1, 1, 0, 0, 1};
    invertArray(array);

    fillArray();

    multiplyLessThanSix();

    int[][] matrix = new int[5][5];
    fillDiagonals(matrix);

    createArray(5, 10);

    Product[] productsArray = new Product[5];

    productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
        "Samsung Corp.", "Korea", 5599, true);
    productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024",
        "Apple Inc.", "USA", 6499, false);
    productsArray[2] = new Product("Xiaomi Mi 15", "10.05.2024",
        "Xiaomi Corp.", "China", 3499, true);
    productsArray[3] = new Product("Huawei P60", "20.03.2024",
        "Huawei Technologies", "China", 4599, false);
    productsArray[4] = new Product("MacBook Pro 16 M3", "01.11.2024",
        "Apple Inc.", "USA", 8999, true);

    System.out.println("\n\nTask.2 Info:");
    for (Product product : productsArray) {
      product.printInfo();
    }

    Park.Attraction[] attractions = new Park.Attraction[3];
    Park park = new Park("Gorky park", attractions);

    attractions[0] = park.new Attraction("Ferris Wheel", "10:00-22:00", 5);
    attractions[1] = park.new Attraction("Shell Ride", "09:00-20:00", 4);
    attractions[2] = park.new Attraction("Pharaoh's Revenge", "10:00-21:00", 3);

    park = new Park("Gorky park", attractions);
    park.printParkInfo();
  }

  //1. Метод при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple
  public static void printThreeWords() {
    System.out.println("Task 1.\nOrange,\nBanana,\nApple");
  }

  //2. Метод, в теле которого объявите две int переменные a и b, и инициализируйте их любыми
//значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их
//сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном
//случае - “Сумма отрицательная”;
  public static void checkSumSign() {
    int a = 5;
    int b = -10;
    int sum = a + b;
    if (sum >= 0) {
      System.out.println("\nTask 2.Cумма положительная");
    } else {
      System.out.println("\nTask 2.Сумма отрицательная");
    }
  }

  //3. Метод, в теле которого задайте int переменную value и инициализируйте ее любым значением.
//Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если
//больше 100 (100 исключительно) - “Зеленый”;
  public static void printColor() {
    int value = 50;
    if (value <= 0) {
      System.out.println("\nTask 3.Красный");
    } else if (value <= 100) {
      System.out.println("\nTask 3.Желтый");
    } else {
      System.out.println("\nTask 3.Зеленый");
    }
  }

  //4. Метод, в теле которого объявите две int переменные a и b, и инициализируйте их любыми //
//значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль //
//сообщение “a >= b”, в противном случае “a < b”;
  public static void compareNumbers() {
    int a = 7;
    int b = 12;
    if (a >= b) {
      System.out.println("\nTask 4.a >= b");
    } else {
      System.out.println("\nTask 4.a < b");
    }
  }

  //5.Метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от
//10 до 20 (включительно), если да – вернуть true, в противном случае – false.
  public static boolean isSumInRange(int num1, int num2) {
    int sum = num1 + num2;
    if (sum >= 10 && sum <= 20) {
      System.out.println("\nTask 5. True");
      return true;
    }
    System.out.println("\nTask 5. False");
    return false;
  }

  //6. Метод, которому в качестве параметра передается целое число, метод должен напечатать в
//консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем
// положительным числом.
  public static void printNumberSign(int number) {
    if (number >= 0) {
      System.out.println("\nTask 6.Число положительное");
    } else {
      System.out.println("\nTask 6.Число отрицательное");
    }
  }

  //7. Метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если
//число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным
//числом.
  public static boolean isNegative(int number) {
    if (number < 0) {
      System.out.println("\nTask 7. True");
      return true;
    } else {
      System.out.println("\nTask 7. False");
      return false;
    }
  }

  //8. Метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в
//консоль указанную строку, указанное количество раз;
  public static void printStringMultipleTimes(String str, int times) {
    System.out.println("\nTask 8.");
    for (int i = 0; i < times; i++) {
      System.out.println(str);
    }
  }

  //9. Метод, который определяет, является ли год високосным, и возвращает boolean (високосный -
//true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при
//этом каждый 400-й – високосный.
  public static boolean isLeapYear(int year) {
    boolean isLeap;
    if (year % 400 == 0 || year % 4 == 0) {
      isLeap = true;
    } else if (year % 100 == 0) {
      isLeap = false;
    } else {
      isLeap = false;
    }
    System.out.println("\nTask 9. Год " + year + " является високосным: " + isLeap);
    return isLeap;
  }

  // 10.  Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
  public static void invertArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        array[i] = 1;
      } else {
        array[i] = 0;
      }
    }
    System.out.println("\nTask 10.");
    for (int num : array) {
      System.out.print(num + " ");
    }
  }

  // 11. Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
  public static int[] fillArray() {
    int[] array = new int[100];
    System.out.println("\n\nTask 11.");
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    for (int i = 0; i < 100; i++) {
      System.out.print(array[i] + " ");
    }
    return array;
  }

  // 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;
  public static void multiplyLessThanSix() {
    System.out.println("\n\nTask 12.");
    int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 6) {
        nums[i] *= 2;
      }
    }
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  // 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
// диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
// принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
  public static void fillDiagonals(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][i] = 1;
      matrix[i][matrix.length - 1 - i] = 1;
    }
    System.out.println("\n\nTask 13.");
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  // 14. Метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
// массив типа int длиной len, каждая ячейка которого равна initialValue.
  public static int[] createArray(int len, int initialValue) {
    int[] array = new int[len];
    for (int i = 0; i < len; i++) {
      array[i] = initialValue;
    }
    System.out.println("\nTask 14.");
    for (int num : array) {
      System.out.print(num + " ");
    }
    return array;
  }
}