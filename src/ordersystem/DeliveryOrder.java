package ordersystem;

import java.util.Date;

public class DeliveryOrder extends OrderType {

  private String deliveryAddress;
  private double deliveryCharge;
  private Date deliveryTime;

  public DeliveryOrder(String address) {

    deliveryAddress = address;
  }

  //Flat rate of $5 for delivery
  public double calculateAdditionalCharge() {
    return 5.0;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public double getDeliveryCharge() {
    return deliveryCharge;
  }

  public Date getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryAddress(String address) {
    this.deliveryAddress = address;
  }

  public void setDeliveryChage(double charge) {
    this.deliveryCharge = charge; 
  }

  public void setDeliveryTime(Date dateTime) {
    this.deliveryTime = dateTime;
  }

}