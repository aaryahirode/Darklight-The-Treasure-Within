import java.util.HashMap;
import java.util.Map;

public class Road extends Area{
    private final String name = "Road";
    private final String description = """
            You are on a quiet road running east-west, with paths leading in all directions.
            To the north, you see the forest.
            To the south, a valley stretches out below.
            To the east, there’s a House.
            To the west, the path climbs toward a hill.
            Exits: NORTH → East Forest, EAST → House, SOUTH → Valley, WEST → North Hill""";
    private Map<Character, String> surroundings;

    public Road(){
        surroundings =new HashMap<>(4);
        surroundings.put('N', "EastForest");
        surroundings.put('E', "House");
        surroundings.put('S', "Valley");
        surroundings.put('W', "NorthHill");
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

    @Override
    public String toString() {
        return description;
    }
}
