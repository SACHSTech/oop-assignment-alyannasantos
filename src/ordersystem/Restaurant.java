package ordersystem;

import java.util.ArrayList;

public class Restaurant {

  private String name;
  private String address;
  private ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();

  public Restaurant(String name, String address) {

    this.name = name;
    this.address = address;
  }

  public void addMenuItem(MenuItem menuItem) {

    menuItemList.add(menuItem);
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public MenuItem getMenuItem(int index) {
    if (index > menuItemList.size() - 1) {
      return null;
    }
    return menuItemList.get(index);
  }
}