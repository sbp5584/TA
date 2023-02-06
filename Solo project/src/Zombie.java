public class Zombie extends Enemy{
    private int Speed;

    public Zombie(int Speed){
        super("Zombie","Velocity" ,20, 15);
        this.Speed = Speed;
    }

}
