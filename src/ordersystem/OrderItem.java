package ordersystem;

public class OrderItem {

  private MenuItem menuItem;
  private int quantity;

  public OrderItem(MenuItem menuItem, int quantity) {
    
    this.menuItem = menuItem;
    this.quantity = quantity;
  }

  public double calculateItemTotal() {
    return menuItem.getPrice() * quantity;
  }

  public MenuItem getMenuItem() {
    return menuItem;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setMenuItem(MenuItem menuItem) {
    menuItem = menuItem;
  }

  public void setQuantity(int quantity) {
    quantity = quantity;
  }
}