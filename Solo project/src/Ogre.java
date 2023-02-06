public class Ogre extends Enemy {
    private String color;
    private String spit;
    public Ogre(String color, String spit){
        super("Ogre","Spit" ,30, 20 );
        this.color = color;
        this.spit = spit;

    }
}
