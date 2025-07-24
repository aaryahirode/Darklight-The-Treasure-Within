import java.util.HashMap;
import java.util.Map;

public class SouthHill extends Area{
    private static final String name = "South Hill";
    private static final String description = """
            You are on the southern slope of the hill, overlooking the valley below.
            From here you can go north to the rocky North Hill or east down into the Valley.
            Exits: NORTH → North Hill, EAST → Valley""";
    private static Map<Character, String> surroundings;

    public SouthHill(){
        SouthHill.surroundings =new HashMap<>(2);
        SouthHill.surroundings.put('N', "NorthHill");
        SouthHill.surroundings.put('E', "Valley");
    }

    public String getName() {
        return SouthHill.name;
    }
    public static String getDescription() {
        return SouthHill.description;
    }
    public static Map<Character, String> getSurroundings() {
        return SouthHill.surroundings;
    }

    @Override
    public String toString() {
        return SouthHill.description;
    }
}
