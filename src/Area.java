import java.util.HashMap;
import java.util.Map;

public class Area {
    public Map<Character, String> getSurroundings() {
        return null;
    }
}

class AreaMap{
    HashMap<String, Area> map;
    public  AreaMap(){
        map = new HashMap<>();
        map.put("Road", new Road());
        map.put("NorthHill", new NorthHill());
        map.put("SouthHill", new SouthHill());
        map.put("Stream", new Stream());
        map.put("EastForest", new EastForest());
        map.put("WestForest", new WestForest());
        map.put("House", new House());
        map.put("CaveEntrance", new CaveEntrance());
        map.put("Lake", new Lake());
        map.put("Graveyard", new Graveyard());
        map.put("Temple", new Temple());
        map.put("Valley", new Valley());
        map.put("PreBossRegion", new PreBossRegion());
    }

    public Area getArea(String name){
        return switch(name.toLowerCase()){
            case "road" -> map.get("Road");
            case "northhill" -> map.get("NorthHill");
            case "southhill" -> map.get("SouthHill");
            case "stream" -> map.get("Stream");
            case "eastforest" -> map.get("EastForest");
            case "westforest" -> map.get("WestForest");
            case "house" -> map.get("House");
            case "caveentrance" -> map.get("CaveEntrance");
            case "lake" -> map.get("Lake");
            case "graveyard" -> map.get("Graveyard");
            case "temple" -> map.get("Temple");
            case "valley" -> map.get("Valley");
            case "prebossregion" -> map.get("PreBossRegion");
            default -> null;
        };
    }

    public Road getRoad(){
        return (Road) getArea("road");
    }
    public NorthHill getNorthHill(){
        return (NorthHill) getArea("northhill");
    }
    public SouthHill getSouthHill(){
        return (SouthHill) getArea("southhill");
    }
    public Stream getStream(){
        return (Stream) getArea("stream");
    }
    public EastForest getEastForest(){
        return (EastForest) getArea("eastforest");
    }
    public WestForest getWestForest(){
        return (WestForest) getArea("westforest");
    }
    public House getHouse(){
        return (House) getArea("house");
    }
    public CaveEntrance getCaveEntrance(){
        return (CaveEntrance) getArea("caveentrance");
    }
    public Lake getLake(){
        return (Lake) getArea("lake");
    }
    public Graveyard getGraveyard(){
        return (Graveyard) getArea("graveyard");
    }
    public Temple getTemple(){
        return (Temple) getArea("temple");
    }
    public Valley getValley(){
        return (Valley) getArea("valley");
    }
    public PreBossRegion getPreBossRegion(){
        return (PreBossRegion) getArea("PreBossRegion");
    }
}
