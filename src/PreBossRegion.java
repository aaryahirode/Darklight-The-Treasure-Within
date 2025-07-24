import java.util.HashMap;
import java.util.Map;

public class PreBossRegion extends Area{
    private String name = "PreBossRegion";
    private String description = """
            You step into a damp, echoing chamber deep inside the cave.
            A flickering torch dimly lights the room, revealing a massive stone door sealed with strange runes.
            The air feels heavy with an ominous presence beyond.
            Exits:
            North → Deeper Tunnel
            East → Fight Boss""";

//    LET PLAYER ENTER. IF GOES WITHOUT SWORD THEN KILLED AND BACK TO CAVE ENTRANCE.
private Map<Character, String> surroundings;

    public PreBossRegion(){
        surroundings =new HashMap<>(2);
        surroundings.put('N', "CaveEntrance");
        surroundings.put('E', "BossArea");
    }

    boolean metNPC = false;

    public String npcDialogue(){
        if(!metNPC){
            return npcFirstDialogue();
        }
        return npcSecondDialogue();
    }

    public String npcFirstDialogue(){
        metNPC = true;
        return """
                Hi..i..Hiii.. I-I'm Knight Bernahl. The beast inside defeated and chained me as a warning for those who wish to trespass.
                You dare face the beast beyond this door?
                Foolish traveler… No mortal blade can harm it.
                If you seek victory, you must climb the North Hill outside this cave.
                There lies the Soul Ripper Sword, the only weapon that can pierce its thick skin.
                Seek the blade and THE TREASURE IS YOURS...!!!!!""";
    }
    public String npcSecondDialogue(){
        return """
                Back again? You still have not claimed the Sword of Soul Ripper?
                Fool! The creature beyond this door grows restless… I can hear it stirring!
                Go to the North Hill!
                Only there will you find the blade strong enough to strike the beast.""";
    }

    @Override
    public String toString() {
        return description;
    }
}
