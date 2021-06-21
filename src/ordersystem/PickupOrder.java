package ordersystem;

import java.util.Date;

public class PickupOrder extends OrderType {

  private Date pickupTime;

  public PickupOrder() {

  }

  public Date getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(Date pickupTime) {
    this.pickupTime = pickupTime;
  }

  //No additional charge for pickup
  public double calculateAdditionalCharge() {
    return 0.0;
  }

}