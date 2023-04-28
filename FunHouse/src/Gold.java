public class Gold extends Item{
    public int amt;

    public Gold(int amt){
        super("gold bar", "Golden Nugget", 10);
        this.amt = Integer.parseInt(String.valueOf(amt));


    }

    public int getAmt() {
        return amt;
    }
}