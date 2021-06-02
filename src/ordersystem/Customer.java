package ordersystem;

public class Customer {

  private String customerName;
  private String customerAddress;
  private Order order;

  public Customer(String name, String address) {

    this.customerName = name;
    this.customerAddress = address;
    this.order = new Order();
  }

  public void chooseRestaurant(Restaurant restaurant) {
  }


}