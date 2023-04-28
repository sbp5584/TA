public class WraithRoom extends GhostRoom{
    Wraith enemy;

    public WraithRoom(int x, int y, Wraith enemy){
        super(x,y,enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " The whole room shivers as Wraith approaches closer !!!";
        }else{
            return "Scary skeleton of a Wraith is on the ground.";
        }
    }
}