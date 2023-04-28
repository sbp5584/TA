public class EmptyHallWay extends MapTile {

    private String description;

    public EmptyHallWay(int x, int y) {
        super(x, y);
        description = "An empty hallway dimly-lit, eerie space with creaking floorboards, rusted walls, and a haunting atmosphere that suggests the presence of supernatural entities.";
    }
    public String intro_text() {
        return description;

    }

    @Override
    public void modify_player(Player player) {

    }
}
