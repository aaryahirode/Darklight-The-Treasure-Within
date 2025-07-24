import java.util.HashMap;
import java.util.Map;

public class Valley extends Area{
    private final String name = "Valley";
    private final String description = """
            You are in a green valley with soft grass underfoot. A stream flows nearby.
            North climbs up to the Road.
            West climbs the Southern Hill.
            South disappears into darker forest towards a cave.
            East follows the water toward the stream.
            Exits: NORTH → Road, EAST → Stream, WEST → South Hill, SOUTH → South Forest""";
    private Map<Character, String> surroundings;

    public Valley(){
        surroundings =new HashMap<>(2);
        surroundings.put('N', "Road");
        surroundings.put('E', "Stream");
        surroundings.put('S', "Cave");
        surroundings.put('W', "SouthHill");
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
