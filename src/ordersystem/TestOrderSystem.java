package ordersystem;

public class TestOrderSystem {

  public static void main(String[] args) {

    //Create Restaurant and Menu
    Restaurant restaurantOne = new Restaurant("Mcdonalds", "123 Mackenzie Drive");
    restaurantOne.addMenuItem(new MenuItem("Nuggets", 10.99));
    restaurantOne.addMenuItem(new MenuItem("Burger ", 4.99));
    restaurantOne.addMenuItem(new MenuItem("Fries  ", 3.99));
    restaurantOne.addMenuItem(new MenuItem("Soda   ", 1.99));

    Restaurant restaurantTwo = new Restaurant("Tim Hortons", "28 Castlemore Avenue");
    restaurantTwo.addMenuItem(new MenuItem("Wrap              ", 10.99));
    restaurantTwo.addMenuItem(new MenuItem("Breakfast Sandwich", 4.99));
    restaurantTwo.addMenuItem(new MenuItem("Donut             ", 3.99));
    restaurantTwo.addMenuItem(new MenuItem("Iced Coffee       ", 1.99));

    //Create a customer
    Customer customer = new Customer("Aly");

    //Customer selects the Restaurant
    customer.chooseRestaurant(restaurantOne);

    //Customer orders food
    customer.addToCart(restaurantOne.getMenuItem(0), 4);
    customer.addToCart(restaurantOne.getMenuItem(1), 4);
    customer.addToCart(restaurantOne.getMenuItem(2), 3);

    //Customer choose Pickup or Delivery
    customer.chooseOrderType(new DeliveryOrder("434 King St."));

    //Customer checkouts, add tip, and gets total bill
    customer.addTip(3.00);
    customer.generateReceipt();
  }
}