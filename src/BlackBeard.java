public class BlackBeard extends Enemy {
    private String desc;
    private int trap;
    public BlackBeard(String desc, int trap) {

        super("DarkWizard","He can lay traps",50,20);
        this.desc = desc;
        this.trap = trap;
    }
}
