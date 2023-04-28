public class Enemy {
    protected String name;

    protected String desc;
    protected int hp;
    protected int damage;
    public Enemy(String name,String desc, int hp, int damage){
        this.name = name;
        this.desc = desc;
        this.hp = hp;
        this.damage = damage;
    }
    public boolean is_alive(){
        return (this.hp > 0);
    }
    public String toString(){
        return String.format("%s \n=====\n %s \nValue= %d \n", this.name, this.desc, this.hp, this.damage);
    }
}