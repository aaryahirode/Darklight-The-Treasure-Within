import java.util.HashMap;
import java.util.Map;

public class House extends Area{
    private String name = "House";
    private String description = """
            You are inside a house. There’s a table with a torch and some batteries.
            The only door leads back west to the road, though you see a faint trail heading south toward the stream.
            Exits: WEST to Road, SOUTH to Stream""";
    private Map<Character, String> surroundings;

    private boolean isLocked = true;

    public House(){
        surroundings =new HashMap<>(2);
        surroundings.put('S', "Stream");
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

    public void setLocked() {
        isLocked = true;
    }

    @Override
    public String toString() {
        return description;
    }
}
