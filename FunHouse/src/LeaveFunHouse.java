public class LeaveFunHouse extends MapTile {

    private String description;

    public LeaveFunHouse(int x, int y) {
        super(x, y);
        description = "You have safely made it out of 'Fun House' with all the loot from the vault";
    }
    public String intro_text(){
        return description;

    }
    public void modify_player(Player player){
        player.victory=true;

}


}