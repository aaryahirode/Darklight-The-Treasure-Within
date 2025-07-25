import java.util.HashMap;
import java.util.Map;

public class Temple extends Area{
    private final String name = "Temple";
    private final String description = """
        The temple stands in quiet majesty, its stone walls worn by time but still proud. 
        Sunlight filters through cracks in the high ceiling, casting golden beams onto the moss-covered floor. 
        The scent of incense lingers in the air, and ancient carvings line the pillars like silent watchers.

        At the far end of the hall, an old sage sits cross-legged atop a raised platform, surrounded by silence and wisdom.
        Exits: SOUTH → West Forest""";
    private Map<Character, String> surroundings;
    private boolean metSage = false;

    public Temple(){
        surroundings =new HashMap<>(1);
        surroundings.put('S', "WestForest");
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
    public String npcDialogue() {
        if (!metSage) {
            return firstSageDialogue();
        }
        return repeatSageDialogue();
    }
    private String firstSageDialogue() {
        metSage = true;
        return """
            The sage slowly opens his eyes and gazes at you with a calm, knowing look.
            'You’ve come far, seeker,' he says, his voice deep and steady.
            'Beyond the valley lies a cave — one that holds the treasure you seek.
            
            But beware... no one who has entered its depths has ever returned.
            The cave does not yield to strength or fire. It opens only to the key...
            hidden deep within the graveyard beyond the lake.'

            He leans forward slightly and adds in a quiet tone:
            'Knowledge will guide you... but only courage will carry you through.'""";
    }
    private String repeatSageDialogue() {
        return """
            The sage regards you once again with his quiet, timeless stare.
            
            'The cave still waits,' he says softly.
            'And so does your fate, deep in the graveyard beyond the lake.'
            He nods solemnly.
            
            'Return only when your heart carries both wisdom... and the key.'""";
    }
    @Override
    public String toString() {
        return description;
    }
}
