import java.util.HashMap;
import java.util.Map;

public class WestForest extends Area {
    private final String name = "West Forest";
    private final String description = """
            You are in a dense, dark forest. The trees are tangled, and the ground is uneven.
            Paths lead east toward a lighter forest and south toward the northern slope of a hill.
            Exits: North -> Temple, EAST → East Forest, SOUTH → North Hill""";
    private Map<Character, String> surroundings;
    private boolean entered=false;

    public WestForest(){
        surroundings =new HashMap<>(2);
        surroundings.put('E', "EastForest");
        surroundings.put('S', "NorthHill");
        surroundings.put('N', "Temple");
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
    public void enters(){
        if(!entered){
            entered=true;
            dialogue();
        }
    }
    public void dialogue(){
        System.out.println("""
                The path you walk is clouded... but not without purpose.
                You must go... to the temple...
                There, the sage awaits you.
                He knows the truths you seek—
                and the path to what you wish to become.
                Do not delay... your time is running thin.""");
    }
    @Override
    public String toString() {
        return description;
    }
}
