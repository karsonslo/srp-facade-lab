package srpfacadelab;
import java.util.List;



public class RpgFacade {
    public static final int MAX_CARRYING_CAPACITY = 1000;

    private final IGameEngine gameEngine;

    private int health;

    private int maxHealth;

    private int armour;

    private List<Item> inventory;

    private RpgPlayer player;

    public RpgFacade(IGameEngine gameEngine) {
        this.gameEngine = gameEngine;
        player = new RpgPlayer(gameEngine);
        player.inventory = new Inventory(MAX_CARRYING_CAPACITY);
        inventory = player.inventory.itemList;
    }

    public void useItem(Item item) {
        player.useItem(item); 
    }
    
    public boolean pickUpItem(Item item) {
        return player.pickUpItem(item);
    }

    public void calculateStats() {
        player.calculateStats();
    }

    public void takeDamage(int damage) {
        player.takeDamage(damage);
    }

    public int getHealth() {
        return player.getHealth();
    }

    public void setHealth(int health) {
        player.setHealth(health);;
    }

    public int getMaxHealth() {
        return player.getMaxHealth();
    }

    public void setMaxHealth(int maxHealth) {
        player.setMaxHealth(maxHealth);
    }

    public int getArmour() {
        return player.getArmour();
    }

    private void setArmour(int armour) {
        player.setArmour(armour);
    }

    public boolean checkIfItemExistsInInventory(Item item) {
        return player.inventory.checkIfItemExistsInInventory(item);
    }
    public int calculateInventoryWeight() {
        return player.inventory.calculateInventoryWeight();
    }
    public int getCarryingCapacity() {
        return player.inventory.getCarryingCapacity();
    }

    public void setCarryingCapacity(int carryingCapacity) {
        player.inventory.setCarryingCapacity(carryingCapacity);
    }

}
