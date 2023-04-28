public class Spirit extends Enemy {
    private String desc;
    private int curse;
    public Spirit(String desc, int curse) {

        super("DarkSprit","Sprit can cruse you",30,10);
        this.desc = desc;
        this.curse = curse;
    }
}