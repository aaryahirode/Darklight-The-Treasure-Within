import java.util.HashMap;
import java.util.Map;

public class NorthHill extends Area{
    private final String name = "North Hill";
    private String description = """
            You are on the northern slope of a rocky hill.
            From here, you can look east toward the open road or climb south to reach the grassy southern part of the hill.
            Towards your north there is a thick forest.
            Exits: EAST → Road, SOUTH → South Hill, NORTH → West Forest""";
    private Map<Character, String> surroundings;
    private final String weapon = "Soul Ripper Sword";
    private boolean metChainedMonster = false;
    private boolean weaponFound = false;

    public NorthHill(){
        surroundings =new HashMap<>(3);
        surroundings.put('N', "WestForest");
        surroundings.put('E', "Road");
        surroundings.put('S', "SouthHill");
    }
    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Map<Character, String> getSurroundings() {
        return surroundings;
    }
    public String getWeapon(){
        return weapon;
    }
    public boolean isWeaponFound() {
        return weaponFound;
    }
    public boolean isMetChainedMonster(){
        return metChainedMonster;
    }
    public void setMetChainedMonster() {
        metChainedMonster = true;
    }
    public void setWeaponFound(){
        this.weaponFound = true;
    }

    public void addWeapon(Player player){
        player.addItem(weapon);
        setWeaponFound();
    }

    @Override
    public String toString(){
        if(!weaponFound){
            if(metChainedMonster){
                String descriptionCopy = description;
                descriptionCopy = descriptionCopy + "\nWeapon Found: Soul Ripper(Sword)\nAdded the weapon to inventory";
                return descriptionCopy;
            }else{
                return description;
            }
        }
        return description;
    }
}
