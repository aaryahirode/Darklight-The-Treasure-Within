import java.util.Scanner;

class Game{
    Player player;
    AreaMap map;
    public Game(String name) {
        this.player = new Player(name);
        map = new AreaMap();
    }
}

public class GameControl{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();
        var game = startGame(playerName);

        var player = game.player;
        var map = game.map;

        Area current = map.getRoad();

        System.out.println("Press Q to quit game.");
        Character input = 'A';
        while(input!='q'){
            System.out.println(current);
            input = scanner.nextLine().toUpperCase().charAt(0);
            if("NESW".contains(String.valueOf(input))){
                String move = current.getSurroundings().get(input);
                if(move==null){
                    System.out.println(current);
                    continue;
                }else{
                    switch(move){
                        case "Road" -> current = map.getRoad();
                        case "NorthHill" -> current = map.getNorthHill();
                        case "SouthHill" -> current = map.getSouthHill();
                        case "Stream" -> current = map.getStream();
                        case "EastForest" -> current = map.getEastForest();
                        case "WestForest" -> current = map.getWestForest();
                        case "House" -> current = map.getHouse();
                        case "CaveEntrance" -> current = map.getCaveEntrance();
                        case "Lake" -> current = map.getLake();
                        case "Graveyard" -> current = map.getGraveyard();
                        case "Temple" -> current = map.getTemple();
                        case "Valley" -> current = map.getValley();
                    }
                }
            }else {
                if(input=='Q'){
                    System.out.println("Thank you for trying out game!");
                    break;
                }else{
                    System.out.println("Select a valid direction.");
                }
            }
        }
    }

    public static Game startGame(String name){
        return new Game(name);
    }
}

