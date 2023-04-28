public class SanityPill extends Item {
    public int sanity_regen;
    private int uses;

    public SanityPill(String name, int uses) {
        super(name,uses);
        this.uses = uses;
    }



    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public void use() {
        if (uses > 0) {
            System.out.println("You take a " + name + " and feel slightly more sane.");
            uses--;
        } else {
            System.out.println("You don't have any " + name + "s left.");
        }
    }
}
