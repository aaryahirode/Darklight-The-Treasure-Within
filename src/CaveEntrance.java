public class CaveEntrance extends Area{
    private String name = "Cave";
    private String description = """
            You are in a small chamber just below the grate.
            Piles of loose rock and debris lie scattered around.
            A narrow passage leads down into the darkness, while the only way back is UP through the grate.
            Exits:
            NORTH → Cave Entrance (Grate)
            SOUTH → Tunnel deeper into the cave
            """;
    private boolean locked = true;
    private boolean tooDark = true;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public boolean isLocked() {
        return locked;
    }

    public void setLocked() {
        this.locked = true;
    }
    public boolean isTooDark() {
        return tooDark;
    }
    public void setTooDark() {
        this.tooDark = true;
    }

    @Override
    public String toString() {
        if(!locked && !tooDark){
            return description;
        } else if (locked) {
            this.locked();
        }else{
            this.tooDark();
        }
        return null;
    }

    public void locked(){
        System.out.println("""
                You are standing before a large cave.
                Cool air drifts up from the darkness below, carrying a faint smell of damp stone.
                The stream you followed disappears into a crack beside the grate.
                The grate is locked, but you can see a narrow passage leading downward into the cave beyond. You’ll need a key to unlock it.""");
    }

    public void tooDark(){
        System.out.println("""
                You have unlocked the heavy iron grate. It revealS a steep passage slanting down into pitch-black darkness.
                A cold draft rises from below, carrying the smell of damp earth. You can barely see a few feet into the opening.
                It’s far too dark to proceed without a light source.
                Exits:
                NORTH → Stream
                DOWN → CANNOT ENTER. FIND A TORCH""");
    }


}
