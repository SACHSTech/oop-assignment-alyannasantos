package ordersystem;

public class MenuItem {

  private String description; 
  private double price;

  public MenuItem(String description, double price) {

    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }
}