import java.util.HashMap;
import java.util.Map;

public class NorthHill extends Area{
    private final String name = "North Hill";
    private final String weapon = "Soul Ripper Sword";
    private boolean metChainedMonster = false;
    private boolean weaponFound = false;
    private String description = """
            You are on the northern slope of a rocky hill.
            From here, you can look east toward the open road or climb south to reach the grassy southern part of the hill.
            Towards your north there is a thick forest.
            Exits: EAST → Road, SOUTH → South Hill, NORTH → West Forest""";
    private Map<Character, String> surroundings;

    public NorthHill(){
        surroundings =new HashMap<>(3);
        surroundings.put('N', "WestForest");
        surroundings.put('E', "Road");
        surroundings.put('S', "SouthHill");
    }
    public String getName(){
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public String getDescription() {
        return description;
    }
    public Map<Character, String> getSurroundings() {
        return surroundings;
    }
    public void setMetChainedMonster() {
        metChainedMonster = true;
    }

    @Override
    public String toString(){
        if(!weaponFound){
            if(metChainedMonster){
                String descriptionCopy = description;
                descriptionCopy = descriptionCopy + "\nWeapon Found: Soul Ripper(Sword)\n Added the weapon to inventory";
                weaponFound = true;
                return descriptionCopy;
            }else{
                return description;
            }
        }else{
            description = description + "\nWeapon already added in inventory";
        }
        return description;
    }
}
