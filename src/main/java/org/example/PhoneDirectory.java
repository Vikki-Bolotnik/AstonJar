package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDirectory {

  public static void addNumber(HashMap<String, ArrayList<String>> book, String name, String number) {
    book.putIfAbsent(name, new ArrayList<>());
    book.get(name).add(number);
  }

  public static ArrayList<String> getNumbers(HashMap<String, ArrayList<String>> book, String name) {
    return book.getOrDefault(name, new ArrayList<>());
  }
}