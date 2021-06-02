package ordersystem;

import java.util.Date;

public class DeliveryOrder extends OrderType {

  private String deliveryAddress;
  private double deliveryCharge;
  private Date deliveryTime;

  public DeliveryOrder(String address, double charge, Date time) {

    deliveryAddress = address;
    deliveryCharge = charge;
    deliveryTime = time;
  }

}