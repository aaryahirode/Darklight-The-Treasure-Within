import java.util.HashMap;
import java.util.Map;

public class Stream extends Area{
    private final String name = "Stream";
    private final String description = """
            You are beside a gently flowing brook.
            North follows it toward the lake.
            West leads to the valley.
            Northwest connects to the Well House.
            South reveals a metal grate set into the ground, leading into darkness below.
            Exits: NORTH → House, WEST → Valley""";
    private Map<Character, String> surroundings;

    public Stream(){
        surroundings =new HashMap<>(2);
        surroundings.put('N', "House");
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
