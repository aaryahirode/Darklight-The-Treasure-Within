import java.util.HashMap;
import java.util.Map;

public class Stream extends Area{
    private final String name = "Stream";
    private final String description = """
            You are beside a gently flowing brook.
            North has a side wall of a house.
            West leads to the valley.
            South goes down the Stream.
            Exits:WEST → Valley""";
    private Map<Character, String> surroundings;

    public Stream(){
        surroundings =new HashMap<>(1);
        surroundings.put('W', "Valley");
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
