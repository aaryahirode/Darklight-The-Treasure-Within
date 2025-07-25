import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Graveyard extends Area{
    private final String name = "Graveyard";
    private final String description = """
        You enter a crumbling graveyard shrouded in fog.
        Timeworn tombstones jut out from the earth like broken teeth, and the air grows colder with each step.
        Shadows dance between the graves, and the silence is thick—unnatural.
        WEST leads back to the lake.
        Exits: WEST → Lake""";
    private final String ghost = """
        \nA faint whisper rides the wind, growing louder until a ghostly figure materializes before you.
        Its hollow eyes lock onto yours as it speaks in a voice that echoes beyond death:

        'I grow on branches, touched by sun,
        My colors range from green to red.
        I'm sliced and served, or pressed to drink,
        Yet once, I crowned a fallen head.'

        What am I?""";
    private Map<Character, String> surroundings;
    private boolean received = false;
    private final String key = "Cave Key";
    private boolean riddleShown=false;

    public Graveyard(){
        surroundings =new HashMap<>(1);
        surroundings.put('W', "Lake");
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Map<Character, String> getSurroundings() {
        return surroundings;
    }
    public boolean getReceived(){
        return received;
    }
    public String getGhost(){
        return ghost;
    }
    public boolean isRiddleShown(){
        return riddleShown;
    }
    public void addKey(Player player){
        player.addItem(key);
        received=true;
    }
    public void solve(){
        riddleShown=true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer: ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("apple")) {
            received=true;
            System.out.println("\nThe ghost nods silently and vanishes into the mist...");
        } else {
            System.out.println("\nThe ghost shrieks, 'That is not the answer!' and fades into the fog...");
        }
    }
    @Override
    public String toString() {
        System.out.println(description);
        if(!received){
            System.out.println(ghost);
            solve();
        }
        return "";
    }
}
