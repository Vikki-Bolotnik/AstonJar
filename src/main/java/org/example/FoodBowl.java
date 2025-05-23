package org.example;

class FoodBowl {
  private int foodAmount;

  public FoodBowl(int initialAmount) {
    this.foodAmount = initialAmount;
  }

  public boolean decreaseFood(int amount) {
    if (amount <= 0) return false;
    if (foodAmount >= amount) {
      foodAmount -= amount;
      return true;
    }
    return false;
  }

  public void addFood(int amount) {
    if (amount > 0) {
      foodAmount += amount;
      System.out.println("В миску добавили " + amount + " еды. Теперь там " + foodAmount + " еды");
    }
  }

  public int getFoodAmount() {
    return foodAmount;
  }
}