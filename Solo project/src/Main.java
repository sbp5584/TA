public class Main {
    public static void main(String[] args) {
        Gold goldBar = new Gold("10");
        System.out.println(goldBar);

        Weapon sword = new Weapon("Laser Sword","A Sword with Laser", 15, 35);
        sword.setDamage(30);
        int dvalue = sword.getDamage();
        System.out.println(sword);

        Weapon pillow = new Weapon("Soft Pillow","Pillow filled with feather", 1, 1);
        pillow.setDamage(1);
        int hit = pillow.getDamage();
        System.out.println(pillow);

        Weapon mace = new Weapon("Mace","Heavier then a sword", 15, 40);
        mace.setDamage(35);
        int power = mace.getDamage();
        System.out.println(mace);

        Weapon arrow = new Weapon("Arrow","Shots from long range", 30, 50);
        arrow.setDamage(45);
        int speed = arrow.getDamage();
        System.out.println(arrow);
    }
}