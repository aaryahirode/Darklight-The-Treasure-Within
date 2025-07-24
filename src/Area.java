import java.util.HashMap;
import java.util.Map;

public class Area {

    public static Map<String, Area> getArea(){
        HashMap<String, Area> map = new HashMap<>();
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
        return map;
    }

}
