package ordersystem;

import java.util.Date;
import java.util.ArrayList;

public class Order {

  private Date orderDate;
  private Restaurant restaurant;
  private double subtotal;
  private double tax;
  private double tip;
  private double totalPrice;
  private ArrayList<OrderItem> orderItems;

  public Order() {
    orderDate = new Date();
    orderItems = new ArrayList<OrderItem>()
  }

  public double calculateTotalPrice() {

  }

  public Restaurant getRestaurant() {
    return restaurant;
  }

  public double getSubtotal() {
    return subtotal;
  }

  public double getTax() {
    return tax;
  }

  public double getTip() {
    return tip;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setRestaurant(Restaurant restaurant) {
    this.restaurant = restaurant;
  }

  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public void setTip(double tip) {
    this.tip = tip;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }
}