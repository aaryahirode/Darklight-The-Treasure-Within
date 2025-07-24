import java.util.HashMap;
import java.util.Map;

public class Lake extends Area{
    private final String name = "Lake";
    public static final String description = """
        You stand at the edge of a quiet lake, its surface shimmering under a pale sky.
        The air is still, yet heavy with an unspoken tension.
        To the east, a weathered gate leads into an eerie graveyard cloaked in mist.
        To the west, a dense forest stirs — the East Forest, whispering secrets between the trees.
        To the south, a crooked house sits alone, half-sunken and forgotten.
        Exits: EAST → Graveyard, WEST → East Forest, SOUTH → House""";
    private Map<Character, String> surroundings;
    private static final String boat = """
        A small, creaky boat rocks gently by the shore.
        A shadowy boatman says, "If you wish to travel swiftly across the lake or to nearby places, just say the word."
        You can choose to board the boat and set your destination.
        """;

    public Lake(){
        surroundings =new HashMap<>(3);
        surroundings.put('E', "GraveYard");
        surroundings.put('S', "house");
        surroundings.put('W', "EastForest");
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
    public String getBoat() {
        return boat;
    }
    @Override
    public String toString() {
        return description;
    }
}
