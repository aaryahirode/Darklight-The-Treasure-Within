public class TestArea {
    public void main(String[] args) {
        var gameMap = Area.getArea();
        gameMap.forEach((key, value)-> System.out.println(value + "\nEND OF AREA: " + key));
    }
}