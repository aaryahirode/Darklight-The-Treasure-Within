import java.util.Scanner;

class Game{
    Player player;
    AreaMap map;
    public Game(String name) {
        this.player = new Player(name);
        this.map = new AreaMap();
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
        System.out.println("Hey " + playerName + ", your journey begins now.\n");
        System.out.println("""
        ╔════════════════════════════════════════════╗
        ║        DARKLIGHT: A TEXTUAL ODYSSEY        ║
        ╚════════════════════════════════════════════╝

        The air is thick with secrets.

        You awaken in a world shrouded in mist — a place untouched by time,
        echoing with ancient whispers and unseen eyes.

        You remember nothing, except a pull... a calling...
        to seek something hidden, something powerful.
        Some say it's a treasure. Others say it's a curse.
        All agree: no one has ever returned the same.

        You will journey by words — NORTH, SOUTH, EAST, WEST —
        stepping through the unknown one decision at a time.

        Speak wisely. Observe keenly. Choose carefully.
        Items you find may aid you — or deceive you.
        Allies may not always appear as friends.

        This world reacts to your will. But it does not forgive.

        So, traveler... will you press forward into the dark?

        Type your first move — and begin.
        """);
//        PLAYER INTRO END

        var game = startGame(playerName);
        var player = game.player;
        var map = game.map;

        Area current = map.getRoad();
        System.out.println(current);
        System.out.println("Enter a direction (N,S,E,W) or Press Q to quit game.");
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
                        case "PreBossRegion" -> current = map.getPreBossRegion();
                    }
                    System.out.println(current);
                    changeStatus(current, player, map);
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

    public static void changeStatus(Area area,Player player, AreaMap map){ //BOOLEANS AUR VALUES CHANGE KARENGE. AUR TRIGGER KARENGE EVENTS AUR KYA ADD KARNA HAI INVENTORY MEIN
        if(area instanceof House house) {
            if(!house.isPickedItems()){
                house.addItems(player);
                System.out.println("\nYou picked up the Torch, Batteries, and a Letter.");
            }
        }else if(area instanceof Graveyard graveyard) {
            if(!graveyard.isRiddleShown()){
                System.out.println(graveyard.getGhost());
                graveyard.solve();
            }
            if(graveyard.getReceived() && !player.hasItem("Cave Key")){
                graveyard.addKey(player);
                System.out.println("\nAs the ghost fades, a rusty Cave Key materializes and drops to the ground. You pick it up.\n");
            }
        } else if (area instanceof NorthHill northHill){
            if(northHill.isMetChainedMonster() && !player.hasItem("Soul Ripper Sword")){
                northHill.addWeapon(player);
                System.out.println("\nYou find the Soul Ripper sword. You take it.\n");
            }
        }else if (area instanceof CaveEntrance cave) {
            if (cave.isLocked() && player.hasItem("Cave Key")) {
                cave.setLocked();
                System.out.println("\nYou use the Cave Key. The heavy gate unlocks with a loud CLANK.");
            }
            if (!cave.isLocked() && cave.isTooDark() && player.hasItem("Torch") && player.hasItem("Batteries")) {
                cave.setTooDark();
                System.out.println("\nYou put the batteries in the torch and switch it on. A bright beam cuts through the darkness.");
            }
            if (!cave.isHasSword() && player.hasItem("Soul Ripper Sword")) {
                cave.setHasSword();
            }
        }else if(area instanceof WestForest westForest) {
            westForest.enters();
        }else if(area instanceof Temple temple){
            System.out.println(temple.npcDialogue());
        }else if(area instanceof PreBossRegion preBossRegion){

//            PREBOSS REGION AND NORTHHILL CONNECTION REMAINING

            System.out.println(preBossRegion.npcDialogue(player.hasItem("Soul Ripper Sword")));
        }
    }

    public static Game startGame(String name){
        return new Game(name);
    }
}

