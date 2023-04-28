public class StartingRoom extends MapTile {
    public StartingRoom(int x,int y){
        super(x, y);
    }


    public String intro_text() {
        return "\n You are standing in the entrance of a dark and ominous looking house.\nThe wooden floors creak under your weight as you step inside.";
    }
    public void modify_player(Player player){

    }
}