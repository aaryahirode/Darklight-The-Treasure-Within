import java.util.HashMap;
import java.util.Map;

public class WestForest extends Area {
    private final String name = "West Forest";
    public final String description = """
            You are in a dense, dark forest. The trees are tangled, and the ground is uneven.
            Paths lead east toward a lighter forest and south toward the northern slope of a hill.
            Exits: EAST → East Forest, SOUTH → North Hill""";
    private Map<Character, String> surroundings;

    public WestForest(){
        surroundings =new HashMap<>(2);
        surroundings.put('E', "EastForest");
        surroundings.put('S', "NorthHill");
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
