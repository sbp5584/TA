public class Dog extends Enemy{
    private String desc;
    private int smell_radius;
    public Dog(String desc, int smell_radius){
        super("SpotDog","Can smell blood" ,10, 10);
        this.desc = desc;
        this.smell_radius = smell_radius;
    }
}
