import java.util.HashMap;
import java.util.Map;

public class NorthHill extends Area{
    private static final String name = "North Hill";
    private static final String weapon = "Soul Ripper Sword";
    private static boolean metChainedMonster = false;
    private static boolean weaponFound = false;
    private static String description = """
            You are on the northern slope of a rocky hill.
            From here, you can look east toward the open road or climb south to reach the grassy southern part of the hill.
            Towards your north there is a thick forest.
            Exits: EAST → Road, SOUTH → South Hill, NORTH → West Forest""";
    private static Map<Character, String> surroundings;

    public NorthHill(){
        NorthHill.surroundings =new HashMap<>(3);
        NorthHill.surroundings.put('N', "WestForest");
        NorthHill.surroundings.put('E', "Road");
        NorthHill.surroundings.put('S', "SouthHill");
    }
    public String getName(){
        return NorthHill.name;
    }
    public String getWeapon(){
        return NorthHill.weapon;
    }
    public static String getDescription() {
        return NorthHill.description;
    }
    public static Map<Character, String> getSurroundings() {
        return NorthHill.surroundings;
    }
    public void setMetChainedMonster() {
        NorthHill.metChainedMonster = true;
    }

    @Override
    public String toString(){
        if(!weaponFound){
            if(metChainedMonster){
                String descriptionCopy = NorthHill.description;
                descriptionCopy = descriptionCopy + "\nWeapon Found: Soul Ripper(Sword)\n Added the weapon to inventory";
                weaponFound = true;
                return descriptionCopy;
            }else{
                return NorthHill.description;
            }
        }else{
            NorthHill.description = NorthHill.description + "\nWeapon already added in inventory";
        }
        return NorthHill.description;
    }
}
