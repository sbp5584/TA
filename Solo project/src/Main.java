public class Main {
    public static void main(String[] args) {
        Gold goldBar = new Gold("10");
        System.out.println(goldBar);

        Weapon sword = new Weapon("Laser Sword","A Sword with Laser", 15, 35);
        sword.setDamage(30);
        int dvalue = sword.getDamage();
        System.out.println(sword);

        Pillow featherpillow = new Pillow();
        System.out.println(featherpillow);

        Mace spikedball = new Mace();
        System.out.println(spikedball);

        Weapon arrow = new Weapon("Arrow","Shots from long range", 30, 50);
        arrow.setDamage(45);
        int speed = arrow.getDamage();
        System.out.println(arrow);

        Enemy greenOgre = new Enemy("greenOgre", 30, 20 );
        System.out.println(greenOgre);

        Enemy redOgre = new Enemy("redOgre", 30, 20);
        System.out.println(redOgre);

        Enemy slowZombie = new Enemy("SlowZombie", 20, 15);
        System.out.println(slowZombie);

        Enemy fastZombie = new Enemy("FastZombie", 20, 15);
        System.out.println(fastZombie);

        Enemy spotDog = new Enemy("SpotDog", 10, 10);
        System.out.println(spotDog);

        Enemy GiantSpider = new Enemy("GiantSpider", 10, 5);
        System.out.println(GiantSpider);

        Enemy BlackBeard = new Enemy("DarkWizard",50,20);
        System.out.println(BlackBeard);
    }

    }
