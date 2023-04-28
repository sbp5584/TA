public class TreasureRoom extends LootRoom {
    public TreasureRoom(int x, int y, Gold gold) {
        super(x, y, gold);
    }

    public String intro_text() {
        if (pickedItem == false)
            return String.format("Nice, you got 10 gold coins.\nYou collect the coin.\n");
        else
            return"";
}
}