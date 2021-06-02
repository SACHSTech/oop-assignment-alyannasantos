package ordersystem;

public class TestOrderSystem {

  public static void main(String[] args) {

    //Create Restaurant and Menu
    Restaurant restaurant = new Restaurant("Mcdonalds", "123 Mackenzie Drive");
    restaurant.addMenuItem(new MenuItem("Nuggets", 10.99));
    restaurant.addMenuItem(new MenuItem("Burger", 4.99));
    restaurant.addMenuItem(new MenuItem("Fries", 3.99));
    restaurant.addMenuItem(new MenuItem("Soda", 1.99));

    //Create a customer


    //Customer selects the Restaurant

    //Customer orders food

    //Customer choose Pickup or Delivery

    //Customer checkouts, add tip, and gets total bill
  }
}