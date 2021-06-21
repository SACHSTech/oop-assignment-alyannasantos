package ordersystem;

import java.util.Date;
import java.util.ArrayList;

public class Order {

  private Date orderDate;
  private Restaurant restaurant;
  private OrderType orderType;
  private double tip;
  private double totalPrice;
  private ArrayList<OrderItem> orderItems;

  public Order() {
    orderDate = new Date();
    orderItems = new ArrayList<OrderItem>();
  }

  public void addOrderItem(MenuItem menuItem, int quantity) {
    orderItems.add(new OrderItem(menuItem, quantity));
  }

  public double calculateBill() {
    return calculateSubtotal() + calculateTax() + getTip() + orderType.calculateAdditionalCharge();
  }

  public double calculateSubtotal() {
    double subtotal = 0.0;
    for (int i = 0; i < orderItems.size(); i++) {
      OrderItem item = orderItems.get(i);
      subtotal = subtotal + (item.getQuantity() * item.getMenuItem().getPrice());
    }
    return subtotal;
  }

  public double calculateTax() {
    double tax = calculateSubtotal() * 0.13;
    return tax;    
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public Restaurant getRestaurant() {
    return restaurant;
  }

  public OrderType getOrderType() {
    return orderType;
  }

  public double getTip() {
    return tip;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public ArrayList<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public void setRestaurant(Restaurant restaurant) {
    this.restaurant = restaurant;
  }

  public void setOrderType(OrderType orderType) {
    this.orderType = orderType;
  }

  public void setTip(double tip) {
    this.tip = tip;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public void setOrderItems(ArrayList<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }
}