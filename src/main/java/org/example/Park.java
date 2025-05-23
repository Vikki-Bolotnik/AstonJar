package org.example;

public class Park {

  private String parkName;
  private Attraction[] attractions;

  public Park(String parkName, Attraction[] attractions) {
    this.parkName = parkName;
    this.attractions = attractions;
  }

  public void printParkInfo() {
    System.out.println("\n\nTask 3. Park name: " + parkName);
    System.out.println("Аttractions:");
    for (Attraction attraction : attractions) {
      attraction.printAttractionInfo();
    }
  }

  class Attraction {

    private String name;
    private String workingHours;
    private double price;

    public Attraction(String name, String workingHours, double price) {
      this.name = name;
      this.workingHours = workingHours;
      this.price = price;
    }

    public void printAttractionInfo() {
      System.out.println("Attraction name: " + name);
      System.out.println("Working hours: " + workingHours);
      System.out.println("Price: " + price + " $ ");
    }
  }
}