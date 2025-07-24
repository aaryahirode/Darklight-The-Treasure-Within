import java.util.HashMap;
import java.util.Map;

public class Road extends Area{
    private static final String name = "Road";
    private static final String description = """
            You are on a quiet road running east-west, with paths leading in all directions.
            To the north, you see the forest.
            To the south, a valley stretches out below.
            To the east, there’s a House.
            To the west, the path climbs toward a hill.
            Exits: North to Forest, East to Well House, South to Valley and West to Hill""";
    private static Map<Character, String> surroundings;

    public Road(){
        Road.surroundings =new HashMap<>(4);
        Road.surroundings.put('N', "EastForest");
        Road.surroundings.put('E', "House");
        Road.surroundings.put('S', "Valley");
        Road.surroundings.put('W', "NorthHill");
    }

    public String getName() {
        return Road.name;
    }
    public static String getDescription() {
        return Road.description;
    }
    public Map<Character, String> getSurroundings() {
        return Road.surroundings;
    }

    @Override
    public String toString() {
        return Road.description;
    }
}
