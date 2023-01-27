public class Gold extends Item{
    private int amt;

    public Gold(String amt){
        super("gold bar", "Golden Nugget", 50);
        this.amt = Integer.parseInt(amt);


    }
}