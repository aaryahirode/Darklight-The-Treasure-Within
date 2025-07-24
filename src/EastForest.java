import java.util.HashMap;
import java.util.Map;

public class EastForest extends Area{
    private final String name = "East Forest";
    private final String description = """
            You are in an open part of the forest.
            Sunlight filters through the tall pines, and you can just make out the lake glimmering to the east.
            A wide path runs south toward the road, while narrow trails lead west into darker woods.
            Exits: WEST → West Forest, EAST → Lake, SOUTH → Road""";
    private Map<Character, String> surroundings;

    public EastForest(){
        surroundings =new HashMap<>(3);
        surroundings.put('E', "Lake");
        surroundings.put('S', "Road");
        surroundings.put('W', "WestForest");
    }

    public String getName() {
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Map<Character, String> getSurroundings() {
        return surroundings;
    }
    @Override
    public String toString() {
        return description;
    }
}
