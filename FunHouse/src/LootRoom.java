public class LootRoom extends MapTile{
    protected Item item;

    public boolean pickedItem = false;

    public LootRoom(int x, int y, Item item) {
        super(x, y);
        this.item = item;
    }

    public void addLoot(Player player) {
        player.inventory.add(item);
        pickedItem = true;
    }

    public void modify_player(Player player) {
        if (pickedItem == false) {
            addLoot(player);
        } else {
            System.out.printf("The item %s is already picked \n", item.name);
  }

}
}