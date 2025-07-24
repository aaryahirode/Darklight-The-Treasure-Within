import java.util.HashMap;
import java.util.Map;

public class Road extends Area{
    private static final String name = "Road";
    private static final String description = """
            This is a road""";
    private static Map<Character, String> surroundings;

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
    public static String getDescription() {
        return description;
    }
    public Map<Character, String> getSurroundings() {
        return surroundings;
    }
}
