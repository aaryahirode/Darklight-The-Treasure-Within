public class TestArea {
    public static void main(String[] args) {
        var gameMap = new AreaMap().map;
        gameMap.forEach((key, value)-> System.out.println(value + "\nEND OF AREA: " + key + "\n"));
    }
}