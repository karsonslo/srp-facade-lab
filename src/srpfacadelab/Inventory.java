package srpfacadelab;

import java.util.ArrayList;
import java.util.List;


public class Inventory {

    // How much the player can carry in pounds
    public int carryingCapacity;
    
    public List<Item> itemList;
    
    public Inventory(int capacity) {

        itemList = new ArrayList<Item>();
        setCarryingCapacity(capacity);
    }

    public boolean checkIfItemExistsInInventory(Item item) {
        for (Item i: itemList) {
            if (i.getId() == item.getId())
                return true;
        }
        return false;
    }

    public int calculateInventoryWeight() {
        int sum=0;
        for (Item i: itemList) {
            sum += i.getWeight();
        }
        return sum;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}