import java.util.HashMap;
import java.util.Map;

public class House extends Area{
    private String name = "House";
    private String description = """
            You step into a small, dimly lit stone house.
            Dusty shelves line the walls, holding old tools and a few scattered supplies.
            A wooden table sits in the center of the room.
            A single door leads back outside.
            Exits: WEST → Road""";
    private Map<Character, String> surroundings;

    private boolean isLocked = true;
    private boolean pickedItems = false;

    public House(){
        surroundings =new HashMap<>(1);
        surroundings.put('W', "Road");
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Map<Character, String> getSurroundings() {
        return surroundings;
    }

    public boolean isLocked() {
        return isLocked;
    }
    public boolean isPickedItems() {
        return pickedItems;
    }

    public void setLocked() {
        isLocked = false;
    }
    public void setPickedItems() {
        pickedItems = true;
    }

    public void readLetter(){
        System.out.println("""
                HOPE YOU ARE ENJOYING OUR GAME!
                Creators:
                    ◉ Om Gupta (github → https://github.com/OmGupta1719)
                    ◉ Aarya Hirode (github → https://github.com/aaryahirode)""");
    }

    @Override
    public String toString() {
        if(pickedItems){
            return description;
        }else{
            return """
            You step into a small, dimly lit stone house.
            Dusty shelves line the walls, holding old tools and a few scattered supplies.
            A wooden table sits in the center of the room.
            On the table, you see:
            A sturdy brass lamp (torch) with an empty battery slot.
            A pair of fresh batteries, still sealed in their paper wrapping.
            A letter with something written on it.
            A single door leads back outside.
            Exits: WEST → Road""";
        }
    }
}
