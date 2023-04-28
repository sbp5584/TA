public class
BansheesRoom extends GhostRoom{
    Banshees enemy;

    public BansheesRoom(int x, int y, Banshees enemy){
        super(x,y,enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " A floating ghost is haunting you !!!";
        }else{
            return "The Ash of a dead Banshee has piled on the ground.";
        }
    }
}
