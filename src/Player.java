import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;
    public ArrayList<String> inventory;

    public Player(String name){
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public void addItem(String item){
        this.inventory.add(item);
    }
    public void addItem(String... item){
        this.inventory.addAll(new ArrayList<>(List.of(item)));
    }
    public boolean hasItem(String item) {
        return inventory.contains(item);
    }

    @Override
    public String toString() {
        return name + "\nInventory:\n" + inventory;
    }
}
