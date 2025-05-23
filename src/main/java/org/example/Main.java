package org.example;

public class Main {

  public static void main(String[] args) {

    //Задание 1.
    Dog dog1 = new Dog("Тузик");
    Dog dog2 = new Dog("Бобик");
    Cat cat1 = new Cat("Мурзик");
    Cat cat2 = new Cat("Тишка");

    dog1.run(400);
    dog2.run(600);
    dog1.swim(5);
    dog2.swim(15);

    cat1.run(150);
    cat2.run(250);
    cat1.swim(10);

    FoodBowl bowl = new FoodBowl(30);
    System.out.println("\nВ миске " + bowl.getFoodAmount() + " еды");

    Cat[] cats = {cat1, cat2};
    for (Cat cat : cats) {
      cat.eat(bowl, 15);
    }

    System.out.println("\nСостояние котов:");
    for (Cat cat : cats) {
      if (cat.isFull()) {
        System.out.println(cat.name + ": сыт");
      } else {
        System.out.println(cat.name + ": голоден");
      }
    }

    bowl.addFood(20);
    cat2.eat(bowl, 15);
    if (cat2.isFull()) {
      System.out.println(cat2.name + ": сыт");
    } else {
      System.out.println(cat2.name + ": голоден");
    }

    System.out.println("\nВсего животных: " + Animal.getAnimalCount());
    System.out.println("Собак: " + Dog.getDogCount());
    System.out.println("Котов: " + Cat.getCatCount());

    //Задание 2.
    GeometricShape circle = new Circle(5.0, "Красный", "Черный");
    GeometricShape rectangle = new Rectangle(4.0, 6.0, "Синий", "Белый");
    GeometricShape triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Желтый");

    System.out.println("\nЗадание 2. \nХарактеристики круга:");
    circle.printCharacteristics();

    System.out.println("Характеристики прямоугольника:");
    rectangle.printCharacteristics();

    System.out.println("Характеристики треугольника:");
    triangle.printCharacteristics();
  }
}