import java.util.HashMap;
import java.util.Map;

public class PreBossRegion extends Area{
    private String name = "PreBossRegion";
    private String description = """
            You step into a damp, echoing chamber deep inside the cave.
            A flickering torch dimly lights the room, revealing a massive stone door sealed with strange runes.
            The air feels heavy with an ominous presence beyond.
            In the corner, a chained helpless person sits slumped against the wall.
            His eyes glint faintly in the torchlight as he watches you approach.
            Exits: NORTH → Deeper Tunnel, EAST → Fight Boss""";
    private Map<Character, String> surroundings;

    boolean metNPC = false;

    //    LET PLAYER ENTER. IF GOES WITHOUT SWORD THEN KILLED AND BACK TO CAVE ENTRANCE.
    public PreBossRegion(){
        surroundings =new HashMap<>(2);
        surroundings.put('N', "CaveEntrance");
        surroundings.put('E', "BossArea");
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Map<Character, String> getSurroundings() {
        return surroundings;
    }

    public boolean hasMetNPC() {
        return metNPC;
    }
    public void setMetNPC() {
        this.metNPC = true;
    }

    public String npcDialogue(boolean hasSword){
        if(!metNPC){
            return npcFirstDialogue();
        }
        if(hasSword){
            return """
                    “Ah… you’ve done it. You carry the Soul Ripper...
                    Beyond that door lies its lair. Strike true, and do not falter... but beware—its soul is bound to the darkness.
                    Also remember the Soul Ripper does not give life, it takes it. Every strike will feed it—and it will hunger for you next.
                    If you survive, you may not leave this place the same.
                    Even wounded, it will try to take you with it.""";
        }else{
            return npcSecondDialogue();
        }
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
