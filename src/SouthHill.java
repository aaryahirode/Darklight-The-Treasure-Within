import java.util.HashMap;
import java.util.Map;

public class SouthHill extends Area{
    private final String name = "South Hill";
    private final String description = """
            You are on the southern slope of the hill, overlooking the valley below.
            From here you can go north to the rocky North Hill or east down into the Valley.
            Exits: NORTH → North Hill, EAST → Valley""";
    private Map<Character, String> surroundings;

    public SouthHill(){
        surroundings =new HashMap<>(2);
        surroundings.put('N', "NorthHill");
        surroundings.put('E', "Valley");
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
