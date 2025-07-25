import java.util.HashMap;
import java.util.Map;

public class CaveEntrance extends Area{

    private String name = "Cave";
    private String description = """
            You are in a small chamber just below the grate.
            Piles of loose rock and debris lie scattered around.
            A narrow passage leads down into the darkness, while the only way back is UP through the grate towards VALLEY.
            Exits: NORTH → Valley, SOUTH → Tunnel deeper into the cave""";
    private Map<Character, String> surroundings;

    private boolean locked = true;
    private boolean tooDark = true;
    private boolean hasSword = false;

    public CaveEntrance(){
        surroundings =new HashMap<>(2);
        surroundings.put('N', "Valley");
        surroundings.put('S', "PreBossRegion");
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

    public boolean isLocked() {
        return locked;
    }
    public boolean isTooDark() {
        return tooDark;
    }
    public boolean isHasSword() {
        return hasSword;
    }

    public void setLocked() {
        this.locked = true;
    }
    public void setTooDark() {
        this.tooDark = true;
    }
    public void setHasSword(){
        this.hasSword = true;
    }

    @Override
    public String toString() {
        if(!locked && !tooDark){
            if(!hasSword){
                return description + "\nYou don't have a weapon yet moving ahead would be fatal";
            }else{
                return description;
            }
        } else if (locked) {
            return this.locked();
        }else{
            return this.tooDark();
        }
    }
    public String locked(){
        return  """
                You are standing before a large cave.
                Cool air drifts up from the darkness below, carrying a faint smell of damp stone.
                The stream you followed disappears into a crack beside the grate.
                The grate is locked, but you can see a narrow passage leading downward into the cave beyond.
                You’ll need a key to unlock it.""";
    }
    public String tooDark(){
        return  """
                You have unlocked the heavy iron grate.
                It revealS a steep passage slanting down into pitch-black darkness.
                A cold draft rises from below, carrying the smell of damp earth.
                You can barely see a few feet into the opening.
                It’s far too dark to proceed without a light source.
                Exits:
                NORTH → Stream
                DOWN → CANNOT ENTER. FIND A TORCH""";
    }
}