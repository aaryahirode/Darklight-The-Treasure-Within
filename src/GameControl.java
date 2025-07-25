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
//        PLAYER INFO PLUS GAME EXPLANATION
        String playerName = "";
        while(playerName.isEmpty()){
            System.out.println("Enter your name: ");
            playerName = scanner.nextLine();
        }
        playerName = String.valueOf(playerName.charAt(0)).toUpperCase() + playerName.substring(1).toLowerCase();
        System.out.println("Hey " + playerName); // IDHAR ADD KAR
//        PLAYER INTRO END

        var game = startGame(playerName);
        var player = game.player;
        var map = game.map;

        Area current = map.getRoad();
        System.out.println(current);
        System.out.println("Press Q to quit game.");
        Character input = 'A';
        while(input!='q'){
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
                    changeStatus(current);
                    System.out.println(current);
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

    public static void changeStatus(Area area){ //BOOLEANS AUR VALUES CHANGE KARENGE. AUR TRIGGER KARENGE EVENTS AUR KYA ADD KARNA HAI INVENTORY MEIN
        if(area instanceof Road road){
            return;
        }else if(area instanceof EastForest eastForest){
            return;
        }else if(area instanceof SouthHill southHill){
            return;
        }else if(area instanceof Valley valley){
            return;
        }else if(area instanceof Stream stream){
            return;
        }else if(area instanceof WestForest westForest){
            westForest.enters();
        }else if(area instanceof Lake lake){
            return;
        } else if(area instanceof Temple temple) {
            temple.npcDialogue();
        }
        else{

        }
    }

    public static void checkStatus(Area area){ //IDHAR BOOLEAN CHECK KARENGE KI AGAR NPC SE MILA TOH HE HE CAN GET SWORD TYPE

    }


    public static Game startGame(String name){
        return new Game(name);
    }
}

