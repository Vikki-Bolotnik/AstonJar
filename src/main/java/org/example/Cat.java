package org.example;

class Cat extends Animal {
  private static int catCount = 0;
  private boolean isFull;

  public Cat(String name) {
    super(name, 200, 0);
    this.isFull = false;
    catCount++;
  }

  public void eat(FoodBowl bowl, int amount) {
    if (bowl.decreaseFood(amount)) {
      this.isFull = true;
      System.out.println(name + " поел и теперь сыт");
    } else {
      System.out.println(name + " не смог поесть, в миске недостаточно еды");
    }
  }

  public boolean isFull() {
    return isFull;
  }

  public static int getCatCount() {
    return catCount;
  }
}