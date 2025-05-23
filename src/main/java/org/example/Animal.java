package org.example;

abstract class Animal {

  private static int animalCount = 0;
  protected String name;
  protected final int maxRunDistance;
  protected final int maxSwimDistance;

  public Animal(String name, int maxRunDistance, int maxSwimDistance) {
    this.name = name;
    this.maxRunDistance = maxRunDistance;
    this.maxSwimDistance = maxSwimDistance;
    animalCount++;
  }

  public void run(int distance) {
    if (distance <= maxRunDistance) {
      System.out.println("\nЗадание 1.\n");
      System.out.println(name + " пробежал " + distance + " м");
    } else {
      System.out.println(
          name + " не может пробежать " + distance + " м (максимум " + maxRunDistance + " м)");
    }
  }

  public void swim(int distance) {
    if (maxSwimDistance == 0) {
      System.out.println(name + " не умеет плавать");
    } else if (distance <= maxSwimDistance) {
      System.out.println(name + " проплыл " + distance + " м");
    } else {
      System.out.println(
          name + " не может проплыть " + distance + " м (максимум " + maxSwimDistance + " м)");
    }
  }

  public static int getAnimalCount() {
    return animalCount;
  }
}