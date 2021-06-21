package ordersystem;

public class Customer {

  private String customerName;
  private Order order;

  public Customer(String name) {

    this.customerName = name;
    this.order = new Order();
  }

  public void chooseRestaurant(Restaurant restaurant) {
    order.setRestaurant(restaurant);
  }

  public void addToCart(MenuItem menuItem, int quantity) {
    order.addOrderItem(menuItem, quantity);
  }

  public void chooseOrderType(OrderType orderType) {
    order.setOrderType(orderType);
  }

  public void addTip(double tip) {
    order.setTip(tip);
  }

  public void generateReceipt() {
    System.out.println("**************************************");
    System.out.println("Customer name: " + customerName);
    System.out.println("Order date: " + order.getOrderDate());
    OrderType orderType = order.getOrderType();
    if (orderType instanceof DeliveryOrder) {
      System.out.println("Deliver to: " + ((DeliveryOrder)orderType).getDeliveryAddress());
    }
    System.out.println(" ");
    for (int i = 0; i < order.getOrderItems().size(); i++) {
      OrderItem item = order.getOrderItems().get(i);
      System.out.println( item.getQuantity() + " " + item.getMenuItem().getDescription() + " $ " + item.calculateItemTotal());
    }
    System.out.println(" ");
    System.out.println("Subtotal:        $ " + order.calculateSubtotal());
    System.out.println("Tax:             $ " + order.calculateTax());
    if (orderType instanceof DeliveryOrder) {
      System.out.println("Delivery charge: $ " + orderType.calculateAdditionalCharge());
    }
    System.out.println("Tip:             $ " + order.getTip());
    System.out.println("Total:           $ " + order.calculateBill());
    System.out.println("**************************************");
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String name) {
    this.customerName = name;
  }




}