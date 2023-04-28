public class SpiritRoom extends GhostRoom{
    Spirit enemy;

    public SpiritRoom(int x, int y, Spirit enemy){
        super(x,y,enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return " A glowing Spirit is going berserk !!!";
        }else{
            return "The shadow of a glowing Spirit is on the ground.";
        }
    }
}