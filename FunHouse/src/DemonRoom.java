public class DemonRoom extends GhostRoom{
    Demon enemy;

    public DemonRoom(int x, int y, Demon enemy){
        super(x,y,enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " A Giant Demon is going berserk the whole room shivers as it approaches !!!";
        }else{
            return "The Ash of a dead Demon piled on the ground.";
        }
    }
}