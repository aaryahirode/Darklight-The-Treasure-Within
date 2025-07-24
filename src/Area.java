import java.util.HashMap;
import java.util.Map;

public class Area {

    public static Map<String, Area> getArea(){
        HashMap<String, Area> map = new HashMap<>();
        map.put("Road", new Road());
        return map;
    }

}
